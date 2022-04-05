package com.bhaskarmantrala.hub.springbootfoundation.beanaware.beanfactoryaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author venkata.mantrala
 */
public class BeanFactoryAwareBean implements BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public boolean isSingleton(String beanName) {
        System.out.println("getNameAwareBean is Singleton bean? " + beanFactory.isSingleton(beanName));
        return beanFactory.isSingleton(beanName);
    }

    public Class<?> getBeanType(String beanName) {
        System.out.println("getNameAwareBean getType? " + beanFactory.getType(beanName));
        return beanFactory.getType(beanName);
    }

    public boolean containsBean(String beanName) {
        System.out.println("getNameAwareBean containsBean? " + beanFactory.containsBean(beanName));
        return beanFactory.containsBean(beanName);
    }
}
