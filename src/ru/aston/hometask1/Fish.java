package ru.aston.hometask1;

public class Fish extends Animal implements Swimmable {
    private final int fishSpineLength = 5;

    public Fish(String name, Integer age) {
        super(name, age);
        setSpine(new Spine(fishSpineLength));
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет.");
    }
}