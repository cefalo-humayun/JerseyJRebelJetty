package com.cefalo.models;

import nu.xom.Document;

/**
 * @author humayun
 * @version 1.0
 */
public interface NPUnitCreator<T extends NPModelObject> {

    public T create(Document document);
}
