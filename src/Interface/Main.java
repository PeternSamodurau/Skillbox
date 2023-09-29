package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(9646,"HONDA","cool"));
        carList.add(new Car(8644,"MAZDA","cool"));
        for (Car car: carList){
            car.fuel();
            car.run();
        }
        Collections.sort(carList);
        System.out.println(carList);

        List<Bus> busList = new ArrayList<>();

        busList.add(new Bus(6332,"BusB","super"));
        busList.add(new Bus(6332,"BusC","super"));
        busList.add(new Bus(6332,"BusA","super"));

        for (Bus bus: busList){
            bus.fuel();
            bus.run();
        }
        Collections.sort(busList);
        System.out.println(busList);
    }
}
