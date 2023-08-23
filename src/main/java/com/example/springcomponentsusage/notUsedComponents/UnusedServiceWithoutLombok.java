package com.example.springcomponentsusage.notUsedComponents;

import org.springframework.stereotype.Service;

// service shown as unused
@Service
public class UnusedServiceWithoutLombok {

    String prop1;
    String prop2;

    public String getProp1() {
        return this.prop1;
    }

    public String getProp2() {
        return this.prop2;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }
}
