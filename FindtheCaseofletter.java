import java.util.Scanner;

public class FindtheCaseofletter
{
    //This function finds the case of user input letter
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabetical letter ");
        char letter = sc.next().charAt(0);
        int ascii = (int) letter;
        System.out.print("Entered letter is ");
        if (ascii > 96 && ascii < 123)
        {
            System.out.print("lower case ");
        } else
        {
            if((ascii > 64 && ascii < 91)) {
                System.out.print("upper case ");
            } else
            {
                System.out.print("invalid ");
            }
        }
    }

}
