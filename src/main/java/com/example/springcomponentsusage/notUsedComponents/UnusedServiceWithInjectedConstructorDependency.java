package com.example.springcomponentsusage.notUsedComponents;

import com.example.springcomponentsusage.usedComponents.InjectedComponent;
import org.springframework.stereotype.Service;

// unused component is shown as used, if it has autowired constructor dependency
@Service
public class UnusedServiceWithInjectedConstructorDependency {
    private final String foo;

    public String getFoo() {
        return foo;
    }

    public UnusedServiceWithInjectedConstructorDependency(InjectedComponent foo) {
        this.foo = foo.getId();
    }
}