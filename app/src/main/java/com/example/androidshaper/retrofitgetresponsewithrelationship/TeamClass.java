package com.example.androidshaper.retrofitgetresponsewithrelationship;

public class TeamClass {

    private String name;
    private int country_id;

    public TeamClass(String name, int country_id) {
        this.name = name;
        this.country_id = country_id;
    }

    public TeamClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
}
