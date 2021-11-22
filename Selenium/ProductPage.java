package Vapasi;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ProductPage {
    void addToCart()
    {
        driver.findElement(By.cssSelector("input[id='quantity']")).clear();
        driver.findElement(By.cssSelector("button[id=\"add-to-cart-button\"]")).click();
    }

    void goToCart()
    {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("link-to-cart")).click();
    }

}
