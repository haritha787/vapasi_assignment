package src.Polymorphism;

import java.util.Scanner;

public class LargestNumber {
    //check overloading concept
    public static void main(String[] args)
    {

        LargestNumber.createObjectForLargestTwoNumbers();
        LargestNumber.createObjectForLargestThreeNumbers();
    }
    static void createObjectForLargestTwoNumbers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey I am helping you find largest of 2 numbers");
        System.out.println("Enter the first input number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second input number");
        int secondNumber = sc.nextInt();

        LargestNumber twoNumbers = new LargestNumber();
        int resultOfLargestTwoNumbers = twoNumbers.largestOfNumbers(firstNumber, secondNumber);
        System.out.println(resultOfLargestTwoNumbers);
    }
    static void createObjectForLargestThreeNumbers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey I am helping you find largest of three numbers");
        System.out.println("Enter the first input number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second input number");
        int secondNumber = sc.nextInt();
        System.out.println("Enter the third input number");
        int thirdNumber = sc.nextInt();
        LargestNumber threeNumbers = new LargestNumber();
        int resultOfLargestThreeNumbers = threeNumbers.largestOfNumbers(firstNumber, secondNumber, thirdNumber);
        System.out.println(resultOfLargestThreeNumbers);
    }
    int largestOfNumbers(int a, int b)
    {
        int largest = 0;
        if (a > b) {
            System.out.println("Largest is ");
            largest = a;
        } else if (a == b) {
            System.out.println("Numbers are equal, largest is ");
            largest = b;
        } else if (a < b) {
            System.out.println("Largest is ");
            largest = b;
        }
        return largest;
    }

    int largestOfNumbers(int a, int b, int c)
    {

        int largest = 0;
        if (a > b)
        {
            if (a > c)
            {
                System.out.println("Largest is ");
                largest = a;
            } else if (a == c)
            {
                System.out.println("Largest is ");
                largest = c;
            } else if (a < c)
            {
                System.out.println("Largest is ");
                largest = c;
            }

        } else if (b > a)
        {
            if (b > c)
            {
                System.out.println("Largest is ");
                largest = b;
            } else if (b == c)
            {
                System.out.println("Largest is ");
                largest = c;
            } else if (b < c)
            {
                 System.out.println("Largest is ");
                 largest = c;
            }
        } else if (b == a)
        {
            if(b>c)
            {
                System.out.println("Largest is ");
                largest = b;
            }else if(b==c)
            {
                System.out.println("Numbers are equal, Largest is ");
                largest = b;
            }
            else if(b<c)
            {
                System.out.println("Largest is ");
                largest = c;
            }
        }
        return largest;
    }
}
