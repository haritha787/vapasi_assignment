package src.Abstraction;

import java.util.ArrayList;

abstract class Bank {
     protected String bankName;


      Bank(String bankNameInput)
     {
         this.bankName=bankNameInput;

     }

     abstract void getDenominationsOfBank();

      void printBankName()
      {
          System.out.println("Bank Name: "+this.bankName);
      }

}
