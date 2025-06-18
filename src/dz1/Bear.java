package dz1;

public class Bear extends Mammal {
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
