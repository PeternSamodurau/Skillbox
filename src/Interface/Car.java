package Interface;

public class Car extends Auto implements Comparable<Car>{
    public String noNameCar;

    public Car(int id, String name,String noNameCar) {
        super(id, name);
        this.noNameCar = noNameCar;
    }
    @Override
    public void run() {
        System.out.println("I am a car, i am run");
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + noNameCar + '\'' +
                '}';
    }


    @Override
    public int compareTo(Car o) {
        return this.id - o.id;
    }
}
