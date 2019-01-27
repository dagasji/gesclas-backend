package es.binarycode.gesclas.config;

import static java.util.Objects.requireNonNull;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.OrRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
class SecurityConfig extends WebSecurityConfigurerAdapter {
	private static final RequestMatcher PUBLIC_URLS = new OrRequestMatcher(new AntPathRequestMatcher("/public/**"));
//	private static final RequestMatcher PROTECTED_URLS = new OrRequestMatcher(new AntPathRequestMatcher("/private*"));
	private static final RequestMatcher PROTECTED_URLS = new OrRequestMatcher(new AntPathRequestMatcher("/private/**"));

	TokenAuthenticationProvider provider;

	SecurityConfig(final TokenAuthenticationProvider provider) {
		super();
		this.provider = requireNonNull(provider);
	}

	@Override
	protected void configure(final AuthenticationManagerBuilder auth) {
		auth.authenticationProvider(provider);
	}

	@Override
	public void configure(final WebSecurity web) {
		web.ignoring().requestMatchers(PUBLIC_URLS);
		web.ignoring()
	        .antMatchers(HttpMethod.OPTIONS,"/**");
	}

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		/*http.sessionManagement().sessionCreationPolicy(STATELESS).and().exceptionHandling()
				// this entry point handles when you request a protected page and you are not
				// yet
				// authenticated
				.defaultAuthenticationEntryPointFor(forbiddenEntryPoint(), PROTECTED_URLS).and()
				.authenticationProvider(provider)
				.addFilterBefore(restAuthenticationFilter(), AnonymousAuthenticationFilter.class).authorizeRequests()
				.requestMatchers(PROTECTED_URLS).authenticated().and().csrf().disable().formLogin().disable().httpBasic().disable()
				.logout().disable().cors().configurationSource(corsConfigurationSource());
		*/
		http.sessionManagement().sessionCreationPolicy(STATELESS).and().exceptionHandling()
		// this entry point handles when you request a protected page and you are not
		// yet
		// authenticated
		.defaultAuthenticationEntryPointFor(forbiddenEntryPoint(), PROTECTED_URLS).and()
		.authenticationProvider(provider)
		.addFilterBefore(restAuthenticationFilter(), AnonymousAuthenticationFilter.class);		
		
		//INICIO CONFIGURACION URL'S
		
		//Ahora mismo está configurado para que tengas que tener el ROL ADMIN para acceder
		//a /private/driver/**, pero al resto de urls dentro de /private puede acceder unicamente 
		//estando autenticado
		
		//Lo reglas mas especificas y probablemente mas restrictiva tiene que estar primero
		//con esta linea decimos que a esta url solo accedera si tiene el role_admin
		http.authorizeRequests().antMatchers("/private/driver/**").access("hasRole('ROLE_ADMIN')");
		http.authorizeRequests().antMatchers("/private/vehicle/*All*").hasRole("ADMIN");
		
		//con esta linea decimos que tiene acceso a las paginas de dicho path si está autenticado
		http.authorizeRequests().requestMatchers(PROTECTED_URLS).authenticated();
		
		//INICIO CONFIGURACION URL'S
			
		http.csrf().disable();
		http.formLogin().disable();
		http.httpBasic().disable();
		http.logout().disable();
		http.cors().configurationSource(corsConfigurationSource());
		
		
	}

	@Bean
	TokenAuthenticationFilter restAuthenticationFilter() throws Exception {
		final TokenAuthenticationFilter filter = new TokenAuthenticationFilter(PROTECTED_URLS);
		filter.setAuthenticationManager(authenticationManager());
		filter.setAuthenticationSuccessHandler(successHandler());
		return filter;
	}

	@Bean
	SimpleUrlAuthenticationSuccessHandler successHandler() {
		final SimpleUrlAuthenticationSuccessHandler successHandler = new SimpleUrlAuthenticationSuccessHandler();
		successHandler.setRedirectStrategy(new NoRedirectStrategy());
		return successHandler;
	}

	/**
	 * Disable Spring boot automatic filter registration.
	 */
	@Bean
	FilterRegistrationBean disableAutoRegistration(final TokenAuthenticationFilter filter) {
		final FilterRegistrationBean registration = new FilterRegistrationBean(filter);
		registration.setEnabled(false);
		return registration;
	}

	@Bean
	AuthenticationEntryPoint forbiddenEntryPoint() {
		return new HttpStatusEntryPoint(FORBIDDEN);
	}
	
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("*"));
		configuration.setAllowedMethods(Arrays.asList("*"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
}