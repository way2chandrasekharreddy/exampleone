//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.amex.crmd.rest.service.request.objs;

import org.codehaus.jackson.annotate.JsonProperty;

public class GeocodeAddress {
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private String line4 = "";
    private String line5 = "";
    private String city = "";
    private String regionCd = "";
    private String regionName = "";
    private String cntryCd = "";
    private String cntryName = "";
    private String postalCd = "";

    public GeocodeAddress() {
    }

    @JsonProperty("addressLine1")
    public String getLine1() {
        return this.line1;
    }

    @JsonProperty("addressLine1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @JsonProperty("addressLine2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @JsonProperty("addressLine2")
    public String getLine2() {
        return this.line2;
    }

    @JsonProperty("addressLine3")
    public String getLine3() {
        return this.line3;
    }

    @JsonProperty("addressLine3")
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    @JsonProperty("addressLine4")
    public String getLine4() {
        return this.line4;
    }

    @JsonProperty("addressLine4")
    public void setLine4(String line4) {
        this.line4 = line4;
    }

    @JsonProperty("addressLine5")
    public String getLine5() {
        return this.line5;
    }

    @JsonProperty("addressLine5")
    public void setLine5(String line5) {
        this.line5 = line5;
    }

    @JsonProperty("cityName")
    public String getCity() {
        return this.city;
    }

    @JsonProperty("cityName")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("regionCode")
    public String getRegionCd() {
        return this.regionCd;
    }

    @JsonProperty("regionCode")
    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    @JsonProperty("cntryCode")
    public String getCntryCd() {
        return this.cntryCd;
    }

    @JsonProperty("cntryCode")
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    @JsonProperty("postalCode")
    public String getPostalCd() {
        return this.postalCd;
    }

    @JsonProperty("postalCode")
    public void setPostalCd(String postalCd) {
        this.postalCd = postalCd;
    }

    @JsonProperty("regionName")
    public String getRegionName() {
        return this.regionName;
    }

    @JsonProperty("regionName")
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @JsonProperty("cntryName")
    public String getCntryName() {
        return this.cntryName;
    }

    @JsonProperty("cntryName")
    public void setCntryName(String cntryName) {
        this.cntryName = cntryName;
    }

    public String toString() {
        return "GeoCodingAddress [line1=" + this.line1 + ", line2=" + this.line2 + ", line3=" + this.line3 + ", line4=" + this.line4 + ", line5=" + this.line5 + ", city=" + this.city + ", regionCd=" + this.regionCd + ", regionName=" + this.regionName + ", cntryCd=" + this.cntryCd + ", cntryName=" + this.cntryName + ", postalCd=" + this.postalCd + "]";
    }
}
