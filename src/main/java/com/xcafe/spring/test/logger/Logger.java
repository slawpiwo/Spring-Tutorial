package com.xcafe.spring.test.logger;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class Logger {

    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;
    private LogWriter remoteWriter;


    @Inject
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Inject
    @Named(value = "fileWriterNew")
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Inject
    public void setRemoteWriter(LogWriter remoteWriter) {
        this.remoteWriter = remoteWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        if (consoleWriter != null) {
            consoleWriter.write(text);
        }
    }

    public void writeToRemoteFile(String text) {
        remoteWriter.write(text);
    }
}
