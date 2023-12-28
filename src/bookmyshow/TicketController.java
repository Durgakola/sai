package bookmyshow;

public class TicketController {
    public int tickets(int seats, int amount) throws TicketBlockException {
        TicketService ser = new TicketService();
        ser.tickets(seats, amount);
        return seats;
    }
}
