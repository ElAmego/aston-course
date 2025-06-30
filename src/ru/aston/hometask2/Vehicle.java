package ru.aston.hometask2;

public abstract class Vehicle {
    private String name;
    private int year;

    public Vehicle(final String name, final int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}