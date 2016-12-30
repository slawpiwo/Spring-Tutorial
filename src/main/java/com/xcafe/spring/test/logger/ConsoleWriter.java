package com.xcafe.spring.test.logger;

public class ConsoleWriter implements LogWriter {

    public void write(String text) {
        System.out.println("Console: " + text);
    }
}
