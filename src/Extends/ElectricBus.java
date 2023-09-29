package Extends;

public class ElectricBus extends Bus {
    private final double minimalTankFull;
    private static int countElecro;

    public ElectricBus(double fuelConsumption, int number, double minimalTankFull) {
        super(fuelConsumption, number);
        this.minimalTankFull = minimalTankFull;
        countElecro++;
    }
    public static int getCountElecro(){
        return countElecro;
    }

    @Override
    public int powerReserve() {
        double remainingRate = getTankFull() - minimalTankFull;
        if (remainingRate <= 0) {
            return 0;
        }
        return (int) (remainingRate / getFuelConsumption());
    }

}
