package com.hdjnb.interfaceautotest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.Map;

/**
 * Base request class
 * */
@Data
public abstract class Request {
    private long id;

    private String name;

    private String url;

    private Map<String, Object> headers;

    private RequestType type;
}
