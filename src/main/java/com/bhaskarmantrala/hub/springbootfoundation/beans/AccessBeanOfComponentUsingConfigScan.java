package com.bhaskarmantrala.hub.springbootfoundation.beans;

import com.bhaskarmantrala.hub.springbootfoundation.config.BeanConfiguration;
import com.bhaskarmantrala.hub.springbootfoundation.config.CustomConfig;
import com.bhaskarmantrala.hub.springbootfoundation.configcomponents.ComponentInvokedByConfig;
import com.bhaskarmantrala.hub.springbootfoundation.model.Offer;
import com.bhaskarmantrala.hub.springbootfoundation.model.Source;
import com.bhaskarmantrala.hub.springbootfoundation.model.TestBean;
import com.bhaskarmantrala.hub.springbootfoundation.mycomponents.DisbursementComponent;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

/**
 * @author venkata.mantrala
 */
@Log4j2
public class AccessBeanOfComponentUsingConfigScan {

    public static void main(String[] args) {
        System.setProperty("target_env", "qa");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        //Set component base package for component scan in BeanConfiguration.Java
        ComponentInvokedByConfig componentInvokedByConfig = context.getBean(ComponentInvokedByConfig.class);
        log.info("componentInvokedByConfig.invokedBy() - " + componentInvokedByConfig.invokedBy());


        //Bean defined in Configuration
        Offer offer = context.getBean(Offer.class);
        log.info(offer.toString());

        TestBean testBean = context.getBean(TestBean.class);
        log.info(testBean.toString());

        ApplicationContext customContext = new AnnotationConfigApplicationContext(CustomConfig.class);
        Source source = customContext.getBean(Source.class);
        log.info(source);
    }
}
