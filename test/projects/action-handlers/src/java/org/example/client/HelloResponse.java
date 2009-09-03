package org.example.client;

import org.grails.plugins.gwt.client.Response;

public class HelloResponse implements Response {
    private static final long serialVersionUID = 1L;

    private String response;

    private HelloResponse() {
    }

    public HelloResponse(String msg) {
        this.response = msg;
    }

    public String getResponse() {
        return response;
    }
}
