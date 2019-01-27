package es.binarycode.gesclas.date;

import org.joda.time.DateTimeZone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.binarycode.gesclas.services.DateService;
import es.binarycode.gesclas.services.DateServiceImpl;

@Configuration
public class DateServiceConfig {

  @Bean
  DateService dateService() {
    return new DateServiceImpl(defaultTimeZone());
  }

  @Bean
  DateTimeZone defaultTimeZone() {
    return DateTimeZone.UTC;
  }
}
