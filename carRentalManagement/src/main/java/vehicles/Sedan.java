package vehicles;
public class Sedan extends Car {
    private static final double DISCOUNT_RATE = 0.07;

    public Sedan(String brand, String model, String segment, String transmissionType, int trunkCapacity,
                 String color, int age, String fuelType, double dailyRentalRate) {
        super(brand, model, segment, transmissionType, trunkCapacity, color, age, fuelType, dailyRentalRate);
    }

    @Override
    public double getMonthlyRentalRate() {
        double baseMonthlyRate = dailyRentalRate * 30;
        return baseMonthlyRate - (baseMonthlyRate * DISCOUNT_RATE);
    }
}
