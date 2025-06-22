package ru.aston.hometask2;

public class Boat extends Vehicle implements HasRotor, CargoVehicle {
    public Boat(final String name, final int year) {
        super(name, year);
    }

    @Override
    public void cargoStatus() {
        System.out.println(getName() + " ещё не загружен.");
    }

    @Override
    public void rotorStatus() {
        System.out.println("У " + getName() + " винт сломан.");
    }
}