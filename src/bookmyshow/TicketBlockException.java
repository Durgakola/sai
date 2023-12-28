package bookmyshow;

public class TicketBlockException extends Exception {

    private String tickes;

    public TicketBlockException(String tickes,String message) {
        super(message);
        this.tickes=tickes;

    }

    public String getTickes() {
        return tickes;
    }
}
