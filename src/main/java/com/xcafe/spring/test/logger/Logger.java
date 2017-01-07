package com.xcafe.spring.test.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {

    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;


    @Autowired
    @Qualifier("smallconsole")
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Autowired
    @Qualifier("filewriter")
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        if (consoleWriter != null) {
            consoleWriter.write(text);
        }
    }
}
