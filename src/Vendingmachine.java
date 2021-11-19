package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vendingmachine
{

    public static void main(String[] args)
    {

        boolean useVendingMachine = true;
        Menu vendingmachineMenu = new Menu();
        try
        {
                while (useVendingMachine) {
                System.out.println("Do you want to use Vending Machine, if yes enter true else false");
                Scanner sc = new Scanner(System.in);
                useVendingMachine = sc.nextBoolean(); //get ItemID from user
                System.out.println("Select any item from the below menu:");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Item Id: " + vendingmachineMenu.itemID[i] + " Item name: " + vendingmachineMenu.name[i] + " Item price: " + vendingmachineMenu.price[i]);
                }
                System.out.println("Please enter ID and amount to pay (balance shall be given back)");

                int itemid = sc.nextInt(); //get ItemID from user
                int payment = sc.nextInt(); //get amount for payment from user

                System.out.println("Do you wish to see amount in Vending Machine, If yes enter 1");
                int viewAmountInVendingMachine = sc.nextInt(); //enter choice of user to view amount in Vending Machine

                System.out.println("Do you wish to see previous transactions in Vending Machine, If yes enter 1");
                int viewPreviousTransactions = sc.nextInt(); //enter choice of user to view amount in Vending Machine

                int balance = vendingmachineMenu.finditemandbalance(itemid, payment, viewAmountInVendingMachine); //get balance
                System.out.println("Please take your balance " + balance); //print balance to user

                String str = vendingmachineMenu.finditemandbalance(itemid); //get item to dispense
                if ((null != str) && (vendingmachineMenu.validtodispense != 0)) {
                    System.out.println("Please take your item dispensing: " + str);
                    System.out.println(" ");

                } else {
                    System.out.println("please retry");
                }

                vendingmachineMenu.getPreviousTransactions(balance, itemid, payment, viewPreviousTransactions); //get and print Previous Transaction List


            }
        }catch(InputMismatchException e)
        {
            System.out.println("Invalid Input, Please Retry");
            e.printStackTrace();

        }
    }

}
