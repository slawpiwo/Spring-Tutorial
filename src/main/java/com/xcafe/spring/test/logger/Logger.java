package com.xcafe.spring.test.logger;

import javax.annotation.Resource;

public class Logger {

    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;


    @Resource(name = "consoleWriter2")
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Resource(name = "fileWriterNew")
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
