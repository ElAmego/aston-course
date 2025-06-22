package ru.aston.hometask2;

public class Tanker extends Vehicle implements HasRotor, CargoVehicle {
    public Tanker(final String name, final int year) {
        super(name, year);
    }

    @Override
    public void cargoStatus() {
        System.out.println(getName() + " загружен.");
    }

    @Override
    public void rotorStatus() {
        System.out.println("У " + getName() + " винт в норме.");
    }
}