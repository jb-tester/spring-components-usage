package com.example.springcomponentsusage.usedComponents;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("aaa")
public class UsedEnabledConfigProperties {

    String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}
