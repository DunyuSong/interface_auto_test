package com.hdjnb.interfaceautotest.factory;

import com.hdjnb.interfaceautotest.model.Request;

public interface RequestFactory {
    Request buildRequest(String json);
}
