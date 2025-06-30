package ru.aston.hometask2;

public class Truck extends Vehicle implements HasWheels, CargoVehicle {
    public Truck(final String name, final int year) {
        super(name, year);
    }

    @Override
    public void cargoStatus() {
        System.out.println(getName() + " загружен.");
    }

    @Override
    public void wheelsStatus() {
        System.out.println("У " + getName() + " давление в шинах ниже нормы.");
    }
}