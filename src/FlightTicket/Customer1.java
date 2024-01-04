package FlightTicket;

public class Customer1 {
    private String name;
    private int age;
    private int mobileNo;
    private String village;

    public Customer1(String name,int age,int mobileNo,String village) {
        this.name = name;
        this.age=age;
        this.mobileNo=mobileNo;
        this.village=village;
    }

    @Override
    public String toString() {
        return "Customer1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobileNo=" + mobileNo +
                ", village='" + village + '\'' +
                '}';
    }
}
