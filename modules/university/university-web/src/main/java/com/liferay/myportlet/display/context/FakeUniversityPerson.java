package com.liferay.myportlet.display.context;

import com.liferay.myportlet.fakemodel.UniversityEducation;
import com.liferay.myportlet.fakemodel.UniversityFaculty;
import com.liferay.myportlet.fakemodel.UniversityPerson;

import java.util.*;

public class FakeUniversityPerson {

    List<UniversityPerson> universityPersons = new ArrayList<>();



    public FakeUniversityPerson(){
        UniversityPerson person1 = new UniversityPerson(1,"محمد حسین" ,"باقری پور");
        UniversityFaculty faculty = new UniversityFaculty(1,1,"۲-۴۱۱");
        faculty.setDegree(1);
        faculty.setEmailAddress("test@gmail.com");
        faculty.setPhoneNumber("۸۲۰۸۴۳۱۰");
        person1.setUniversityFaculty(faculty);

        List<UniversityEducation> universityEducations = new ArrayList<>();
        UniversityEducation education1 = new UniversityEducation(1,1,"اتاوا","برق",2);
        education1.setStartDateYear(1373);
        education1.setEndDateYear(1380);
        universityEducations.add(education1);

        UniversityEducation education2 = new UniversityEducation(2,1,"تهران","برق-کنترل",1);
        education2.setStartDateYear(1368);
        education2.setEndDateYear(1372);
        universityEducations.add(education2);

        UniversityEducation education3 = new UniversityEducation(3,1,"تهران","برق-الکترونیک",0);
        education3.setStartDateYear(1364);
        education3.setEndDateYear(1368);
        universityEducations.add(education3);

        person1.setUniversityEducations(universityEducations);


        UniversityPerson person2 = new UniversityPerson(2,"عباس " ,"بحرالعلوم");
        person2.setUniversityFaculty(faculty);
        person2.setUniversityEducations(universityEducations);

        UniversityPerson person3 = new UniversityPerson(3,"مسعود" ,"سعید");
        person3.setUniversityFaculty(faculty);
        person3.setUniversityEducations(universityEducations);

        universityPersons.add(person1);
        universityPersons.add(person2);
        universityPersons.add(person3);
    }

    public List<UniversityPerson> getUniversityPersons() {
        return universityPersons;
    }
}
