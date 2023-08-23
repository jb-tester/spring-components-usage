package com.example.springcomponentsusage.notUsedComponents;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

// lombokked service is shown as used
@Setter
@Getter
@Service
public class UnusedServiceWithLombok {

    String prop1;
    String prop2;

}
