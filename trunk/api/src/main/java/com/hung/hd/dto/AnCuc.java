package com.hung.hd.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 * User: HungHD1
 * Date: 12/11/13
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class AnCuc {
    private String cuaCon;
    private String tanSuat;

    public String getCuaCon() {
        return cuaCon;
    }
    @XmlElement(name = "cuacuacon")
    public void setCuaCon(String cuaCon) {
        this.cuaCon = cuaCon;
    }

    public String getTanSuat() {
        return tanSuat;
    }
     @XmlElement(name = "tuanasdas")
    public void setTanSuat(String tanSuat) {
        this.tanSuat = tanSuat;
    }
}
