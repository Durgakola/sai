package zomato;

public class helloworld {
    public int atm(int cardnumber, int reqamt) throws Exception {
        int balance = 500;
        if (balance >= reqamt) {
            balance = balance - reqamt;
//            System.out.println(balance);
        }
            else{
                throw new Exception("Insufficient balance");
            }
            return balance;
        }
    }
