package com.bhaskarmantrala.hub.springbootfoundation.beans;

import com.bhaskarmantrala.hub.springbootfoundation.model.Loan;
import com.bhaskarmantrala.hub.springbootfoundation.model.Payment;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author venkata.mantrala
 */
@Log4j2
public class AccessBeanFromApplicationContext {

    public static void main(String[] args) {
        //XML file under resources directory
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanFactory.xml");

        Loan loan = context.getBean(Loan.class);
        log.info(loan);

        Payment payment = context.getBean(Payment.class);
        log.info(payment);
    }
}
