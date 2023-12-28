package bookmyshow;

public class TicketBookingClient {
    public static void main(String[] args) {
        try {
            TicketController con = new TicketController();
            con.tickets(2, 100);
        }
        catch (TicketBlockException t){
            System.out.println(t.getTickes()+" "+t.getMessage());
        }
    }
}
