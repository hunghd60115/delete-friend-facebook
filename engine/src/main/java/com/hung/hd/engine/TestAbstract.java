package com.hung.hd.engine;

import com.hung.hd.api.MainService;
import com.hung.hd.dto.Data;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: HungHD1
 * Date: 12/5/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class TestAbstract {

   @Resource(name = "mainService")
    protected MainService mainService;

    abstract Data ab();
}
