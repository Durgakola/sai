package checkedexception;

public class HelloService {
    public int atm(String accountNumber, String pin) throws InvalidAccountDetailsException {
            int amount = 0;
            try {
                HelloRepository hello = new HelloRepository();
                hello.atm(accountNumber, pin);

            } catch (Exception e) {
                throw e;
            }
            return amount;
        }
    }