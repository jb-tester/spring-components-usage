package com.example.springcomponentsusage.usedComponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UseComponentByName {

    @Autowired
    ApplicationContext ctx;

    public void method() {
        System.out.println(ctx.getBean("componentReferencedByName").getClass());
    }

    ;
}
