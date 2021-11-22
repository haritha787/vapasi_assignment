package Vapasi;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage {

    void loginMessage(String loginMessage)
    {
            String loginMessageReceived = driver.findElement(By.cssSelector("div[class='alert alert-success']")).getText();
            Assert.assertEquals(loginMessage,loginMessageReceived,"Login Failed");
            System.out.println(loginMessageReceived);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


}
