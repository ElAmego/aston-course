package dz1;

public class Cat extends Mammal {
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
