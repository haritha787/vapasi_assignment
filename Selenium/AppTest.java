//package Vapasi;
//
//
//import org.testng.Assert;
//import org.testng.annotations.*;
//
///**
// * Unit test for simple App.
// */
//public class AppTest
//{
//
//    @BeforeClass
//    public void runBeforeClass()
//    {
//        System.out.println("Hey I am running Before Class");
//    }
//
//    @BeforeTest
//    public void runBeforeTest()
//    {
//        System.out.println("Hey I am running Before Test");
//    }
//
//    @BeforeMethod
//    public void runBeforeMethod()
//    {
//        System.out.println("Hey I am running Before Method");
//    }
//
//
//    @Test
//    public void addTwoNumbers()
//    {
//        int a=9;
//        int b=10;
//        int Sum=a+b;
//        System.out.println("Sum of two numbers "+Sum);
//        //Assert.assertEquals(Sum,20,"I failed in Sum");
//        Assert.assertFalse(false,"I expected in Add False");
//        Assert.assertFalse(true,"I failed in Add True");
//        //Assert.assertFalse(addNumbers(a,b,Sum),"I failed in Add False");
//    }
//
//    @Test
//    public void subTwoNumbers()
//    {
//        int a=9;
//        int b=10;
//        int Sub=a-b;
//        System.out.println("Sub of two numbers "+Sub);
//        Assert.assertTrue(true,"I failed in Sub True");
//        Assert.assertTrue(false,"I failed in Sub False");
//        //Assert.assertTrue(subNumbers(a,b,Sub),"I failed in Sub True");
//    }
//
//    public boolean subNumbers(int a, int b, int Sub)
//    {
//        int Sub1=a-b-1;
//        if(Sub==Sub1)
//            return true;
//         else
//             return false;
//
//    }
//
//    public boolean addNumbers(int a, int b, int Add)
//    {
//        int Add1=a+b;
//        if(Add!=Add1)
//            return true;
//        else
//            return false;
//
//    }
//
//    @AfterMethod
//    public void runAfterMethod()
//    {
//        System.out.println("Hey I am running After Method");
//    }
//
//    @AfterClass
//    public void runAfterClass()
//    {
//        System.out.println("Hey I am running After Class");
//    }
//}
