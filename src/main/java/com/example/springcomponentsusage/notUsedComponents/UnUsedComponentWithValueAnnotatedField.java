package com.example.springcomponentsusage.notUsedComponents;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// shown as not used without @Value-annotated field
// with @Value it appears as used
@Component
public class UnUsedComponentWithValueAnnotatedField {

   //@Value("foo")
    String id;

    public String getId() {
        return id;
    }
}
