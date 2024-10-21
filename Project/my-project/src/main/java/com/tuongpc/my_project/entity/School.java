package com.tuongpc.my_project.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "school")
public class School {
    @Id
    @Column(name = "school_id")
    private Integer schoolId;

    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "SchoolType_id")
    private Integer schoolTypeId;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address_id")
    private Integer addressId;

    @Id
    @Column(name = "ChildAge_id")
    private Integer childAgeId;

    @Id
    @Column(name = "EducationMethod_id")
    private Integer educationMethodId;

    @Column(name = "fee_to")
    private Integer feeTo;

    @Column(name = "fee_from")
    private Integer feeFrom;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "published_at")
    private LocalDateTime publishedAt;

    @Column(name = "accepted_by")
    private Integer acceptedBy;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "url_img")
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
