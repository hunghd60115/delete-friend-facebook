package com.hung.hd.dto;

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
@XmlRootElement(name = "DataOne")
public class Dataone {
    private String a;
    private String b;
    private boolean c;
    private List<String> choViet;

    public String getA() {
        return a;
    }

    @XmlElement(name = "A")
    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    @XmlElement(name = "B")
    public void setB(String b) {
        this.b = b;
    }

    public boolean isC() {
        return c;
    }

    @XmlElement(name = "C")
    public void setC(boolean c) {
        this.c = c;
    }

    public List<String> getChoViet() {
        return choViet;
    }

    @XmlElement(name = "Cho")
    public void setChoViet(List<String> choViet) {
        this.choViet = choViet;
    }
}
