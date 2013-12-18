package com.hung.hd.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HungHD1
 * Date: 12/6/13
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 */

@JsonRootName(value = "Data")
@XmlRootElement
public class Data {
    private List<Dataone> dataoneList;

    public List<Dataone> getDataoneList() {
        return dataoneList;
    }

    @JsonProperty(value = "DataOne")
    @XmlElement(name = "DataOne")
    public void setDataoneList(List<Dataone> dataoneList) {
        this.dataoneList = dataoneList;
    }
}
