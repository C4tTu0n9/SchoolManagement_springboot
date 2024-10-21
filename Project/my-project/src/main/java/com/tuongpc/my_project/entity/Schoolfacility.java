package com.tuongpc.my_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schoolfacility")
public class Schoolfacility {
    @Id
    @Column(name = "school_facility_id")
    private Integer schoolFacilityId;

    @Column(name = "school_id")
    private Integer schoolId;

    @Column(name = "facility_id")
    private Integer facilityId;

    public Integer getSchoolFacilityId() {
        return this.schoolFacilityId;
    }

    public void setSchoolFacilityId(Integer schoolFacilityId) {
        this.schoolFacilityId = schoolFacilityId;
    }

    public Integer getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getFacilityId() {
        return this.facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }
}
