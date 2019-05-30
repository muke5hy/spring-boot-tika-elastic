package com.mukeshyadav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This is is a simple configuration class and enables the auto configuration support
 * of Spring Boot and starts the example application.
 *
 * @author Mukesh Yadav
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
class WordToHtmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordToHtmlApplication.class, args);
    }
}
