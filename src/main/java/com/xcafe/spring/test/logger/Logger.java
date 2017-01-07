package com.xcafe.spring.test.logger;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;

    @Autowired
    public Logger(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Autowired
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }
}
