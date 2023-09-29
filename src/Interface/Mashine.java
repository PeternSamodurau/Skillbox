package Interface;

public interface Mashine{   // интерфейс не содержит переменных кроме КОНСТАНТ,конструкторов и собственных методов кроме default
    int FUEL_VALUE = 60;

    void run();           // только мододы,которые реализуются в классах, абстактных классах и дочерних

    default void fuel() {
        System.out.println("Машина заправлена полностью - " + +FUEL_VALUE + " л.");
        af();
    }
    static void af(){
        System.out.println("я статический метод");      // могут содержать статьческие методы для внутренней реализации
    };
}
