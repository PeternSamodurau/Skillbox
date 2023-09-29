package Abstract_class;

public abstract class Animal implements Comparable<Animal> {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void sound();



}
