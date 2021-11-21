package src.Abstraction;

import java.util.ArrayList;
import java.util.Collections;

public class Bank2 extends Bank
{
    protected ArrayList<Integer> denominationsAvailable = new ArrayList<>();
    Bank2(String bankName)
    {
        super(bankName);
        Collections.addAll(denominationsAvailable, new Integer[]{2000,500,200,50});

    }

    @Override
    void getDenominationsOfBank()
    {
        System.out.println("Denominations available in BANK2 - "+bankName+" : "+this.denominationsAvailable+" Currency: "+this.currency);
    }

}
