package FlightTicket;

public class PassPort {
    private String name;
    private String place;
    private double dateOfBirth;
    private double passPortNo;
    private String Signature;

    public PassPort(String name,String place,double dateOfBirth,double passPortNo,String signature) {
        this.name = name;
        this.place=place;
        this.dateOfBirth=dateOfBirth;
        this.passPortNo=passPortNo;
        this.Signature=signature;
    }

    @Override
    public String toString() {
        return "PassPort{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", passPortNo=" + passPortNo +
                ", Signature='" + Signature + '\'' +
                '}';
    }
}
