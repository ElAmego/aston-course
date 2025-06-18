package dz1;

public class Whale extends Mammal implements Swimmable {
    public Whale(String name, Integer age) {
        super(name, age);
        setSpine(new Spine(1000));
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет.");
    }
}
