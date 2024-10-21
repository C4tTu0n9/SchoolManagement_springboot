package com.tuongpc.my_project.dto;

public class AddressDTO {
    private Integer id;
    private String provinceId;
    private String districtId;
    private String wardsId;
    private String detail;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceId() {
        return this.provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getDistrictId() {
        return this.districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getWardsId() {
        return this.wardsId;
    }

    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
