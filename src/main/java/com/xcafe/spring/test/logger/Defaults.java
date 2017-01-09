package com.xcafe.spring.test.logger;

import org.springframework.stereotype.Component;

@Component("defaults")
public class Defaults {

    private static final String DEFAULT_HOSTNAME = "172.16.154.2";

    public String getHostname() {
        return DEFAULT_HOSTNAME;
    }
}
