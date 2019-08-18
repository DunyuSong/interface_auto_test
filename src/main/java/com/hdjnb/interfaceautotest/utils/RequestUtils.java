package com.hdjnb.interfaceautotest.utils;

import com.hdjnb.interfaceautotest.model.GetRequest;
import com.hdjnb.interfaceautotest.model.PostRequest;
import com.hdjnb.interfaceautotest.model.Request;
import com.hdjnb.interfaceautotest.model.RequestType;
import org.springframework.util.StringUtils;

import java.util.List;

public class RequestUtils {
    public static Request buildRequest(List<Object> columns) {
        String type = (String) columns.get(3);
        if (!StringUtils.isEmpty(type)) {
            RequestType requestType = RequestType.valueOf(type);
            switch (requestType) {
                case GET: return buildGetRequest(columns);
                case POST: return buildPostRequest(columns);
                default: throw new IllegalArgumentException(columns.get(3) + "isn't a support request type");
            }
        }

        return null;
    }

    private static GetRequest buildGetRequest(List<Object> columns) {
        GetRequest getRequest = new GetRequest();
        getRequest.setId(Long.parseLong(columns.get(0).toString()));
        getRequest.setName((String) columns.get(1));
        getRequest.setUrl((String) columns.get(2));

        return getRequest;
    }

    private static PostRequest buildPostRequest(List<Object> columns) {
        PostRequest postRequest = new PostRequest();
        postRequest.setId(Long.parseLong(columns.get(0).toString()));
        postRequest.setName((String) columns.get(1));
        postRequest.setUrl((String) columns.get(2));

        return postRequest;
    }
}
