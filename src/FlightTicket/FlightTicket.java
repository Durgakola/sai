package FlightTicket;

public class FlightTicket {
    private int seatNo;
    private String row;
    private double time;

    public FlightTicket(int seatNo,String row,double time) {
        this.seatNo = seatNo;
        this.row=row;
        this.time=time;
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "seatNo=" + seatNo +
                ", row='" + row + '\'' +
                ", time=" + time +
                '}';
    }
}
