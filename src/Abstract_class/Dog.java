package Abstract_class;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("i eat cat");
    }

    @Override
    public void  sound() {
        System.out.println("i am say bark");
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
