package ru.aston.hometask1;

public class Cat extends Mammal {
    private final String catWoolColor = "Белый";
    private final int catSpineLength = 20;

    private Wool wool;

    public Cat(String name, Integer age) {
        super(name, age);
        wool = new Wool(catWoolColor);
        setSpine(new Spine(catSpineLength));
    }

    public Wool getWool() {
        return wool;
    }
}