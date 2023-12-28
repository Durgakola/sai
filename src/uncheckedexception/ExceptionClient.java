package uncheckedexception;

public class ExceptionClient {
    public static void main(String[] args) {

        try {
            BankController service = new BankController();
            service.atm("1234", "123");


        } catch (InvalidAccountDetailsException e) {
            System.out.println(e.getAccountNumber()+"  "+e.getMessage());
        }
    }
}
