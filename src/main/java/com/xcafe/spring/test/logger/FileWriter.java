package com.xcafe.spring.test.logger;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("filewriter")
public class FileWriter implements LogWriter {

    public void write(String text) {
        System.out.println("Let's say it's a file writer: " + text);
    }
}
