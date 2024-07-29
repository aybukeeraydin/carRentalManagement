package customers;

public class IndividualCustomer extends Customer {
    private String tcIdentityNumber;
    private String surName;


    public IndividualCustomer(String name,String surName, String phoneNumber) {
        super(name, phoneNumber);
        this.surName = surName;
        this.tcIdentityNumber = tcIdentityNumber;

    }
}
