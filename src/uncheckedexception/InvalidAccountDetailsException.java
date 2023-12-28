package uncheckedexception;

public class InvalidAccountDetailsException extends RuntimeException{

private String balance;

    public InvalidAccountDetailsException(String accountNumber, String message) {
        super(message);
       this.balance = accountNumber;

    }
    public String getAccountNumber() {

        return balance;
    }
}
