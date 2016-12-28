package com.xcafe.spring.test;


import org.apache.commons.lang3.builder.ToStringBuilder;

public class Address {

    private String street;
    private int houseNumber;
    private String postcode;

    public Address(String street, int houseNumber, String postcode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postcode = postcode;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
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
