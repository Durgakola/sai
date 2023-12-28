package bookmyshow;

public class TicketRepository {
    public int tickets(int seats, int amount) throws TicketBlockException {
        int noOfseats = 20;
        int ticketamount = 100;

        if (seats <= noOfseats && amount <= ticketamount) {
            noOfseats = noOfseats - seats;
            System.out.println("AvailableSeats: " + noOfseats);
        }
        else{
            throw new TicketBlockException(ErrorCode.NO_TICKETS.toString(),"No seats are Available");
        }
        return noOfseats;
    }
}