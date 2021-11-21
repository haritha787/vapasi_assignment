package src.Abstraction;

public class AppForBankDetails {
    // get denominations from 3 different banks using abstract methods
    public static void main(String[] args) {
        Bank bank1= new Bank1("SBI");
        Bank bank2 = new Bank2("Bank Of Baroda");
        Bank bank3 = new Bank3("Syndicate Bank");

        System.out.println("Hello Customer, Please find the denominations available in 3 different Banks");
        bank1.printBankName();
        bank2.printBankName();
        bank3.printBankName();
        bank1.getDenominationsOfBank();
        bank2.getDenominationsOfBank();
        bank3.getDenominationsOfBank();

    }
}
