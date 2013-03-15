package com.cefalo.models;

import nu.xom.Document;

import java.net.URI;

/**
 * @version 1.0
 */
public class NPArticle extends NPModelObject {
//    private NPUserInfo user;

    public NPArticle(Document document) {
        super(document);
    }

    public URI getCreatedUserURI() {
        return getRelationLink("createdUser");
    }

    public URI getUpdatedUserURI() {
        return getRelationLink("updatedUser");
    }

    public URI getUserDataURI() {
        return getRelationLink("userData");
    }

    public URI getSectionURI() {
        return getRelationLink("section");
    }

    public URI getSectionsURI() {
        return getRelationLink("sections");
    }

    public URI getArticlePartsURI() {
        return getRelationLink("articleParts");
    }

    public URI getUpdateURI() {
        return getRelationLink("update");
    }

    public URI getDeleteURI() {
        return getRelationLink("delete");
    }

    public String getIdDataVersion() {
        return get("id") + "." + get("dataVersion");
    }

}
