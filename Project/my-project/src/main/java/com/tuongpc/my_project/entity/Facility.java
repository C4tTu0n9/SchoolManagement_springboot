package com.tuongpc.my_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facility")
public class Facility {
    @Id
    @Column(name = "facility_id")
    private Integer facilityId;

    @Column(name = "name")
    private String name;

    public Integer getFacilityId() {
        return this.facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
