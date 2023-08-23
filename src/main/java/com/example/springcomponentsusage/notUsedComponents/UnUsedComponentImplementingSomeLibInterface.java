package com.example.springcomponentsusage.notUsedComponents;

import org.springframework.stereotype.Component;

import java.io.Serializable;

// shown as used if implements Serializable;
// without implementation clause - shown as not used
@Component("ccc_compo")
public class UnUsedComponentImplementingSomeLibInterface
        implements Serializable
{


}
