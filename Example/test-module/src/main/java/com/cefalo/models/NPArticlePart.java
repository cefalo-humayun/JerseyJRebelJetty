package com.cefalo.models;

import nu.xom.Document;

import java.net.URI;

/**
 * @author humayun
 * @version 1.0
 */
public class NPArticlePart extends NPModelObject {

    public NPArticlePart(Document document) {
        super(document);
    }

    public Float getSortKey() {
        return Float.parseFloat(get("sortKey"));
    }

    public URI getNpDoc() {
        return getRelationLink("npdoc");
    }

    public URI getBylinesURI() {
        return getRelationLink("bylines");
    }

    public String getArticlePartTypeId() {
        return get("articlePartTypeId");
    }
}
