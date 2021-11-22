package Vapasi;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class InitialiseDrivers
{
        WebDriver driver;

        InitialiseDrivers()
        {
            System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
            driver = new ChromeDriver();
        }

}
