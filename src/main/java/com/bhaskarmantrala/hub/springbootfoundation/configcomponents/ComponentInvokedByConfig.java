package com.bhaskarmantrala.hub.springbootfoundation.configcomponents;

import com.bhaskarmantrala.hub.springbootfoundation.config.CustomConfig;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author venkata.mantrala
 */
@Component
public class ComponentInvokedByConfig implements BeanNameAware {

    @Autowired
    Environment environment;

    public String invokedBy() {
        return System.getProperty("invokedBy");
    }

    //pre-method to run before bean creation
    @Override
    public void setBeanName(String s) {
        System.setProperty("invokedBy", "Bean Configuration");
    }
}
