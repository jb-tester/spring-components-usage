package com.example.springcomponentsusage.usedComponents;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UseComponentInSPEL {
    @Value("#{@compo_used_in_spel.id}")
    String bbb;

    public String getBbb() {
        return bbb;
    }
}
