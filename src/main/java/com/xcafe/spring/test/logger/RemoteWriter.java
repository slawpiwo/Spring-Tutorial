package com.xcafe.spring.test.logger;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RemoteWriter implements LogWriter{

    @Value("${remote.host}")
    private String hostName;

    @Value("${remote.host.spare?:#{@defaults.hostname}}")
    private String spareHostName;

    @Value("${remote.dir:#{systemProperties['java.io.tmpdir']}}")
    private String remoteDir;

    @Value("#{systemProperties['java.user.home']?:'/tmp/default'}")
    private String secondRemoteDir;

    @Value("#{T(Math).cos(T(Math).PI/4) ^ 2 le 0.8 ? 'yes' : 'no'}")
    private String code;

    private String date;

    @Autowired
    public void setDate(@Value("#{new java.util.Date().toString()}") String date) {
        this.date = date;
    }


    public void write(String text) {
        System.out.println("It's a remote writer : " + this);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("hostName", hostName)
                .append("spareHostName", spareHostName)
                .append("remoteDir", remoteDir)
                .append("secondRemoteDir", secondRemoteDir)
                .append("code", code)
                .append("date", date)
                .toString();
    }
}
