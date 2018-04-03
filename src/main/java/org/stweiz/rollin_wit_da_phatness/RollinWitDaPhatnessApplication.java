package org.stweiz.rollin_wit_da_phatness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = {RollinWitDaPhatnessApplication.class})
@Import({
    // Manual importation for speeding up spring-boot startup-time
    // https://alexecollins.com/spring-boot-performance/
    DispatcherServletAutoConfiguration.class,
    ErrorMvcAutoConfiguration.class,
    HttpMessageConvertersAutoConfiguration.class,
    PropertyPlaceholderAutoConfiguration.class,
    ServletWebServerFactoryAutoConfiguration.class,
    WebMvcAutoConfiguration.class})
public class RollinWitDaPhatnessApplication {

    public static void main(final String[] args) {
        SpringApplication.run(RollinWitDaPhatnessApplication.class, args);
    }
}
