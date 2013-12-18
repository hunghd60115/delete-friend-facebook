package com.hung.hd.api;

import ch.qos.logback.core.joran.spi.DefaultClass;
import com.hung.hd.dto.ChoMap;
import com.hung.hd.dto.Data;
import com.hung.hd.dto.Dataone;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
@Service
@RequestMapping("health")
public class MainService 
{
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Data test(
            @RequestParam(required = false, value = "a") String a,
            @RequestParam(required = false, value = "b") Integer b
    ){
        Data data = new Data();
        Dataone dataOne = new Dataone();
        List<Dataone> dataoneList = new ArrayList<Dataone>();
        dataOne.setA(a);
        dataOne.setB(b+"");
        dataOne.setC(true);
        List<String> cho = new ArrayList<String>();
        cho.add("cho1");
        cho.add("cho2");
        dataOne.setChoViet(cho);
        dataoneList.add(dataOne);
        data.setDataoneList(dataoneList);
        return data;
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = "application/xml")
    public ChoMap anCuc(@RequestBody(required = true) ChoMap choMap){
        return choMap;
    }
}
