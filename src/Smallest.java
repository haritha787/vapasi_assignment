package src;

public class Smallest
{
    //this class is used to find the smallest of all given numbers
        public static void main(String[] args)
        {
            int a=2;
            int b=2;
            int c=2;
            int d=1;
            System.out.println("The smallest number is");
            if(a<b && a<c) {
                if(a<d){
                    System.out.println(a);
                }
                else{
                    System.out.println(d);
                }
            }else{
                if(b<c){
                    System.out.println(b);
                }
                else{
                    System.out.println(c);
                }
            }

        }

}


