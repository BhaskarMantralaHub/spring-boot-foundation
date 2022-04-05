package com.bhaskarmantrala.hub.springbootfoundation.beanscope.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author venkata.mantrala
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope(scopeName = "prototype")
public class PrototypeBean {

    private String name;
    private int age;

}
