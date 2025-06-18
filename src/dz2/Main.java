package dz2;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane("Boeing-747", 2005);
        System.out.println(airplane.getName());
        System.out.println(airplane.getYear());

        Helicopter helicopter = new Helicopter("Mi-8", 1996);
        System.out.println(helicopter.getName());
        System.out.println(helicopter.getYear());
        helicopter.cargoStatus();
    }
}