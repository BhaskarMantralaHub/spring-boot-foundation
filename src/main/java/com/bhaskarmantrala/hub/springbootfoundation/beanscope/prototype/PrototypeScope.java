package com.bhaskarmantrala.hub.springbootfoundation.beanscope.prototype;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author venkata.mantrala
 */
@Log4j2
public class PrototypeScope {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrototypeConfiguration.class);
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
//        16:28:12.443 [main] INFO com.bhaskarmantrala.hub.springbootfoundation.beanscope.prototype.PrototypeScope - 0
//        16:28:12.443 [main] INFO com.bhaskarmantrala.hub.springbootfoundation.beanscope.prototype.PrototypeScope - null
        log.info(prototypeBean.getAge());
        log.info(prototypeBean.getName());
        prototypeBean.setAge(30); //No effect on new prototype object

        //Prototype Bean must be the component for this to take effect
        //getBean gives a new object for the prototype scope
        //changes should not reflect
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//        16:28:12.443 [main] INFO com.bhaskarmantrala.hub.springbootfoundation.beanscope.prototype.PrototypeScope - 0
//        16:28:12.443 [main] INFO com.bhaskarmantrala.hub.springbootfoundation.beanscope.prototype.PrototypeScope - null
        log.info(prototypeBean1.getAge()); //0
        log.info(prototypeBean1.getName());
    }
}
