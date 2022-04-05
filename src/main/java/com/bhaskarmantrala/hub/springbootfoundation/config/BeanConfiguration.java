package com.bhaskarmantrala.hub.springbootfoundation.config;

import com.bhaskarmantrala.hub.springbootfoundation.model.Offer;
import com.bhaskarmantrala.hub.springbootfoundation.model.Source;
import com.bhaskarmantrala.hub.springbootfoundation.model.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Date;

/**
 * @author venkata.mantrala
 */
@Configuration
@ComponentScan(basePackages = "com.bhaskarmantrala.hub.springbootfoundation.configcomponents")
@PropertySource("classpath:qa_custom.properties")
public class BeanConfiguration {

    @Autowired
    Environment environment;

    @Bean
    public Offer offerBean() {
        return new Offer(1234, new Date(), 45466);
    }

    @Bean
    public TestBean testBean() {
        return new TestBean("Bhaskar");
    }

}
