package com.cefalo.models;

import nu.xom.Document;

import java.util.SortedMap;


/**
 * @author humayun
 * @version 1.0
 */
public class NPArticleParts extends NPModelObject {

    public NPArticleParts(Document document) {
        super(document);
    }

    public int getArticlePartCount() {
        return getCount("articlePart");
    }

    public SortedMap<Float, NPArticlePart> getArticlePartList() {
        return getList( new NPUnitCreator<NPArticlePart>() {
            @Override
            public NPArticlePart create(Document document) {
                return new NPArticlePart(document);
            }
        }, "articlePart");
    }

}
