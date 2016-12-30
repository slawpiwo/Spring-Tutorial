package com.xcafe.spring.test.logger;

public class FileWriter implements LogWriter {

    public void write(String text) {
        System.out.println("Let's say it's a file writer: " + text);
    }
}
