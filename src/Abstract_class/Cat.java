package Abstract_class;
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I EAT MOUSE");
    }

    @Override
    public void sound() {
        System.out.println("I SAY MEOW");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }
}
