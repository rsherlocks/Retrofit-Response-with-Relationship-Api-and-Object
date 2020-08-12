package com.example.androidshaper.retrofitgetresponsewithrelationship;

public class ObjectDesignClass {
    private String fullname;
    private String dateofbirth;
    private String gender;
    private int country_id;
    private PositionClass position;

    public ObjectDesignClass() {
    }

    public ObjectDesignClass(String fullname, String dateofbirth, String gender, int country_id, PositionClass positionOfPlayer) {
        this.fullname = fullname;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
        this.country_id = country_id;
        this.position = positionOfPlayer;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public PositionClass getPositionOfPlayer() {
        return position;
    }

    public void setPositionOfPlayer(PositionClass positionOfPlayer) {
        this.position = positionOfPlayer;
    }
}
