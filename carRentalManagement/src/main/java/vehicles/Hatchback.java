package vehicles;

public class Hatchback extends Car {
    private String segment;

    public Hatchback(String brand, String model, String segment, String transmissionType, int trunkCapacity,
                     String color, int age, String fuelType, double dailyRentalRate) {
        super(brand, model, segment, transmissionType, trunkCapacity, color, age, fuelType, dailyRentalRate);
        this.segment = segment;
    }

    @Override
    public double getMonthlyRentalRate() {
        double multiplier;
        switch (segment) {
            case "Economy":
                multiplier = 1.0;
                break;
            case "Compact":
                multiplier = 1.2;
                break;
            case "Standard":
                multiplier = 1.4;
                break;
            case "Luxury":
                multiplier = 1.6;
                break;
            default:
                multiplier = 1.0; // Varsayılan değer
                break;
        }
        return dailyRentalRate * 30 * multiplier;
    }
}
