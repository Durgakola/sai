package bookmyshow;

public class TicketService {

    public int tickets(int seats, int amount) throws TicketBlockException {
        try {
            TicketRepository ripo = new TicketRepository();
            ripo.tickets(2, 100);
        } catch (TicketBlockException t) {
            throw t;
        }
        return seats;
    }

}


