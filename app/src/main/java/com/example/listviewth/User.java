package com.example.listviewth;

public class User {
    private String name;
    private String idStudent;
    private int picProfile;

    public User(String name, String idStudent, int picProfile) {
        this.name = name;
        this.idStudent = idStudent;
        this.picProfile = picProfile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public int getPicProfile() {
        return picProfile;
    }

    public void setPicProfile(int picProfile) {
        this.picProfile = picProfile;
    }
}
