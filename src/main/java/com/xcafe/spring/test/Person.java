package com.xcafe.spring.test;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {

    private int id;
    private String name;
    private int age;
    private Address address;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // static factory method
    public static Person getInstance(int id, String name) {
        if (id > 0) {
            System.out.println("Creating Person using factory method.");
            return new Person(id, name);
        } else {
            throw new IllegalArgumentException("Incorrect id of person.");
        }
    }

    /*
     * When you use setter-based dependency injection, the init-method makes it possible to perform initialization:
     * the specified method will be called after all the setters have been called.
     */
    @PostConstruct
    public void onInit() {
        // check required dependencies
        if (address == null) {
            throw new IllegalStateException("Address must be set in order for service to work");
        }
        System.out.println("Person object has been initialized: " + this);
    }

    /*
     * The destroy-method: onDestroy is only called if and only if the bean is a singleton instance
     */
    @PreDestroy
    public void onDestroy() {
        // do some destruction work (like releasing pooled connections)
        System.out.println("Person object has been destroyed.");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void sayHello() {
        System.out.println("Hello, I am " + name);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("age", age)
                .append("address", address)
                .toString();
    }
}
