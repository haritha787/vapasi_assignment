import java.util.Scanner;

public class Calculator
{

    public static void main(String[] args)
    {
        int i=1;
        while(i == 1 )
        {
            int input1 = 0;
            int input2 = 0;
            int output =0;
            Scanner sc = new Scanner(System.in);
            System.out.println("select an operation to perform");
            System.out.println("To add enter 1, multi enter 2, sub enter 3, divi enter 4");
            int operation = sc.nextInt();
            System.out.print("Enter first number- ");
            input1 = sc.nextInt();
            System.out.print("Enter second number- ");
            input2 = sc.nextInt();
            switch(operation)
            {
                case 1:
                    output=input1+input2;
                    break;
                case 2:
                    output=input1*input2;
                    break;
                case 3:
                    output=input1-input2;
                    break;
                case 4:
                    if(input2 != 0)
                        output=input1/input2;
                    else
                        System.out.println("cant div by 0");
                    break;
                default:
                    System.out.println("You entered invalid operation, please retry");
                    break;

            }
            System.out.println("The final output is "+output);
            System.out.println("Do you want to continue operation? If yes enter 1");
            i = sc.nextInt();
        }

    }

}
