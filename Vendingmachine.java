import java.util.Scanner;

public class Vendingmachine
{

    public static void main(String[] args)
    {
        Menu vendingmachine= new Menu();
        while(true)
        {
                System.out.println("Select any item from the below menu:");
                for(int i=0; i<5; i++)
                {
                    System.out.println("Item Id: "+vendingmachine.itemID[i]+" Item name: "+vendingmachine.name[i]+" Item price: "+vendingmachine.price[i]);
                }
                System.out.println("Please enter ID and amount to pay (balance shall be given back)");
                Scanner sc = new Scanner(System.in);
                int itemid = sc.nextInt();
                int payment = sc.nextInt();
                int balance=vendingmachine.finditemandbalance(itemid,payment);
                System.out.println("Please take your balance "+balance);
                String str=vendingmachine.finditemandbalance(itemid);
                if((null != str) && (vendingmachine.validtodispense != 0))
                {
                    System.out.println("Please take your item dispensing: " + str);

                }
                else
                {
                    System.out.println("please retry");
                }




        }



    }




}
