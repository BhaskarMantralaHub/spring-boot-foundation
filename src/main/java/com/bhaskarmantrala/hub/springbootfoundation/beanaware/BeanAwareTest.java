package com.bhaskarmantrala.hub.springbootfoundation.beanaware;

import com.bhaskarmantrala.hub.springbootfoundation.beanaware.beanfactoryaware.BeanFactoryAwareBean;
import com.bhaskarmantrala.hub.springbootfoundation.beanaware.beannameaware.BeanNameAwareBean;
import com.bhaskarmantrala.hub.springbootfoundation.beanaware.beannameaware.BeanNameAwareConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author venkata.mantrala
 */
public class BeanAwareTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanNameAwareConfig.class);
        //BeanNameAwareBean constructor is called
        //Bean names inside BeanNameAwareTest is getNameAwareBean
        BeanNameAwareBean beanNameAwareBean = context.getBean(BeanNameAwareBean.class);
        String beanName = beanNameAwareBean.getBeanName();

        BeanFactoryAwareBean beanFactoryAwareBean = context.getBean(BeanFactoryAwareBean.class);
        System.out.println(beanFactoryAwareBean.isSingleton(beanName));


        System.out.println("Bean Type is " + beanFactoryAwareBean.getBeanType(beanName));


        System.out.println("BeanFactory contains " + beanName + " bean? " + beanFactoryAwareBean.containsBean(beanName));
        System.out.println("BeanFactory contains FAKE_BEAN bean? " + beanFactoryAwareBean.containsBean("FAKE_BEAN"));
    }

}
