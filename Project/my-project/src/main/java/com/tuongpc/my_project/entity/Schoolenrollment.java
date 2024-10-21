package com.tuongpc.my_project.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "schoolenrollment")
public class Schoolenrollment {
    @Id
    @Column(name = "enrollment_id")
    private Integer enrollmentId;

    @Column(name = "school_id")
    private Integer schoolId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "enrolled_date")
    private LocalDateTime enrolledDate;

    @Column(name = "status")
    private String status;

    public Integer getEnrollmentId() {
        return this.enrollmentId;
    }

    public void setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Integer getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public LocalDateTime getEnrolledDate() {
        return this.enrolledDate;
    }

    public void setEnrolledDate(LocalDateTime enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
