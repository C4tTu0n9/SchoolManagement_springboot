package com.tuongpc.my_project.dto;

public class SchoolfacilityDTO {
    private Integer schoolFacilityId;
    private Integer schoolId;
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
