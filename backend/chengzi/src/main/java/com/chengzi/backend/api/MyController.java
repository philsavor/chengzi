package com.chengzi.backend.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/postfeed")
    @ResponseBody
    public String postFeed(@RequestParam(value="feedId", required=false, defaultValue="abc") String feedId) {

        return "feedId:" + feedId;
    }

}
