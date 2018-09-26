package com.github.binarySmile.autoriatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Additional {

    @JsonProperty("search_params")
    private SearchParams searchParams;

    @JsonProperty("user_auto_positions")
    private List <Object> userAutoPositions;

    @JsonProperty("query_string")
    private String queryString;

    public SearchParams getSearchParams() {
        return searchParams;
    }

    public List <Object> getUserAutoPositions() {
        return userAutoPositions;
    }

    public String getQueryString() {
        return queryString;
    }

    @Override
    public String toString() {
        return
                "Additional{" +
                        "search_params = '" + searchParams + '\'' +
                        ",user_auto_positions = '" + userAutoPositions + '\'' +
                        ",query_string = '" + queryString + '\'' +
                        "}";
    }
}