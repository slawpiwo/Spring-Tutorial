package com.xcafe.spring.test;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Organizer {

    private String name;
    private List<String> tasks;
    private Map<String, String> notes = new HashMap<String, String>();

    public Organizer(String name, List<String> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public void setNotes(Map<String, String> notes) {
        this.notes = notes;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("tasks", tasks)
                .append("notes", notes)
                .toString();
    }
}
