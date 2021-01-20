package com.practice.beans;

public class SmartPhone {

    private String name;
    private String yearOfManufacture;

    public SmartPhone(String name, String yearOfManufacture) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
