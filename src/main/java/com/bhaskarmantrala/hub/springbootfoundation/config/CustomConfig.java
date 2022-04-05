package com.bhaskarmantrala.hub.springbootfoundation.config;

import com.bhaskarmantrala.hub.springbootfoundation.model.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author venkata.mantrala
 */
@Configuration
@PropertySource("classpath:${target_env}_custom.properties")
public class CustomConfig {

    @Autowired
    Environment environment;

    @Bean
    public Source getSource() {
        return new Source(environment.getProperty("source"));
    }

}
