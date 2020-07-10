package com.liferay.myportlet.fakemodel;

import java.util.Date;

public class UniversityFaculty {

    private long universityFacultyId;
    private long universityPersonId; //fk
    private String personalId;
    private String roomNumber;
    private int degree;
    private String emailAddress;
    private String phoneNumber;
    private long scopusHindex;
    private long scopusCitation;
    private Date scopusToDate;
    private long googleScholarHindex;
    private long googleScholarCitation;
    private Date googleScholarToDate;

    public UniversityFaculty() {
    }

    public UniversityFaculty(long universityFacultyId, long universityPersonId, String roomNumber) {
        this.universityFacultyId = universityFacultyId;
        this.universityPersonId = universityPersonId;
        this.roomNumber = roomNumber;
    }

    public String getDegreeName(){
        switch (degree){
            case 0: return "prof";
            case 1: return "assprof";
            case 2: return "assknow";
            case 3: return "coach";
            case 4: return "expert";
            case 5: return "trainer";
        }
        return "";
    }
    public long getUniversityFacultyId() {
        return universityFacultyId;
    }

    public void setUniversityFacultyId(long universityFacultyId) {
        this.universityFacultyId = universityFacultyId;
    }

    public long getUniversityPersonId() {
        return universityPersonId;
    }

    public void setUniversityPersonId(long universityPersonId) {
        this.universityPersonId = universityPersonId;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getScopusHindex() {
        return scopusHindex;
    }

    public void setScopusHindex(long scopusHindex) {
        this.scopusHindex = scopusHindex;
    }

    public long getScopusCitation() {
        return scopusCitation;
    }

    public void setScopusCitation(long scopusCitation) {
        this.scopusCitation = scopusCitation;
    }

    public Date getScopusToDate() {
        return scopusToDate;
    }

    public void setScopusToDate(Date scopusToDate) {
        this.scopusToDate = scopusToDate;
    }

    public long getGoogleScholarHindex() {
        return googleScholarHindex;
    }

    public void setGoogleScholarHindex(long googleScholarHindex) {
        this.googleScholarHindex = googleScholarHindex;
    }

    public long getGoogleScholarCitation() {
        return googleScholarCitation;
    }

    public void setGoogleScholarCitation(long googleScholarCitation) {
        this.googleScholarCitation = googleScholarCitation;
    }

    public Date getGoogleScholarToDate() {
        return googleScholarToDate;
    }

    public void setGoogleScholarToDate(Date googleScholarToDate) {
        this.googleScholarToDate = googleScholarToDate;
    }
}
