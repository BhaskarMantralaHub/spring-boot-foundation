package com.bhaskarmantrala.hub.springbootfoundation.beanscope.singleton;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author venkata.mantrala
 */
@Log4j2
public class SingletonDefaultScope {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingletonConfiguration.class);
        SingletonBean singletonBean = context.getBean(SingletonBean.class);
//        16:24:41.532 [main] INFO com.bhaskarmantrala.hub.springbootfoundation.beanscope.singleton.SingletonDefaultScope - 28
//        16:24:41.532 [main] INFO com.bhaskarmantrala.hub.springbootfoundation.beanscope.singleton.SingletonDefaultScope - Bhaskar
        log.info(singletonBean.getAge()); //28
        log.info(singletonBean.getName());
        singletonBean.setAge(30);

        //changes should reflect
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//        16:24:41.532 [main] INFO com.bhaskarmantrala.hub.springbootfoundation.beanscope.singleton.SingletonDefaultScope - 30
//        16:24:41.532 [main] INFO com.bhaskarmantrala.hub.springbootfoundation.beanscope.singleton.SingletonDefaultScope - Bhaskar
        log.info(singletonBean1.getAge()); //30
        log.info(singletonBean1.getName());
    }
}
