public class First {
    public static abstract class Mammal {
        private String name;
        private Integer age;
        private Spine spine;

        public Mammal(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Spine getSpine() {
            return spine;
        }

        public void setSpine(Spine spine) {
            this.spine = spine;
        }
    }

    public static abstract class Animal extends Mammal {
        public Animal(String name, Integer age) {
            super(name, age);
        }
    }

    public static class Cat extends Mammal {
        private Wool wool;

        public Cat(String name, Integer age) {
            super(name, age);
            wool = new Wool("Белый");
            setSpine(new Spine(20));
        }

        public Wool getWool() {
            return wool;
        }
    }

    public static class Bear extends Mammal {
        private Wool wool;

        public Bear(String name, Integer age) {
            super(name, age);
            wool = new Wool("Бурый");
            setSpine(new Spine(100));
        }

        public Wool getWool() {
            return wool;
        }
    }

    public static class Whale extends Mammal implements Swimmable {
        public Whale(String name, Integer age) {
            super(name, age);
            setSpine(new Spine(1000));
        }

        @Override
        public void swim() {
            System.out.println(getName() + " плывет.");
        }
    }

    public static class Fish extends Animal implements Swimmable {
        public Fish(String name, Integer age) {
            super(name, age);
            setSpine(new Spine(5));
        }

        @Override
        public void swim() {
            System.out.println(getName() + " плывет.");
        }
    }

    public static class Spine {
        private Integer length;

        public Spine(Integer length) {
            this.length = length;
        }

        public Integer getLength() {
            return length;
        }
    }

    public static class Wool {
        private String color;

        public Wool(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }

    public interface Swimmable {
        void swim();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Vas9", 5);
        Bear bear = new Bear("Misha", 10);
        Whale whale = new Whale("Artem", 5);
        Fish fish = new Fish("Arkadii", 1);

        System.out.println(cat.getWool().getColor());
        System.out.println(bear.getWool().getColor());
        whale.swim();
        fish.swim();
    }
}