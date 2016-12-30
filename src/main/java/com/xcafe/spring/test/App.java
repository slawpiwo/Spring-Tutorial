package com.xcafe.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person) appCtx.getBean("person");
        person.setAge(99);
        System.out.println("Person: " + person);

        Organizer organizer = (Organizer) appCtx.getBean("organizer");
        System.out.println("Organizer ::: " + organizer);

        ((ClassPathXmlApplicationContext) appCtx).close();
    }
}
