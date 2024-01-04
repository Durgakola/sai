package Bank;

public class BankAccount {
    private String AccountNo;
    private String ifscCode;

    private double balance;
    public BankAccount(String accountNo,String ifscCode,double balance) {
        this.AccountNo = accountNo;
        this.ifscCode=ifscCode;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountNo='" + AccountNo + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", balance=" + balance +
                '}';
    }
}
