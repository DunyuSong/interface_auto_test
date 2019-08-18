package com.hdjnb.interfaceautotest.model;

import java.util.Map;

/**
 * Base request class
 * */
public abstract class Request {
    private long id;

    private String name;

    private String url;

    private Map<String, Object> headers;

    private RequestType type;
}
