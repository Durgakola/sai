package Bank;

import Bank.BankService;

public class BankTestclass {
    public static void main(String[] args) {
        BankService bankService=new BankService();
       bankService.openAccount(new Customer("Kanakadurga","kola","9391976191","332389096789"));

        Customer customer=new Customer("Kanakadurga","kola","9391976191","332389096789");
        System.out.println(customer);
    }
}
