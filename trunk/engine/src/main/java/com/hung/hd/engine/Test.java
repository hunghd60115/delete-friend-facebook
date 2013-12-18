package com.hung.hd.engine;

import com.hung.hd.api.MainService;
import com.hung.hd.dto.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: HungHD1
 * Date: 12/5/13
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test extends TestAbstract{


    @Override
    public Data ab() {
        return mainService.test("a", 1);
    }
}
