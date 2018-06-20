package com.voya.web.controller;

import com.voya.web.model.AccountValidationRequest;
import com.voya.web.service.AccountValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *
 */
@Controller
@RequestMapping("/account")
public class AccountValidationController {

    @Autowired
    private AccountValidationService accountValidationService;

    /**
     * @param request
     * @param avRequest
     * @return
     * @throws ServletException
     * @throws IOException
     * @throws InterruptedException
     */
    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public String validate(HttpServletRequest request, AccountValidationRequest avRequest) throws ServletException, IOException, InterruptedException {
        return accountValidationService.validate(request, avRequest);
    }
}