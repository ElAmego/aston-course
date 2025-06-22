package ru.aston.hometask2;

public class Airplane extends Vehicle implements HasWheels, HasRotor, HasWings, CargoVehicle {
    public Airplane(final String name, final int year) {
        super(name, year);
    }

    @Override
    public void cargoStatus() {
        System.out.println(getName() + " загружен.");
    }

    @Override
    public void rotorStatus() {
        System.out.println("У " + getName() + " сломан винт.");
    }

    @Override
    public void wheelsStatus() {
        System.out.println("У " + getName() + " давление в шинах в норме.");
    }

    @Override
    public void wingsStatus() {
        System.out.println("Крылья у " + getName() + " в норме.");
    }
}