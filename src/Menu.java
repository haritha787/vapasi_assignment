package src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;


public class Menu
{


    ArrayList<Integer> itemID = new ArrayList<>();

    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<>();

    int income;
    int validtodispense;
    ArrayList<String> transactionDetails = new ArrayList<>();

    Menu()
    {
        Collections.addAll(this.itemID, new Integer[]{111,222,333,444,555});
        Collections.addAll(this.name, new String[]{"miranda", "fanta", "cola","orange", "chocolate"});
        Collections.addAll(this.price, new Integer[]{40,100,99,111,5});

        this.income=1000;
        this.validtodispense=0;
    }

    String finditemandbalance(int idnumber)
    {
        String item = null;
        for (int i = 0; i < 5; i++)
        {
            if (idnumber == this.itemID.get(i))
            {
                item = this.name.get(i);
                break;
            }

        }
        if(item==null)
        {
            System.out.println("You have entered wrong Id");
        }

        return item;
    }

    int finditemandbalance(int idnumber, int payment, int viewAmount)
    {
        int balance=0;
        for (int i = 0; i < 5; i++)
        {
            if (idnumber == this.itemID.get(i)) //check corresponding itemID number
            {
                if(payment>=this.price.get(i))  //check for balance
                {
                    balance = payment-this.price.get(i); // price: 5; amt entered: 6; prev vm amt: 10;
                    this.income = this.income+this.price.get(i);
                    if(viewAmount==1)
                    {
                        System.out.println("Total Income of vending machine after your transaction is :" + this.income);
                    }else
                    {
                        System.out.println("You chose not to see amount in Vending Machine, Thank you");
                    }
                    this.validtodispense=1; //user entered valid itemID and sufficient payment to dispense
                    break;
                }else
                {
                    balance = 0;
                    System.out.println("Sorry, payment is not enough to dispense item");
                    this.validtodispense=0;
                    break;
                }

            }


        }

        return balance;
    }

    void getPreviousTransactions(int balance, int itemID, int payment, int viewPreviousTransaction)
    {


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String balanceString =Integer.toString(balance);
        String itemIDString =Integer.toString(itemID);
        String paymentString=Integer.toString(payment);
        String incomeString=Integer.toString(this.income);
        String transactionTime = dateTimeFormatter.format(time)+", Balance Given: "+balanceString+", itemID: "+itemIDString+", Payment Customer Paid: "+paymentString+", Amount in Vending Machine after dispense: "+incomeString;
        transactionDetails.add(transactionTime);
        if(viewPreviousTransaction == 1)
        {
            System.out.println("Please find the previous transaction details ");
            for (int i=0;i< transactionDetails.size();i++)
            {
                System.out.println(transactionDetails.get(i));
            }
        }else
        {
            System.out.println("You chose not to view Previous Transaction details");
        }

    }
}