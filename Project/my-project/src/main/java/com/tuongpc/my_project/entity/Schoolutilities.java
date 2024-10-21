package com.tuongpc.my_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schoolutilities")
public class Schoolutilities {
    @Id
    @Column(name = "school_amenity_id")
    private Integer schoolAmenityId;

    @Column(name = "school_id")
    private Integer schoolId;

    @Column(name = "amenity_id")
    private Integer amenityId;

    public Integer getSchoolAmenityId() {
        return this.schoolAmenityId;
    }

    public void setSchoolAmenityId(Integer schoolAmenityId) {
        this.schoolAmenityId = schoolAmenityId;
    }

    public Integer getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getAmenityId() {
        return this.amenityId;
    }

    public void setAmenityId(Integer amenityId) {
        this.amenityId = amenityId;
    }
}
