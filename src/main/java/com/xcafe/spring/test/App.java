package com.xcafe.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // running program without Spring
        // Person person = new Person();
        // person.sayHello();

        //running program with Spring
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) appCtx.getBean("person");
        System.out.println("Person: " + person + " is saying: ");
        person.sayHello();


        ((ClassPathXmlApplicationContext) appCtx).close();
    }
}
