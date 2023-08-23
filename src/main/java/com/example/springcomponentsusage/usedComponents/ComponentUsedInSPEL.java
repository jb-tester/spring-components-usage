package com.example.springcomponentsusage.usedComponents;

import org.springframework.stereotype.Component;

// component is shown as unused though it is used in SPEL
@Component("compo_used_in_spel")
public class ComponentUsedInSPEL {

    String id = "ccc";

    public String getId() {
        return id;
    }
}
