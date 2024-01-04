package Bank;

public class Customer {
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String adharNo;

    public Customer(String firstName,String lastName,String mobileNo,String adharNo) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.adharNo=adharNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", adharNo='" + adharNo + '\'' +
                '}';
    }
}
