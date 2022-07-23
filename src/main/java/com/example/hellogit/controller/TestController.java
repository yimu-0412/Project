package com.example.hellogit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: wangyimu
 * @create: 2022/7/23
 * @Description:
 * @FileName: TestController
 * @History:
 * @自定义内容：
 */
@Controller
@ResponseBody
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "Hello Git!";
    }
}
