package com.tuongpc.my_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "utilities")
public class Utilities {
    @Id
    @Column(name = "amenity_id")
    private Integer amenityId;

    @Column(name = "name")
    private String name;

    public Integer getAmenityId() {
        return this.amenityId;
    }

    public void setAmenityId(Integer amenityId) {
        this.amenityId = amenityId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
