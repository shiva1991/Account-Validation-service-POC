package com.voya.web.controller;

import com.voya.web.model.HttpConstants;
import com.voya.web.model.VoyaModelMapper;
import com.voya.web.service.VoyaConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class HttpUtils {

    @Autowired
    private VoyaConnection voyaConnection;

    /**
     * @param request
     * @return
     * @throws ServletException
     */
    private Map<String, String> setHttpHeaders(HttpServletRequest request) throws ServletException {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpConstants.CONTENT_TYPE, HttpConstants.JSON_CONTENT);
        return headers;
    }

    /**
     * @param request
     * @param urlSegment
     * @param requestType
     * @param payload
     * @param clazz
     * @param <T>
     * @return
     * @throws IOException
     * @throws InterruptedException
     * @throws ServletException
     */
    protected <T> T handleResponse(HttpServletRequest request, String urlSegment, HttpMethod requestType, String payload, Class<T> clazz) throws IOException, InterruptedException, ServletException {
        T type = null;
        String resourceUrl = "https://ijaxlaaa9041:8443/acval/ws/ers/" + urlSegment;
        Map<String, String> headers = setHttpHeaders(request);
        String result = voyaConnection.executeConnection(resourceUrl, requestType, payload, headers);
        if (clazz != null) {
            VoyaModelMapper mapper = new VoyaModelMapper();
            type = mapper.getGsonMapper().fromJson(result, clazz);
        }

        return type;
    }
}
