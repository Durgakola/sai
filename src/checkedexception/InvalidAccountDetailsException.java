package checkedexception;

public class InvalidAccountDetailsException extends Exception {
    private String balance;

    public InvalidAccountDetailsException(String accountNumber, String message) {
        super(message);
        this.balance = accountNumber;

    }
    public String getAccountNumber() {

        return balance;
    }
}
