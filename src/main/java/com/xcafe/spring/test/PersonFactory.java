package com.xcafe.spring.test;

/*
 * A FactoryBean is a pattern to encapsulate interesting object construction logic in a class.
 * Often this is used to construct complex objects that have many dependencies.
 * It might also be used when the construction logic itself is highly volatile and depends on the configuration.
 * https://spring.io/blog/2011/08/09/what-s-a-factorybean
 */
public class PersonFactory {

    public Person createPerson(int id, String name) {
        System.out.println("Using factory to create Person.");
        return new Person(id, name);
    }
}
