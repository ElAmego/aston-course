package ru.aston.hometask1;

public class Bear extends Mammal {
    private final String bearWoolColor = "Бурый";
    private final int bearSpineLength = 100;

    private Wool wool;

    public Bear(String name, Integer age) {
        super(name, age);
        wool = new Wool(bearWoolColor);
        setSpine(new Spine(bearSpineLength));
    }

    public Wool getWool() {
        return wool;
    }
}