package uncheckedexception;

public class BankService {
    public int atm(String accountNumber, String pin) {
        int amount = 0;
        try {
            BankRepository bank = new BankRepository();
            bank.atm(accountNumber, pin);

        } catch (Exception e) {
            throw e;
        }
        return amount;
    }
}
