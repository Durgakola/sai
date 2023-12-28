package uncheckedexception;

public class BankController {
    public int atm(String accountNumber, String pin) {
       BankService service=new BankService();
        return service.atm(accountNumber, pin);
    }
}