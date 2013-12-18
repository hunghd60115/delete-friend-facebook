package com.hung.hd.engine;

import com.hung.hd.dto.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: HungHD1
 * Date: 12/5/13
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */

@org.springframework.stereotype.Service
@RequestMapping("test")
public class Service {


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Data test(){
        String a ="";
        TestAbstract test = new Test();
        return test.ab();
    }

}
