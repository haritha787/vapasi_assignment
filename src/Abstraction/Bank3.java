package src.Abstraction;

import java.util.ArrayList;
import java.util.Collections;

public class Bank3 extends Bank
{
    protected ArrayList<Integer> denominationsAvailable = new ArrayList<>();
    Bank3(String bankName)
    {
        super(bankName);
        Collections.addAll(denominationsAvailable, new Integer[]{500,200,100,50});

    }

    @Override
    void getDenominationsOfBank() {
        System.out.println("Denominations available in BANK3 - "+bankName+" : "+this.denominationsAvailable+" Currency: "+this.currency);
    }


}
