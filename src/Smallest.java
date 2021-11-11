public class Smallest {

    public class Main {

        public static void main(String[] args)
        {
            int a=2;
            int b=5;
            int c=8;
            int d=3;
            if(a<b && a<c)
            {
                if(a<d)
                {
                    System.out.println(a);
                }
                else
                {
                    System.out.println(d);
                }
            }else
            {
                if(b<c)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(c);
                }
            }
            System.out.println("is the smallest number");
        }

    }

}
