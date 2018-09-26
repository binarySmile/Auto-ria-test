package com.github.binarySmile.autoriatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchParams {

    @JsonProperty("all")
    private All all;

    @JsonProperty("cleaned")
    private Cleaned cleaned;

    public All getAll() {
        return all;
    }

    public Cleaned getCleaned() {
        return cleaned;
    }

    @Override
    public String toString() {
        return
                "SearchParams{" +
                        "all = '" + all + '\'' +
                        ",cleaned = '" + cleaned + '\'' +
                        "}";
    }
}