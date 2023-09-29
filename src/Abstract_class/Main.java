package Abstract_class;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Tom"));
        catList.add(new Cat("Dron"));

        for (Cat cat: catList){
            cat.eat();
            cat.sound();
        }

        Dog dog = new Dog("Boy");
        dog.sound();
        dog.eat();

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);


        List<Animal> list = new ArrayList<>();
        list.addAll(catList);
        list.addAll(dogList);

        Collections.sort(list);

        System.out.println(list);

    }
}