package com.bhaskarmantrala.hub.springbootfoundation.beanscope.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author venkata.mantrala
 */
@Configuration
public class SingletonConfiguration {

    @Bean
    public SingletonBean getSingletonBean() {
        return new SingletonBean("Bhaskar", 28);
    }
}
