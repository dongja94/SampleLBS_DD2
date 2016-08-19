package com.begentgroup.samplelbs.data;

public class POI {
    private String detailBizName;
    private String lowerAddrName;
    private String frontLon;
    private String noorLon;
    private String middleBizName;
    private String noorLat;
    private String firstNo;
    private String lowerBizName;
    private String upperBizName;
    private String name;
    private String upperAddrName;
    private String frontLat;
    private String id;
    private String radius;
    private String rpFlag;
    private String middleAddrName;

    private Double latitude = null;
    private Double longitude = null;

    public double getLatitude() {
        if (latitude == null) {
            latitude = (Double.parseDouble(frontLat) + Double.parseDouble(noorLat)) / 2;
        }
        return latitude;
    }

    public double getLongitude() {
        if (longitude == null) {
            longitude = (Double.parseDouble(frontLon) + Double.parseDouble(noorLon)) / 2;
        }
        return longitude;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDetailBizName() {
        return this.detailBizName;
    }

    public void setDetailBizName(String detailBizName) {
        this.detailBizName = detailBizName;
    }

    public String getLowerAddrName() {
        return this.lowerAddrName;
    }

    public void setLowerAddrName(String lowerAddrName) {
        this.lowerAddrName = lowerAddrName;
    }

    public String getFrontLon() {
        return this.frontLon;
    }

    public void setFrontLon(String frontLon) {
        this.frontLon = frontLon;
    }

    public String getNoorLon() {
        return this.noorLon;
    }

    public void setNoorLon(String noorLon) {
        this.noorLon = noorLon;
    }

    public String getMiddleBizName() {
        return this.middleBizName;
    }

    public void setMiddleBizName(String middleBizName) {
        this.middleBizName = middleBizName;
    }

    public String getNoorLat() {
        return this.noorLat;
    }

    public void setNoorLat(String noorLat) {
        this.noorLat = noorLat;
    }

    public String getFirstNo() {
        return this.firstNo;
    }

    public void setFirstNo(String firstNo) {
        this.firstNo = firstNo;
    }

    public String getLowerBizName() {
        return this.lowerBizName;
    }

    public void setLowerBizName(String lowerBizName) {
        this.lowerBizName = lowerBizName;
    }

    public String getUpperBizName() {
        return this.upperBizName;
    }

    public void setUpperBizName(String upperBizName) {
        this.upperBizName = upperBizName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpperAddrName() {
        return this.upperAddrName;
    }

    public void setUpperAddrName(String upperAddrName) {
        this.upperAddrName = upperAddrName;
    }

    public String getFrontLat() {
        return this.frontLat;
    }

    public void setFrontLat(String frontLat) {
        this.frontLat = frontLat;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRadius() {
        return this.radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getRpFlag() {
        return this.rpFlag;
    }

    public void setRpFlag(String rpFlag) {
        this.rpFlag = rpFlag;
    }

    public String getMiddleAddrName() {
        return this.middleAddrName;
    }

    public void setMiddleAddrName(String middleAddrName) {
        this.middleAddrName = middleAddrName;
    }
}
