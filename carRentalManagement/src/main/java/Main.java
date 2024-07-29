import vehicles.Car;
import vehicles.Sedan;
import vehicles.Hatchback;
import vehicles.SUV;
import customers.IndividualCustomer;
import customers.CorporateCustomer;
import rental.Rental;

public class Main {
    public static void main(String[] args) {
        // Araçları oluştur
        Car sedan = new Sedan("Toyota", "Camry", "Sedan", "Automatic", 500, "White", 2, "Petrol", 800);
        Car hatchback = new Hatchback("Honda", "Civic", "Compact", "Manual", 400, "Black", 1, "Petrol", 600);
        Car suv = new SUV("Ford", "Explorer", "SUV", "Automatic", 700, "Blue", 3, "Diesel", 1200);

        // Müşterileri oluştur
        IndividualCustomer individualCustomer = new IndividualCustomer("Ali Yılmaz", "1234567890", "12345678901");
        CorporateCustomer corporateCustomer = new CorporateCustomer("TechCorp", "0987654321", "9876543210");

        // Kiralamaları oluştur
        Rental rental1 = new Rental(sedan, individualCustomer, 5, false);
        Rental rental2 = new Rental(hatchback, corporateCustomer, 30, true);
        Rental rental3 = new Rental(suv, corporateCustomer, 7, false);

        // Kiralama maliyetlerini hesapla ve yazdır
        System.out.println("Sedan Rental Cost: " + rental1.calculateTotalCost() + " ₺");
        System.out.println("Hatchback Rental Cost: " + rental2.calculateTotalCost() + " ₺");
        System.out.println("SUV Rental Cost: " + rental3.calculateTotalCost() + " ₺");
    }
}
