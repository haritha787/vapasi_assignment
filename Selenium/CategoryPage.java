package Vapasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CategoryPage {
    void selectCategoryFromMenu()
    {
        WebElement dropDown = driver.findElement(By.id("taxon"));
        Select select = new Select(dropDown);
        select.selectByValue("1");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
    }

    void selectProduct()
    {
        driver.findElement(By.cssSelector("div[id='products']>div")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }
}
