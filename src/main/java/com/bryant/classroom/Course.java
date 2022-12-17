package com.bryant.classroom;

import java.util.List;

public class Course {
    long courseId;
    String name;
    String section;
    String descriptionHeading;
    String description;
    String room;
    String ownerId;
    String creationTime;
    String updateTime;
    String enrollmentCode;
    String alternateLink;
    String teacherGroupEmail;
    String courseGroupEmail;
    List<Coursework> courseworkList;

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDescriptionHeading() {
        return descriptionHeading;
    }

    public void setDescriptionHeading(String descriptionHeading) {
        this.descriptionHeading = descriptionHeading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getEnrollmentCode() {
        return enrollmentCode;
    }

    public void setEnrollmentCode(String enrollmentCode) {
        this.enrollmentCode = enrollmentCode;
    }

    public String getAlternateLink() {
        return alternateLink;
    }

    public void setAlternateLink(String alternateLink) {
        this.alternateLink = alternateLink;
    }

    public String getTeacherGroupEmail() {
        return teacherGroupEmail;
    }

    public void setTeacherGroupEmail(String teacherGroupEmail) {
        this.teacherGroupEmail = teacherGroupEmail;
    }

    public String getCourseGroupEmail() {
        return courseGroupEmail;
    }

    public void setCourseGroupEmail(String courseGroupEmail) {
        this.courseGroupEmail = courseGroupEmail;
    }

    public List<Coursework> getCourseworkList() {
        return courseworkList;
    }

    public void setCourseworkList(List<Coursework> courseworkList) {
        this.courseworkList = courseworkList;
    }
}
