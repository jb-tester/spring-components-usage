package com.example.springcomponentsusage.usedComponents.scannedConfProps;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("bbb")
public class UsedScannedConfigProperties {

    String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}
