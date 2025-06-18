package dz1;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, Integer age) {
        super(name, age);
        setSpine(new Spine(5));
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет.");
    }
}
