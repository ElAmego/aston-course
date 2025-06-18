package dz1;

public class Mammal {
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