package practice;

public class trainTicket {
    private int seatNo;
    private String Birth;

    public trainTicket(int seatNo, String Birth) {
        this.seatNo = seatNo;
        this.Birth=Birth;
    }

    @Override
    public String toString() {
        return "trainTicket{" +
                "seatNo=" + seatNo +
                ", Birth='" + Birth + '\'' +
                '}';

    }
}
