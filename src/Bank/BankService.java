package Bank;

import Bank.BankAccount;

public class BankService {
    public BankAccount openAccount(Customer customer){
        BankAccount bankAccount=new BankAccount("234323432523","SBI2345FD",100000);
        return bankAccount;
    }
}
