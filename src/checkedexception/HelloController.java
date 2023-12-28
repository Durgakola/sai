package checkedexception;

public class HelloController {
    public int atm(String accountNumber, String pin) throws InvalidAccountDetailsException {
        HelloService service=new HelloService();
        return service.atm(accountNumber, pin);
    }
}
