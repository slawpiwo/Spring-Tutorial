package com.xcafe.spring.test;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class WeekOrganizer {

    private List<Organizer> week;

    public WeekOrganizer(List<Organizer> week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("week", week)
                .toString();
    }
}
