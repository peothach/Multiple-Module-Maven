package com.maven.customer;

import com.maven.lib.CommonUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("")
    public String viewHomePage() {
        return "From Customer Application " + CommonUtil.getAppName();
    }
}
