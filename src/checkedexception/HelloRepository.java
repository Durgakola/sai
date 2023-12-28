package checkedexception;

import checkedexception.ErrorCode;
import checkedexception.InvalidAccountDetailsException;

public class HelloRepository {

    public int atm(String accountNumber, String pin) throws InvalidAccountDetailsException {
        String existingAccountNumber = "1234";
        String exstingPin = "123";

        int balance = 1000;

        if (existingAccountNumber.equalsIgnoreCase(accountNumber) && exstingPin.equalsIgnoreCase(pin)) {
            System.out.println("Balance:" + balance);
        } else {
            throw new InvalidAccountDetailsException(ErrorCode.INVALID_CREDENTIALS.toString(), "Invalid credentials");
        }
        return balance;
    }
}
