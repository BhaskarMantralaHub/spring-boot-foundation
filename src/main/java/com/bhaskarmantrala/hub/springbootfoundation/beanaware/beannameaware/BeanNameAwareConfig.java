package com.bhaskarmantrala.hub.springbootfoundation.beanaware.beannameaware;

import com.bhaskarmantrala.hub.springbootfoundation.beanaware.beanfactoryaware.BeanFactoryAwareBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author venkata.mantrala
 */
@Configuration
public class BeanNameAwareConfig {

    @Bean
    BeanNameAwareBean getNameAwareBean() {
        return new BeanNameAwareBean();
    }

    @Bean
    BeanFactoryAwareBean getBeanFactoryBean() {
        return new BeanFactoryAwareBean();
    }
}
