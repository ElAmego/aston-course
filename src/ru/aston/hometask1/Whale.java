package ru.aston.hometask1;

public class Whale extends Mammal implements Swimmable {
    private final int whaleSpineLength = 1000;

    public Whale(String name, Integer age) {
        super(name, age);
        setSpine(new Spine(whaleSpineLength));
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет.");
    }
}