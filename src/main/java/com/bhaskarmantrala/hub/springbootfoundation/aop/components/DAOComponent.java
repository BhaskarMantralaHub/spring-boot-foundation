package com.bhaskarmantrala.hub.springbootfoundation.aop.components;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author venkata.mantrala
 */
@Component
@Log4j2
public class DAOComponent {

    public void saveEmployee() {
        log.info("Saving employee to DB. Emp ID: " + 12333);
    }

    public void saveEmployeeWithException() {
        throw new IllegalArgumentException("saveEmployeeWithException");
    }
}
