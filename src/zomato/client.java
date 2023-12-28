package zomato;

public class client {
    public static void main(String[] args){
        helloworld hello=new helloworld();
        try {
            int balance = hello.atm(1234, 100);
            System.out.println(balance);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
