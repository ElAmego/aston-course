public class Second {
    public static abstract class Vehicle {
        String name;
    }

    public static class Airplane extends Vehicle implements HasWheels, HasRotor, HasWings, CargoVehicle {
        private String name;

        public Airplane() {
            name = "Самолет";
        }

        public String getName() {
            return name;
        }

        @Override
        public void cargo() {
            System.out.println(getName() + " перевозит груз.");
        }

        @Override
        public void hasRotor() {
            System.out.println(getName() + " летит с использованием винта.");
        }

        @Override
        public void hasWheels() {
            System.out.println(getName() + " использует колеса.");
        }

        @Override
        public void hasWings() {
            System.out.println(getName() + " летит с использованием крыльев.");
        }
    }

    public static class Helicopter extends Vehicle implements HasWheels, HasRotor, CargoVehicle {
        private String name;

        public Helicopter() {
            name = "Вертолёт";
        }

        public String getName() {
            return name;
        }

        @Override
        public void cargo() {
            System.out.println(getName() + " перевозит груз.");
        }

        @Override
        public void hasRotor() {
            System.out.println(getName() + " летит с использованием винта.");
        }

        @Override
        public void hasWheels() {
            System.out.println(getName() + " использует колеса.");
        }
    }

    public static class Boat extends Vehicle implements HasRotor, CargoVehicle {
        private String name;

        public Boat() {
            name = "Катер";
        }

        public String getName() {
            return name;
        }

        @Override
        public void cargo() {
            System.out.println(getName() + " перевозит груз.");
        }

        @Override
        public void hasRotor() {
            System.out.println(getName() + " плывет с использованием винта.");
        }
    }

    public static class Tanker extends Vehicle implements HasRotor, CargoVehicle {
        private String name;

        public Tanker() {
            name = "Танкер";
        }

        public String getName() {
            return name;
        }

        @Override
        public void cargo() {
            System.out.println(getName() + " перевозит груз.");
        }

        @Override
        public void hasRotor() {
            System.out.println(getName() + " плывет с использованием винта.");
        }
    }

    public static class Truck extends Vehicle implements HasWheels, CargoVehicle {
        private String name;

        public Truck() {
            name = "Грузовик";
        }

        public String getName() {
            return name;
        }

        @Override
        public void cargo() {
            System.out.println(getName() + " перевозит груз.");
        }

        @Override
        public void hasWheels() {
            System.out.println(getName() + " использует колеса.");
        }
    }

    public static class Taxi extends Vehicle implements HasWheels {
        private String name;

        public Taxi() {
            name = "Такси";
        }

        public String getName() {
            return name;
        }

        @Override
        public void hasWheels() {
            System.out.println(getName() + " использует колеса.");
        }
    }

    public interface HasWheels {
        void hasWheels();
    }

    public interface HasRotor {
        void hasRotor();
    }

    public interface HasWings {
        void hasWings();
    }

    public interface CargoVehicle {
        void cargo();
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.cargo();
        airplane.hasRotor();
        airplane.hasWheels();
        airplane.hasWings();
        
        Helicopter helicopter = new Helicopter();
        helicopter.cargo();
        helicopter.hasRotor();
        helicopter.hasWheels();
        
        Boat boat = new Boat();
        boat.cargo();
        boat.hasRotor();

        Tanker tanker = new Tanker();
        tanker.cargo();
        tanker.hasRotor();

        Truck truck = new Truck();
        truck.cargo();
        truck.hasWheels();

        Taxi taxi = new Taxi();
        taxi.hasWheels();
    }
}