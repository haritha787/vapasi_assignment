package Vapasi;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SignUpPage {
    @FindBy(linkText = "Login")
    private WebElement login;

    @FindBy(id = "spree_user_email")
    private WebElement emailTextBox;

    @FindBy(name = "spree_user[password]")
    private WebElement passwordTextBox;

    @FindBy(name = "commit")
    private WebElement submit;

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void login(String userEmail, String password)
    {
        login.click();
        emailTextBox.sendKeys(userEmail);
        passwordTextBox.sendKeys(password);
        submit.click();
    }
    public void openUrl(String url) {


        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#signup [href=\"/login\"]")).click();

    }
}
