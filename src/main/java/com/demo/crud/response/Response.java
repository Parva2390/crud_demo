package com.demo.crud.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"status","message","data"})
public class Response {

    @JsonProperty
    private String status;

    @JsonProperty
    private String message ;

    @JsonProperty
    private Object data ;

    public Response(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
