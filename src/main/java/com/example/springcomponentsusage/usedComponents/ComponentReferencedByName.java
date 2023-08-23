package com.example.springcomponentsusage.usedComponents;

import org.springframework.stereotype.Component;

// component is shown as not used though it is referenced by name
// in applicationContext.getBean(beanname)
@Component
public class ComponentReferencedByName {
}
