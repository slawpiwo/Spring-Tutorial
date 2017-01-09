package com.xcafe.spring.test.logger;

import org.springframework.stereotype.Component;

@Component("fileWriterNew")
public class FileWriter implements LogWriter {

    public void write(String text) {
        System.out.println("Let's say it's a file writer: " + text);
    }
}
