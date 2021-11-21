package src.Abstraction;

import java.util.ArrayList;
import java.util.Collections;

class Bank1 extends Bank{

          protected ArrayList<Integer> denominationsAvailable = new ArrayList<>();
          Bank1(String bankName)
          {
              super(bankName);
              Collections.addAll(denominationsAvailable, new Integer[]{2000, 1000, 500, 100, 50, 20, 10});

          }



    @Override
    void getDenominationsOfBank()
    {
        System.out.println("Denominations available in BANK1 - "+bankName+" : "+this.denominationsAvailable);
    }



}
