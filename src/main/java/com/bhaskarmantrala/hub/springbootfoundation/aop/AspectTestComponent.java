package com.bhaskarmantrala.hub.springbootfoundation.aop;

import com.bhaskarmantrala.hub.springbootfoundation.aop.components.DAOComponent;
import com.bhaskarmantrala.hub.springbootfoundation.config.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author venkata.mantrala
 */
@Component
public class AspectTestComponent {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        DAOComponent daoComponent = context.getBean(DAOComponent.class);
        daoComponent.saveEmployee();
        System.out.println("\n\n\n*************************************************\n\n\n");
        daoComponent.saveEmployeeWithException();
    }
}
