package com.liferay.myportlet.fakemodel;

import java.util.Date;
import java.util.List;

public class UniversityPerson {

    private long universityPersonId;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String fatherName;
    private Date birthday;
    private boolean male ;
    private String biography;
    private UniversityFaculty universityFaculty;
    private List<UniversityEducation> universityEducations;

    public UniversityPerson() {
    }

    public UniversityPerson(long universityPersonId, String firstName, String lastName) {
        this.universityPersonId = universityPersonId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getUniversityPersonId() {
        return universityPersonId;
    }

    public void setUniversityPersonId(long universityPersonId) {
        this.universityPersonId = universityPersonId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getBiography() {
        biography = "دکتر محمودرضا هاشمی، دانشیار دانشکده مهندسی برق و کامپیوتر پردیس دانشکده \u00AD\u00ADهای فنی دانشگاه تهران می\u200Cباشد. وی مدارک کارشناسی و کارشناسی ارشد خود را از دانشگاه تهران و مدرک دکتری خود را از دانشگاه اتاوای کانادا دریافت نموده است. دکتر هاشمی موسس و مدیر آزمایشگاه پردازش\u00ADهای چندرسانه\u200Cای و آزمایشگاه ارزیابی ریسک و کشف فراگیر کلاهبرداری در تعاملات الکترونیکی (ارک فتا) دانشگاه تهران می\u200Cباشد. زمینه\u200Cهای تحقیقاتی مورد علاقه ایشان سامانه\u200Cها و شبکه های چندرسانه\u200Cای (مالتی مدیا)، معماری\u00ADهای نوین برای پردازش\u00ADهای چند رسانه\u00ADای، امنیت خدمات الکترونیکی، امنیت و اعتماد در رایانش ابری، و اخیراً بازی\u00ADهای مبتنی بر رایانش ابری می\u200Cباشد. دکتر هاشمی مشاور ارشد پیاده سازی استراتژی های فناوری اطلاعات، و تحول دیجیتال برای بسیاری از سازمان ها و نهاد های خصوصی و دولتی بوده است. آقای دکتر هاشمی از سال ۹۳ رئیس مرکز فناوری اطلاعات و فضای مجازی دانشگاه تهران می باشند. دکتر هاشمی مشاور ارشد پیاده سازی استراتژی های فناوری اطلاعات، و تحول دیجیتال برای بسیاری از سازمان ها و نهاد های خصوصی و دولتی بوده است. آقای دکتر هاشمی از سال ۹۳ رئیس مرکز فناوری اطلاعات و فضای مجازی دانشگاه تهران می باشند";
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public UniversityFaculty getUniversityFaculty() {
        return universityFaculty;
    }

    public void setUniversityFaculty(UniversityFaculty universityFaculty) {
        this.universityFaculty = universityFaculty;
    }

    public List<UniversityEducation> getUniversityEducations() {
        return universityEducations;
    }

    public void setUniversityEducations(List<UniversityEducation> universityEducations) {
        this.universityEducations = universityEducations;
    }

    public void addUniversityEducation(UniversityEducation universityEducation){
        universityEducations.add(universityEducation);
    }
}
