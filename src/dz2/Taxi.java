package dz2;

public class Taxi extends Vehicle implements HasWheels {
    public Taxi(final String name, final int year) {
        super(name, year);
    }

    @Override
    public void wheelsStatus() {
        System.out.println("У " + getName() + " отсутствуют колеса.");
    }
}