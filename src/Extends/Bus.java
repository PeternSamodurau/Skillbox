package Extends;

import java.util.Objects;

public class Bus implements Comparable<Bus>{
    private double tankFull;       // 0-1
    private final double fuelConsumption;   //  0-1/1km
    private final int number;
    private static int count;

    public static int getCount(){
        return count;
    }

    public Bus(double fuelConsumption, int number) {
        this.fuelConsumption = fuelConsumption;
        this.number = number;
        count++;
    }
    public boolean run (int distance){
        if (powerReserve() < distance){
            return false;
        }
        tankFull -= distance * fuelConsumption;
        return true;
    }
    public final void refuel(double tankRate){
        double total = tankFull + tankRate;
        tankFull = total > 1 ? 1 : total;
    }
    public int powerReserve(){
        return (int) (tankFull/fuelConsumption);
    }
    public double getFuelConsumption(){
        return  fuelConsumption;
    }
    public double getTankFull(){
        return tankFull;
    }

    @Override
    public int compareTo(Bus o) {
     return o.number - this.number;
    }

    @Override
    public String toString() {
        return "{" +
                "tankFull=" + tankFull +
                ", fuelConsumption=" + fuelConsumption +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.tankFull, tankFull) == 0 && Double.compare(bus.fuelConsumption, fuelConsumption) == 0 && number == bus.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tankFull, fuelConsumption, number);
    }

}