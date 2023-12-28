public class Helloworld {
    public int atm(int cardnumber, int reqAmt) throws Exception {
        int balance = 0;
        if (balance >= reqAmt) {
            balance = balance - reqAmt;
        }
        throw new Exception("Insufficient balance");
    }

}
