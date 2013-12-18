package com.hung.hd.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HungHD1
 * Date: 12/11/13
 * Time: 10:30 AM
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChoMap {
    private String ten;
    private String gioiTinh;
    private Long tuoi;
    private List<AnCuc> anCuc;

    public String getTen() {
        return ten;
    }

     @JsonProperty(value = "ten")
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

     @JsonProperty(value = "gioiTinh")
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Long getTuoi() {
        return tuoi;
    }
     @JsonProperty(value = "tuoiCho")
    public void setTuoi(Long tuoi) {
        this.tuoi = tuoi;
    }

    public List<AnCuc> getAnCuc() {
        return anCuc;
    }
    @JsonProperty(value = "anCuc")
    public void setAnCuc(List<AnCuc> anCuc) {
        this.anCuc = anCuc;
    }
}
