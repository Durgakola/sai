package Encapsulation;

public class Address {
    private String village;
    private int doorNo;
    private String city;

    public String getVillage() {
        return village;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public String getCity() {
        return city;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
