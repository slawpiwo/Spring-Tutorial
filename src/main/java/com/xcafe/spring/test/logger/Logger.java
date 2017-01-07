package com.xcafe.spring.test.logger;

public class Logger {

    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;


    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }
}
