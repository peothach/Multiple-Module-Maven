package com.maven.admin;

import com.maven.lib.CommonUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("")
    public String viewHomePage() {
        return "From Admin Application " + CommonUtil.getAppName();
    }
}
