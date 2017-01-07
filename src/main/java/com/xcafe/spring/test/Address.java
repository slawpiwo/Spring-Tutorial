package com.xcafe.spring.test;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address {

    private String street;
    private int houseNumber;
    private String postcode;

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    // @Required allows you to instruct Spring to check required dependencies for you
    @Required
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @PostConstruct
    public void init() {
        System.out.println("Address object has been initialized: " + this);
    }

    /*
     * The destroy-method: onDestroy is only called if and only if the bean is a singleton instance
     */
    @PreDestroy
    public void destroy() {
        // do some destruction work (like releasing pooled connections)
        System.out.println("Address object has been destroyed.");
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("street", street)
                .append("houseNumber", houseNumber)
                .append("postcode", postcode)
                .toString();
    }
}
