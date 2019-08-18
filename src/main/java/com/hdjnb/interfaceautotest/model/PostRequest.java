package com.hdjnb.interfaceautotest.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Map;

/**
 * Type of POST request
 * */
@Data
public class PostRequest extends Request{
    private Map<String, Object> body;
}
