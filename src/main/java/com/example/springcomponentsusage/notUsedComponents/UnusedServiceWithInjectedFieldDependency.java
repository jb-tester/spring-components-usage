package com.example.springcomponentsusage.notUsedComponents;

import com.example.springcomponentsusage.usedComponents.InjectedComponent;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

// class is shown as used, if it has @Autowired field
// if @Resource or @Inject is used - class is shown as not used
@Service
public class UnusedServiceWithInjectedFieldDependency {
    //@Autowired
    //@Autowired(required = false)
    @Resource(name = "bbb_compo")
    //@Resource
    //@Inject
    private InjectedComponent injectedComponent;


    public String getFoo() {
        return injectedComponent.getId();
    }


}