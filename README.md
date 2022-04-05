# spring-boot-foundation

# **Beans**

Get class objects (Singleton) from two containers:
1. Application Context
2. Bean Factory

Application context extends Bean factory.

Application Context:

From resources/<spring>.xml file

```
XML file
<beans>
//class with no properties
<bean class="classpath" id="uniqueID"> </bean>

//class with properties
//Property or class variables
<bean class="classpath" id="classWithProperties">
<property name="propertyName" value="propertyValue"></property>
</bean>

//class with properties and constructor
<bean class="classpath" id="classWithProperties">
<constructor-arg value="propertyValue"></constructor-arg>
</bean>

//class with property as another class
<bean class="classpath" id="classWithProperties">
<property name="propertyObjectName" ref="classObjectBeanUniqueID"></property>
</bean>
</beans>


```

```
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
ClassName className = context.getBean(ClassName.class);
(OR)
ClassName className = (ClassName) context.getBean("uniqueID")
```