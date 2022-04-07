package com.bhaskarmantrala.hub.springbootfoundation;

import com.bhaskarmantrala.hub.springbootfoundation.aop.components.DAOComponent;
import com.bhaskarmantrala.hub.springbootfoundation.config.BeanConfiguration;
import com.bhaskarmantrala.hub.springbootfoundation.config.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
public class SpringBootFoundationApplication {

	public static void main(String[] args) {
		System.setProperty("target_env", "qa");
		SpringApplication.run(SpringBootFoundationApplication.class, args);
	}

}
