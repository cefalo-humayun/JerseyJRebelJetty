/*
 * Copyright (c) 2013, Cefalo, AS. All rights reserved
 */
package model;

/**
 * @author humayun
 * @version 1.0
 */
public class EPiArticlePropertyValue extends EPiServerProperty {

    private String value;

    public EPiArticlePropertyValue(String name, String type, String value) {
        super(name, type);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
