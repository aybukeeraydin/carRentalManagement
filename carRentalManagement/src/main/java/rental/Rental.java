package rental;
public class Rental {
    private vehicles.Car car;
    private customers.Customer  customer;
    private int rentalDays;
    private boolean isMonthly;

    public Rental(vehicles.Car car, customers.Customer customer, int rentalDays, boolean isMonthly) {
        this.car = car;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.isMonthly = isMonthly;
    }

    public double calculateTotalCost() {
        if (isMonthly) {
            return car.getMonthlyRentalRate();
        } else {
            return car.getDailyRentalRate() * rentalDays;
        }
    }
}
