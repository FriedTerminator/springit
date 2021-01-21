package com.cherepanov.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("Springit")
public class SpringitProperties {

    /**
     * This is our welcome message.
     */

    private String welcomeMsg = "Hello, World";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}