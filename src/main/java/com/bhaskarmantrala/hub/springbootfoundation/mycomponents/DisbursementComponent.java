package com.bhaskarmantrala.hub.springbootfoundation.mycomponents;

import org.springframework.stereotype.Component;

/**
 * @author venkata.mantrala
 */
@Component
public class DisbursementComponent {

    public String getDisbursementMethod() {
        return "ONLINE";
    }

}
