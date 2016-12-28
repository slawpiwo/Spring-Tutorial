package com.xcafe.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // running program without Spring
        // Person person = new Person();
        // person.sayHello();

        //running program with Spring
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("beans.xml");
        Person person = (Person) appCtx.getBean("person");
        person.sayHello();

        ((FileSystemXmlApplicationContext) appCtx).close();
    }
}
