package com.hhu.controller;

import com.hhu.filter.CheckFilterContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    private CheckFilterContext checkFilterContext;

    @GetMapping("/api/test")
    public void testfilter(){
        System.out.println("====================================");
        checkFilterContext.check(new Object());
    }
}
