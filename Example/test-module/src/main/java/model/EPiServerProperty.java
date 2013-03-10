/*
 * Copyright (c) 2013, Cefalo, AS. All rights reserved
 */
package model;

/**
 * @author humayun
 * @version 1.0
 */
public class EPiServerProperty {
    private String name;
    private String type;

    public EPiServerProperty(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
