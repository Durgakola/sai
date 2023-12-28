package checkedexception;

import checkedexception.InvalidAccountDetailsException;

public class ExceptionClient {

    public static void main(String[] args) {

        try {
            HelloController service = new HelloController();
            service.atm("1234", "123");


        } catch (InvalidAccountDetailsException e) {
            System.out.println(e.getAccountNumber()+"  "+e.getMessage());
        }
    }
}
