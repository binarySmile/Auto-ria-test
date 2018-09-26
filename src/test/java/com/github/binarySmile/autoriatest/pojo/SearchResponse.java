package com.github.binarySmile.autoriatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse {

    @JsonProperty("result")
    private Result result;

    @JsonProperty("additional_params")
    private AdditionalParams additionalParams;

    public Result getResult() {
        return result;
    }

    public AdditionalParams getAdditionalParams() {
        return additionalParams;
    }

    @Override
    public String toString() {
        return
                "SearchResponse{" +
                        "result = '" + result + '\'' +
                        ",additional_params = '" + additionalParams + '\'' +
                        "}";
    }
}