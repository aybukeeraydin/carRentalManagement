package customers;

public class CorporateCustomer extends Customer {
    private String taxNumber;

    public CorporateCustomer(String name, String phoneNumber, String taxNumber) {
        super(name, phoneNumber);
        this.taxNumber = taxNumber;
    }
}
