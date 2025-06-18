package dz2;

public class Helicopter extends Vehicle implements HasWheels, HasRotor, CargoVehicle {
    public Helicopter(final String name, final int year) {
        super(name, year);
    }

    @Override
    public void cargoStatus() {
        System.out.println(getName() + " ещё не загружен.");
    }

    @Override
    public void rotorStatus() {
        System.out.println("У " + getName() + " винт в норме.");
    }

    @Override
    public void wheelsStatus() {
        System.out.println("У " + getName() + " давление в шинах в норме.");
    }
}