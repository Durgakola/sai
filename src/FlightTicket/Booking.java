package FlightTicket;

public class Booking {
    public FlightTicket booking(int money,PassPort passPort,Customer1 customer1){
        FlightTicket ticket=new FlightTicket(20,"4thRow",12.30);
        System.out.println(passPort);
        System.out.println(customer1);
        return ticket;
    }
}
