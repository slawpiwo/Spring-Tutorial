package com.xcafe.spring.test;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;

public class WeekOrganizer {

    private Person person;
    private Map<String, Organizer> week;

    public WeekOrganizer(Person person, Map<String, Organizer> week) {
        this.person = person;
        this.week = week;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("person", person)
                .append("week", week)
                .toString();
    }
}
