package com.tuongpc.my_project.dto;

import java.time.LocalDateTime;

public class SchoolratingDTO {
    private Integer ratingId;
    private Integer schoolId;
    private Integer parentId;
    private Integer ratingScore1;
    private Integer ratingScore2;
    private Integer ratingScore3;
    private Integer ratingScore4;
    private Integer ratingScore5;
    private String feedback;
    private LocalDateTime createdAt;

    public Integer getRatingId() {
        return this.ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
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

    public Integer getRatingScore1() {
        return this.ratingScore1;
    }

    public void setRatingScore1(Integer ratingScore1) {
        this.ratingScore1 = ratingScore1;
    }

    public Integer getRatingScore2() {
        return this.ratingScore2;
    }

    public void setRatingScore2(Integer ratingScore2) {
        this.ratingScore2 = ratingScore2;
    }

    public Integer getRatingScore3() {
        return this.ratingScore3;
    }

    public void setRatingScore3(Integer ratingScore3) {
        this.ratingScore3 = ratingScore3;
    }

    public Integer getRatingScore4() {
        return this.ratingScore4;
    }

    public void setRatingScore4(Integer ratingScore4) {
        this.ratingScore4 = ratingScore4;
    }

    public Integer getRatingScore5() {
        return this.ratingScore5;
    }

    public void setRatingScore5(Integer ratingScore5) {
        this.ratingScore5 = ratingScore5;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
