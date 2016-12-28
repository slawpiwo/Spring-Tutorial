package com.xcafe.spring.test;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
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
                .toString();
    }
}
