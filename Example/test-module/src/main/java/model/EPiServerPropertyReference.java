/*
 * Copyright (c) 2013, Cefalo, AS. All rights reserved
 */
package model;

import java.util.List;

/**
 * @author humayun
 * @version 1.0
 */
public class EPiServerPropertyReference extends EPiServerProperty {
    private List reference;

    public EPiServerPropertyReference(String name, String type, List list) {
        super(name, type);
        this.reference = list;
    }

    public List getReference() {
        return reference;
    }
}
