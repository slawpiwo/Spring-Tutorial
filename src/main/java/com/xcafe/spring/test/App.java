package com.xcafe.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");

        // the same bean (singleton)
        Person person1 = (Person) appCtx.getBean("person");
        Person person2 = (Person) appCtx.getBean("person");
        person1.setAge(99);
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        // different beans (prototype)
        Address address1 = (Address) appCtx.getBean("address");
        Address address2 = (Address) appCtx.getBean("address");
        address1.setHouseNumber(99);
        System.out.println("Address 1: " + address1);
        System.out.println("Address 2: " + address2);

        ((ClassPathXmlApplicationContext) appCtx).close();
    }
}
