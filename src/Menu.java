package src;

public class Menu
{

    int[] itemID = new int[5];
    String[] name = new String[5];
    int[] price = new int[5];
    int income;
    int validtodispense;

    Menu()
    {

        this.itemID[0] = 111;
        this.itemID[1] = 222;
        this.itemID[2] = 333;
        this.itemID[3] = 444;
        this.itemID[4] = 555;
        this.name[0] = "miranda";
        this.name[1] = "fanta";
        this.name[2] = "cola";
        this.name[3] = "orange";
        this.name[4] = "chocolate";
        this.price[0] = 40;
        this.price[1] = 100;
        this.price[2] = 99;
        this.price[3] = 111;
        this.price[4] = 5;
        this.income=1000;
        this.validtodispense=0;
    }

    String finditemandbalance(int idnumber)
    {
        String item = null;
        for (int i = 0; i < 5; i++)
        {
            if (idnumber == this.itemID[i])
            {
                item = this.name[i];
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
            if (idnumber == this.itemID[i]) //check corresponding itemID number
            {
                if(payment>=this.price[i])  //check for balance
                {
                    balance = payment-this.price[i]; // price: 5; amt entered: 6; prev vm amt: 10;
                    this.income = this.income+this.price[i];
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
}