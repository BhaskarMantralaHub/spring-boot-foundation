package com.bhaskarmantrala.hub.springbootfoundation.beanscope.singleton;

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
@Scope(scopeName = "singleton")
public class SingletonBean {

    private String name;
    private int age;

}
