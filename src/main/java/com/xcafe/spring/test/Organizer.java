package com.xcafe.spring.test;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Organizer {

    private String name;
    private List<String> tasks;

    public Organizer(String name, List<String> tasks) {
        this.name = name;
        this.tasks = tasks;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("tasks", tasks)
                .toString();
    }
}
