package com.bhaskarmantrala.hub.springbootfoundation.beanaware.beannameaware;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @author venkata.mantrala
 */
@Getter
@Setter
@AllArgsConstructor
public class BeanNameAwareBean implements BeanNameAware {

    private String beanName;

    public BeanNameAwareBean() {
        System.out.println("BeanNameAwareBean constructor is called");
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name inside BeanNameAwareTest is " + beanName);
        this.beanName = beanName;
    }

}
