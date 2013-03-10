/*
 * Copyright (c) 2013, Cefalo, AS. All rights reserved
 */
package core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author humayun
 * @version 1.0
 */
public class XMLMap {
    public Map<String, String> mapEPiArticle = new HashMap<String, String>();
    public Map<String, String> mapNpArticle = new HashMap<String, String>();

    public XMLMap() {
        mapEPiArticle.put("Type", "String");
        mapEPiArticle.put("EPiServerId", "String");
        mapEPiArticle.put("NewspilotId", "String");
        mapEPiArticle.put("CreatedBy", "Reference");
        mapEPiArticle.put("UpdatedBy", "Reference");
        mapEPiArticle.put("Status", "String");
        mapEPiArticle.put("Name", "String");
        mapEPiArticle.put("CreatedDate", "DateTime");
        mapEPiArticle.put("UpdatedDate", "DateTime");
        mapEPiArticle.put("MainSection", "Reference");
        mapEPiArticle.put("OtherSections", "Reference");

        mapEPiArticle.put("privateUserId", "String");
        mapEPiArticle.put("label", "String");
        mapEPiArticle.put("jobId", "String");
        mapEPiArticle.put("note", "String");
        mapEPiArticle.put("prio", "String");
        mapEPiArticle.put("dataVersion", "String");
        mapEPiArticle.put("backupVersion", "String");
        mapEPiArticle.put("previewCRC", "String");
        mapEPiArticle.put("thumbCRC", "String");
        mapEPiArticle.put("departmentId", "String");
        mapEPiArticle.put("organizationId", "String");
        mapEPiArticle.put("respUserId", "String");
        mapEPiArticle.put("productId", "String");
        mapEPiArticle.put("mediaId", "String");
        mapEPiArticle.put("pageId", "String");
        mapEPiArticle.put("articleTypeId", "String");
        mapEPiArticle.put("pubStart", "DateTime");
        mapEPiArticle.put("pubStop", "DateTime");
        mapEPiArticle.put("dirtyFlag", "String");
        mapEPiArticle.put("restoredFlag", "String");
        mapEPiArticle.put("restoredDate", "DateTime");
        mapEPiArticle.put("mimetype", "String");
        mapEPiArticle.put("textLength", "String");
        mapEPiArticle.put("textLengthMM", "String");
        mapEPiArticle.put("charSizeFactor", "String");
        mapEPiArticle.put("layoutProperties", "String");
        mapEPiArticle.put("archiveId", "String");
        mapEPiArticle.put("backgroundMaterial", "String");
        mapEPiArticle.put("externalData", "String");
        mapEPiArticle.put("originalArticleId", "String");
        mapEPiArticle.put("masterArticleId", "String");
        mapEPiArticle.put("coupledArticles", "String");
        mapEPiArticle.put("description", "String");
        mapEPiArticle.put("externalSystemId", "String");
        mapEPiArticle.put("publicationDateId", "String");
        mapEPiArticle.put("secret", "String");

        mapEPiArticle.put("articleFlags", "HTML");
        mapEPiArticle.put("layoutStatus", "String");
        mapEPiArticle.put("urlLink", "String");
        mapEPiArticle.put("layoutType", "String");
        mapEPiArticle.put("layoutTypeChanged", "String");
        mapEPiArticle.put("slug", "String");
        mapEPiArticle.put("pageSpanCount", "String");
        mapEPiArticle.put("subProductId", "String");
        mapEPiArticle.put("categories", "HTML");
        mapEPiArticle.put("geodata", "HTML");
        mapEPiArticle.put("tags", "HTML");
        mapEPiArticle.put("articlePartTypeId", "String");
        mapEPiArticle.put("preleadin", "HTML");
        mapEPiArticle.put("madmansrow", "HTML");
        mapEPiArticle.put("headline", "String");
        mapEPiArticle.put("dateline", "String");
        mapEPiArticle.put("leadin", "HTML");
        mapEPiArticle.put("body", "HTML");

        mapEPiArticle.put("Factboxes", "Reference");
        mapEPiArticle.put("Teasers", "Reference");
        mapEPiArticle.put("Images", "Reference");
        mapEPiArticle.put("Authors", "Reference");





        mapNpArticle.put("NPType", "Type");
        //mapNpArticle.put("", "");
        //mapNpArticle.put("id ***  dataVersion", "NewspilotId");
        mapNpArticle.put("createdUserId", "CreatedBy");
        mapNpArticle.put("updatedUserId", "UpdatedBy");
        //mapNpArticle.put("", "");
        mapNpArticle.put("name", "Name");
        mapNpArticle.put("createdDate", "CreatedDate");
        mapNpArticle.put("updatedDate", "UpdatedDate");
        /*mapNpArticle.put("", "");
        mapNpArticle.put("", "");
        mapNpArticle.put("", "");*/

        mapNpArticle.put("privateUserId", "privateUserId");
        mapNpArticle.put("label", "label");
        mapNpArticle.put("jobId", "jobId");
        mapNpArticle.put("note", "note");
        mapNpArticle.put("prio", "prio");
        mapNpArticle.put("dataVersion", "dataVersion");
        mapNpArticle.put("backupVersion", "backupVersion");
        mapNpArticle.put("previewCRC", "previewCRC");
        mapNpArticle.put("thumbCRC", "thumbCRC");
        mapNpArticle.put("departmentId", "departmentId");
        mapNpArticle.put("organizationId", "organizationId");
        mapNpArticle.put("respUserId", "respUserId");
        mapNpArticle.put("productId", "productId");
        mapNpArticle.put("mediaId", "mediaId");
        mapNpArticle.put("pageId", "pageId");
        mapNpArticle.put("articleTypeId", "articleTypeId");
        mapNpArticle.put("pubStart", "pubStart");
        mapNpArticle.put("pubStop", "pubStop");
        mapNpArticle.put("dirtyFlag", "dirtyFlag");
        mapNpArticle.put("restoredFlag", "restoredFlag");
        mapNpArticle.put("restoredDate", "restoredDate");
        mapNpArticle.put("textLength", "textLength");
        mapNpArticle.put("textLengthMM", "textLengthMM");
        mapNpArticle.put("charSizeFactor", "charSizeFactor");
        mapNpArticle.put("layoutProperties", "layoutProperties");
        mapNpArticle.put("archiveId", "archiveId");
        mapNpArticle.put("backgroundMaterial", "backgroundMaterial");
        mapNpArticle.put("externalData", "externalData");
        mapNpArticle.put("originalArticleId", "originalArticleId");
        mapNpArticle.put("masterArticleId", "masterArticleId");
        mapNpArticle.put("coupledArticles", "coupledArticles");
        mapNpArticle.put("description", "description");
        mapNpArticle.put("externalSystemId", "externalSystemId");
        mapNpArticle.put("publicationDateId", "publicationDateId");
        mapNpArticle.put("secret", "secret");
        mapNpArticle.put("articleFlags", "articleFlags");
        mapNpArticle.put("layoutStatus", "layoutStatus");
        mapNpArticle.put("urlLink", "urlLink");
        mapNpArticle.put("layoutType", "layoutType");
        mapNpArticle.put("layoutTypeChanged", "layoutTypeChanged");
        mapNpArticle.put("slug", "slug");
        mapNpArticle.put("pageSpanCount", "pageSpanCount");
        mapNpArticle.put("subProductId", "subProductId");
        mapNpArticle.put("categories", "categories");
        mapNpArticle.put("geodata", "geodata");
        mapNpArticle.put("tags", "tags");


        /*mapNpArticle.put("", "articlePartTypeId");
        mapNpArticle.put("", "preleadin");
        mapNpArticle.put("", "madmansrow");
        mapNpArticle.put("", "headline");
        mapNpArticle.put("", "dateline");
        mapNpArticle.put("", "leadin");
        mapNpArticle.put("", "body");

        mapNpArticle.put("", "Factboxes");
        mapNpArticle.put("", "Teasers");
        mapNpArticle.put("", "Images");
        mapNpArticle.put("", "Authors");*/
































    }
}
