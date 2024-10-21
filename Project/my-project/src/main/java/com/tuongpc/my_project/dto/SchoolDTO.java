package com.tuongpc.my_project.dto;

import java.time.LocalDateTime;

public class SchoolDTO {
    private Integer schoolId;
    private String name;
    private Integer schoolTypeId;
    private String email;
    private String phone;
    private Integer addressId;
    private Integer childAgeId;
    private Integer educationMethodId;
    private Integer feeTo;
    private Integer feeFrom;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime publishedAt;
    private Integer acceptedBy;
    private Integer createdBy;
    private String urlImg;

    public Integer getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSchoolTypeId() {
        return this.schoolTypeId;
    }

    public void setSchoolTypeId(Integer schoolTypeId) {
        this.schoolTypeId = schoolTypeId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getChildAgeId() {
        return this.childAgeId;
    }

    public void setChildAgeId(Integer childAgeId) {
        this.childAgeId = childAgeId;
    }

    public Integer getEducationMethodId() {
        return this.educationMethodId;
    }

    public void setEducationMethodId(Integer educationMethodId) {
        this.educationMethodId = educationMethodId;
    }

    public Integer getFeeTo() {
        return this.feeTo;
    }

    public void setFeeTo(Integer feeTo) {
        this.feeTo = feeTo;
    }

    public Integer getFeeFrom() {
        return this.feeFrom;
    }

    public void setFeeFrom(Integer feeFrom) {
        this.feeFrom = feeFrom;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getPublishedAt() {
        return this.publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Integer getAcceptedBy() {
        return this.acceptedBy;
    }

    public void setAcceptedBy(Integer acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getUrlImg() {
        return this.urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
