package com.hdjnb.interfaceautotest.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Type of GET request
 * */
@Data
public class GetRequest extends Request{
    private String params;
}
