package vehicles;
public abstract class Car {
    protected String brand;
    protected String model;
    protected String segment;
    protected String transmissionType;
    protected int trunkCapacity;
    protected String color;
    protected int age;
    protected String fuelType;
    protected double dailyRentalRate;

    public Car(String brand, String model, String segment, String transmissionType, int trunkCapacity,
               String color, int age, String fuelType, double dailyRentalRate) {
        this.brand = brand;
        this.model = model;
        this.segment = segment;
        this.transmissionType = transmissionType;
        this.trunkCapacity = trunkCapacity;
        this.color = color;
        this.age = age;
        this.fuelType = fuelType;
        this.dailyRentalRate = dailyRentalRate;
    }

    public abstract double getMonthlyRentalRate();

    public double getDailyRentalRate() {
        return dailyRentalRate;
    }
}
