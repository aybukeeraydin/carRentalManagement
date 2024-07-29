package vehicles;
public class SUV extends Car {
    public SUV(String brand, String model, String segment, String transmissionType, int trunkCapacity,
               String color, int age, String fuelType, double dailyRentalRate) {
        super(brand, model, segment, transmissionType, trunkCapacity, color, age, fuelType, dailyRentalRate);
    }

    @Override
    public double getMonthlyRentalRate() {
        throw new UnsupportedOperationException("SUVs can only be rented on a daily basis.");
    }
}
