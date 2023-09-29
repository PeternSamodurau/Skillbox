package Extends;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bus> busList = new ArrayList<>();
        ElectricBus electricBus1 = new ElectricBus(0.001,4654,0.1);
        ElectricBus electricBus2 = new ElectricBus(0.001,4654,0.1);
        System.out.println(electricBus1.equals(electricBus2));



        Class objectClass = electricBus1.getClass();
        System.out.println(objectClass.getName());

        System.out.println(electricBus2.getClass().getName() + "@" + Integer.toHexString(electricBus2.hashCode()));


        Bus bus1 = new Bus(0.001, 8234);
        Bus bus2 = new Bus(0.001, 1234);
        Bus bus3 = new Bus(0.002, 5233);
        busList.add(bus1);
        busList.add(bus2);
        busList.add(bus3);
        bus1.refuel(1);
        bus2.refuel(1);
        bus3.refuel(1);

        System.out.println("Количество автобусов" + " - " + (Bus.getCount()-ElectricBus.getCountElecro()));
        System.out.println("Количество ЭЛЕКТРОавтобусов" + " - " + ElectricBus.getCountElecro());


        System.out.println("Резерв:" + bus1.powerReserve());
        System.out.println("Едем 50 км:" + bus1.run(50));
        System.out.println("Резерв:" + bus1.powerReserve());
        System.out.println("Едем 900 км:" + bus1.run(900));
        System.out.println("Резерв:" + bus1.powerReserve());
        System.out.println("Едем 100 км:" + bus1.run(100));
        System.out.println("Резерв:" + bus1.powerReserve());
        System.out.println();
        System.out.println("Резерв:" + bus2.powerReserve());
        System.out.println("Едем 50 км:" + bus2.run(50));
        System.out.println("Резерв:" + bus2.powerReserve());
        System.out.println("Едем 900 км:" + bus2.run(900));
        System.out.println("Резерв:" + bus2.powerReserve());
        System.out.println("Едем 100 км:" + bus2.run(100));
        System.out.println("Резерв:" + bus2.powerReserve());


        Collections.sort(busList);

        System.out.println(busList);
    }
}