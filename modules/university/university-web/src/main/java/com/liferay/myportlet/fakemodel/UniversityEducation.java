package com.liferay.myportlet.fakemodel;

import java.util.Date;

public class UniversityEducation {

    private long universityEducationId;
    private long universityPersonId; //fk
    private int degree;
    private String university;
    private String country;
    private String city;
    private String major;
    private int startDateYear;
    private int endDateYear;
    private String field;


    public UniversityEducation() {
    }

    public UniversityEducation(long universityEducationId, long universityPersonId, String country, String field, int degree) {
        this.universityEducationId = universityEducationId;
        this.universityPersonId = universityPersonId;
        this.field = field;
        this.country = country;
        this.degree = degree;
    }

    public String getDegreeName(){
        if(degree == 0){
            return "B.Sc";
        }
        if(degree == 1){
            return "M.Sc";
        }
        if(degree == 2){
            return "Ph.D";
        }
        return null;
    }

    public long getUniversityEducationId() {
        return universityEducationId;
    }

    public void setUniversityEducationId(long universityEducationId) {
        this.universityEducationId = universityEducationId;
    }

    public long getUniversityPersonId() {
        return universityPersonId;
    }

    public void setUniversityPersonId(long universityPersonId) {
        this.universityPersonId = universityPersonId;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStartDateYear() {
        return startDateYear;
    }

    public void setStartDateYear(int startDateYear) {
        this.startDateYear = startDateYear;
    }

    public int getEndDateYear() {
        return endDateYear;
    }

    public void setEndDateYear(int endDateYear) {
        this.endDateYear = endDateYear;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
