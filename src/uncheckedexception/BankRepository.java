package uncheckedexception;

public class BankRepository {

    public int atm(String accountNumber, String pin) {
        String existingAccountNumber = "1234";
        String exstingPin = "123";

        try {

            int balance = 500;

            if (existingAccountNumber.equalsIgnoreCase(accountNumber) && exstingPin.equalsIgnoreCase(pin)) {
                System.out.println("Balance:" + balance);
            } else {
                throw new InvalidAccountDetailsException(ErrorCode.INVALID_CREDENTIALS.toString(), "Invalid credentials");
            }
            return balance;
        } finally {
            System.out.println("from BankRepository");

        }
    }
}
