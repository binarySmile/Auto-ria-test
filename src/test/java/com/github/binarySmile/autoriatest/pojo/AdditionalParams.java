package com.github.binarySmile.autoriatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalParams {

    @JsonProperty("catalog_name")
    private String catalogName;

    @JsonProperty("elastica")
    private boolean elastica;

    @JsonProperty("lang_id")
    private int langId;

    @JsonProperty("view_type_id")
    private int viewTypeId;

    @JsonProperty("section")
    private String section;

    @JsonProperty("page")
    private int page;

    @JsonProperty("nodejs")
    private boolean nodejs;

    @JsonProperty("target")
    private String target;

    public String getCatalogName() {
        return catalogName;
    }

    public boolean isElastica() {
        return elastica;
    }

    public int getLangId() {
        return langId;
    }

    public int getViewTypeId() {
        return viewTypeId;
    }

    public String getSection() {
        return section;
    }

    public int getPage() {
        return page;
    }

    public boolean isNodejs() {
        return nodejs;
    }

    public String getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return
                "AdditionalParams{" +
                        "catalog_name = '" + catalogName + '\'' +
                        ",elastica = '" + elastica + '\'' +
                        ",lang_id = '" + langId + '\'' +
                        ",view_type_id = '" + viewTypeId + '\'' +
                        ",section = '" + section + '\'' +
                        ",page = '" + page + '\'' +
                        ",nodejs = '" + nodejs + '\'' +
                        ",target = '" + target + '\'' +
                        "}";
    }
}