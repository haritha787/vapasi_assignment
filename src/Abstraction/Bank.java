package src.Abstraction;

import java.util.ArrayList;

abstract class Bank {
     protected String bankName;
     protected String currency;

      Bank(String bankNameInput)
     {
         this.bankName=bankNameInput;
         this.currency= "Rupees";
     }

     abstract void getDenominationsOfBank();

      void printBankName()
      {
          System.out.println("Bank Name: "+this.bankName);
      }

}
