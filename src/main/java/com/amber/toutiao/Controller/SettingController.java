package com.amber.toutiao.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SettingController {
    @RequestMapping(path = "setting")
    @ResponseBody
    public String setting(){
        return "Setting: ojbk!";
    }
}
