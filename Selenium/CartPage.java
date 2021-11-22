package Vapasi;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CartPage {

    void printTotal()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String total = driver.findElement(By.cssSelector("td[class='lead']")).getText();
        System.out.println(total);
    }
}
