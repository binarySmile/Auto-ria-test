package com.github.binarySmile.autoriatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {

    @JsonProperty("additional")
    private Additional additional;

    @JsonProperty("active_state")
    private Object activeState;

    @JsonProperty("search_result")
    private SearchResult searchResult;

    @JsonProperty("active_city")
    private Object activeCity;

    @JsonProperty("revies")
    private Object revies;

    public Additional getAdditional() {
        return additional;
    }

    public Object getActiveState() {
        return activeState;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public Object getActiveCity() {
        return activeCity;
    }

    public Object getRevies() {
        return revies;
    }

    @Override
    public String toString() {
        return
                "Result{" +
                        "additional = '" + additional + '\'' +
                        ",active_state = '" + activeState + '\'' +
                        ",search_result = '" + searchResult + '\'' +
                        ",active_city = '" + activeCity + '\'' +
                        ",revies = '" + revies + '\'' +
                        "}";
    }
}