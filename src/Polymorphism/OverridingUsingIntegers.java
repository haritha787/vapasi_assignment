package src.Polymorphism;

public class OverridingUsingIntegers extends OverridingUsingString
{
    //runs for overriding concept
    //runs fine irrespective error prompt
    public static void main(String[] args)
    {
         //creating an object for child inherited from parent
          OverridingUsingIntegers obj = new OverridingUsingIntegers();
          obj.overrideFunction(411, 105);  //calls child function -overriding
          obj.overrideFunction("Over","Riding"); //calls parent function - overriding
    }
    void overrideFunction(int a, int b)
    {
        int sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
    }
}