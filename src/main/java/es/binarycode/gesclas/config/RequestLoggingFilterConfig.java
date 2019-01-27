package es.binarycode.gesclas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

/**
 * Configura el filtro de request. Sirve para configurar los datos que se mostrarán al 
 * recibir una nueva petición
 * @author Dani
 *
 */
@Configuration
public class RequestLoggingFilterConfig {

    @Bean
    public CommonsRequestLoggingFilter logFilter() {
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
        
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true); //muestra los parametros del body
        filter.setMaxPayloadLength(10000);
        filter.setIncludeHeaders(false);//muestra los datos de cabecera
        filter.setAfterMessagePrefix("REQUEST DATA : ");
                
        return filter;
    }
}