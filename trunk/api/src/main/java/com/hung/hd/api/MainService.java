package com.hung.hd.api;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Service
@RequestMapping("health")
public class MainService 
{
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String test(){
        return "OK";
    }
}
