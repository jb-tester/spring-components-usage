package com.example.springcomponentsusage.usedComponents;

import org.springframework.stereotype.Component;


@Component("bbb_compo")
public class InjectedComponent {

    String id = "bbb";

    public String getId() {
        return id;
    }
}
