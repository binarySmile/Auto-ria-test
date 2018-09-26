package com.github.binarySmile.autoriatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SearchResult {

    @JsonProperty("last_id")
    private int lastId;

    @JsonProperty("count")
    private int count;

    @JsonProperty("ids")
    private List <String> ids;

    public int getLastId() {
        return lastId;
    }

    public int getCount() {
        return count;
    }

    public List <String> getIds() {
        return ids;
    }

    @Override
    public String toString() {
        return
                "SearchResult{" +
                        "last_id = '" + lastId + '\'' +
                        ",count = '" + count + '\'' +
                        ",ids = '" + ids + '\'' +
                        "}";
    }
}