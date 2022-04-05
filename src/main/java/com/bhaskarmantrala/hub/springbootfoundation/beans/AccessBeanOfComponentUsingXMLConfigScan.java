package com.bhaskarmantrala.hub.springbootfoundation.beans;

import com.bhaskarmantrala.hub.springbootfoundation.configcomponents.ComponentInvokedByConfig;
import com.bhaskarmantrala.hub.springbootfoundation.mycomponents.DisbursementComponent;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author venkata.mantrala
 */
@Log4j2
public class AccessBeanOfComponentUsingXMLConfigScan {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanFactory.xml");
        //Set component base package for component scan in .xml file
        DisbursementComponent disbursementComponent = context.getBean(DisbursementComponent.class);
        log.info(disbursementComponent.getDisbursementMethod());
    }
}
