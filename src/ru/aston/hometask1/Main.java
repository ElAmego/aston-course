package ru.aston.hometask1;

public class Main {
    public static void main(String[] args) {
        Mammal cat = new Cat("Vas9", 5);
        Mammal bear = new Bear("Misha", 10);
        Mammal whale = new Whale("Artem", 5);
        Animal fish = new Fish("Arkadii", 1);

        System.out.println(cat.getName());
        System.out.println(bear.getSpine().getLength());
        System.out.println(whale.getAge());
        System.out.println(fish.getSpine().getLength());
    }
}