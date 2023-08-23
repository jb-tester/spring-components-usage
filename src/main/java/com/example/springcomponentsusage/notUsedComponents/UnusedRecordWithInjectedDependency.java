package com.example.springcomponentsusage.notUsedComponents;

import com.example.springcomponentsusage.usedComponents.InjectedComponent;
import org.springframework.stereotype.Component;

// unused record is shown as unused despite the autowired constructor
@Component
public record UnusedRecordWithInjectedDependency(InjectedComponent injectedComponent) {
}
