package Vapasi;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.*;

public class AddProductSpree extends InitialiseDrivers
{

    @BeforeMethod
    public void initialise()
    {
        InitialiseDrivers initialiseDrivers= new InitialiseDrivers();
    }


    @Test
    public void addProductToCart() {
        try {
                SignUpPage loginPage=new SignUpPage(driver);
                HomePage homePage=new HomePage(driver);
                CategoryPage categoryPage=new CategoryPage(driver);
                ProductPage productPage=new ProductPage(driver);
                loginPage.openUrl("https://spree-vapasi-prod.herokuapp.com/signup");
                loginPage.login("test197859@test.com","123456901");

                homePage.loginMessage("Logged in successfully");

                categoryPage.selectCategoryFromMenu();
                categoryPage.selectProduct();

                productPage.addToCart();



        } catch (NoSuchElementException e) {
            System.out.println("Unable to locate element");
        }
    }

        @Test
        public void assertCartValue()
        {

            ProductPage productPage= new ProductPage();
            CartPage cartPage=new CartPage();
           productPage.goToCart();

           cartPage.printTotal();


        }


        @AfterTest
        public void runAfterTest ()
        {
            driver.close();
            driver.quit();
            System.out.println("Hey I am running After Method");
        }


}

