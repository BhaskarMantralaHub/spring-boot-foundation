package com.bhaskarmantrala.hub.springbootfoundation.aop.aspects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author venkata.mantrala
 */
@Aspect
@Component
@Log4j2
public class DAOAspectComponent {

    //* - public void (could be anything)
    //Package name
    //Class name or *
    //Method name or *
    //Method parameters or () => no params or (..) => zero or any params
    @Pointcut("execution(* com.bhaskarmantrala.hub.springbootfoundation.aop.components.DAOComponent.*(..))")
//    @Pointcut("execution(public void com.bhaskarmantrala.hub.springbootfoundation.aop.components.DAOComponent.saveEmployee())")
    public void daoPointCut() {}

    @Before("daoPointCut()")
    public void initialAdvice() {
        log.info("Initiating DAO object");
    }

    @After("daoPointCut()")
    public void postAdvice() {
        log.info("Destroying DAO object");
    }

    @AfterReturning("daoPointCut()")
    public void postSuccessfulAdvice() {
        log.info("DAO operations are successful!");
    }

    @AfterThrowing("daoPointCut()")
    public void postFailedAdvice() {
        log.info("DAO operations are Failed!");
    }

    @Around("daoPointCut()")
    public Object logRequestResponseOfTargetMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String targetClass = proceedingJoinPoint.getTarget().getClass().getName();
        String targetMethod = proceedingJoinPoint.getSignature().getName();
        String targetMethodArgs = new ObjectMapper().writeValueAsString(proceedingJoinPoint.getArgs());
        log.info(String.format("%s - targetMethod with args - %s, invoked by Class: %s", targetMethod, targetMethodArgs, targetClass));

        Object targetMethodResponseObj = proceedingJoinPoint.proceed();
        String targetMethodResponse = new ObjectMapper().writeValueAsString(targetMethodResponseObj);
        log.info(String.format("%s - targetMethod with args - %s, invoked by Class: %s, response is - %s", targetMethod, targetMethodArgs, targetClass, targetMethodResponse));
        return targetMethodResponseObj;
    }

}
