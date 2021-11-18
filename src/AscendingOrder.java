import java.util.Scanner;
import java.lang.*;
public class AscendingOrder
{
    public static void main(String[] args)
    {
        int number = 0;
        System.out.println("Enter a number of 1 to 10 digits");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        String string_number = Integer.toString(number);

        char arr[]=new char[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i]='/';
        }
        // Traversing through the string using for loop
        for (int i = 0; i < string_number.length(); i++)
        {
            arr[i]=string_number.charAt(i);
        }
        for (int i = 0; i < string_number.length()-1; i++)
        {
            for (int j=i+1; j < string_number.length(); j++)
            {
                if (arr[i] > arr[j])
                {
                    char temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }


            }

        }
        for (int i=0; i < string_number.length(); i++)
        {
            System.out.println(arr[i]);
        }
        String str = new String(arr);
        String str1 = str.replace('/',' ');
        System.out.println(str1);


    }

}


/// re attempt this problem with out converting into char array.
// convert into into array