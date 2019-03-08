package com.baeldung.um.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan({ "com.baeldung.um.web" })
@EnableWebMvc
public class UmWebConfig implements WebMvcConfigurer {

    public UmWebConfig() {
        super();
    }
}
