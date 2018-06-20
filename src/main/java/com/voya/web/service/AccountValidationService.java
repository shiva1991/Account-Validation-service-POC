package com.voya.web.service;

import com.voya.web.controller.HttpUtils;
import com.voya.web.model.AccountValidationRequest;
import com.voya.web.model.AccountValidationResponse;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *
 */
@Service
public class AccountValidationService extends HttpUtils {

    /**
     * @param request
     * @param accountValidationRequest
     * @return
     * @throws ServletException
     * @throws IOException
     * @throws InterruptedException
     */
    public String validate(HttpServletRequest request, AccountValidationRequest accountValidationRequest) throws ServletException, IOException, InterruptedException {
        String urlSegment = "/validate";
        String payload = accountValidationRequest.toString();
        AccountValidationResponse accountValidationResponse = handleResponse(request, urlSegment, HttpMethod.POST, payload, AccountValidationResponse.class);
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("account", accountValidationResponse);
        return "account";
    }
}
