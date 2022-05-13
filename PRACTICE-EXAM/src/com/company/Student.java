package com.company;

import javafx.scene.control.Button;

public class Student {
    public Student(String enrolID, String fullName, String age) {
        this.enrolID = enrolID;
        this.fullName = fullName;
        this.age = age;
    }

    public String getEnrolID() {
        return enrolID;
    }

    public void setEnrolID(String enrolID) {
        this.enrolID = enrolID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String enrolID;
   public String fullName;
    public String age;


}
