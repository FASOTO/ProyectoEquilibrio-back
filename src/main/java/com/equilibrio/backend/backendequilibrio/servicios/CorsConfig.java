package com.equilibrio.backend.backendequilibrio.servicios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer mvcConfigurer() {
        return new WebMvcConfigurer() {
            
            @Override
            public void addCorsMappings(@NonNull CorsRegistry registry) {
                registry.addMapping("/**") // todo endpoint
                        .allowedOrigins("http://localhost:4200") // el de Angular
                        .allowedMethods("*") // GET, POST, PUT, etc.
                        .allowedHeaders("*");
            }
        };
    }
}