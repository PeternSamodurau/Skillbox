package Ananimus_class;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();
//        // после переопределения
       // OtherAnimal otherAnimal = new OtherAnimal();
       // otherAnimal.eat();

        // чтобы не создавать доп класс OtherAnimal пишем анонимный класс
//        Animal animal1 = new Animal(){
//            public void eat(){
//                System.out.println("Переопределили Animal в коде без класса");
//            }
//        };
//        // вызываем метод
//        animal1.eat();
        // теперь вызывается метод и переопределенный метод


        // ДЛЯ ИНТЕРФЕЙСА

//        AbleToEat ableToEat = new Animal();
//        ableToEat.eat();


        // пишем ананимный класс для ИНТЕРФЕЙСА!!!
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Ананимный класс на методе ИНТЕРФЕЙСА");
            }
        };
        ableToEat.eat();



    }
}
