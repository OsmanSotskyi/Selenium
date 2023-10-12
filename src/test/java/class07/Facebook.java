package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static utils.CommonMethods.driver;
import static utils.CommonMethods.openBrowserAndLaunchApplication;

public class Facebook {
    public static void main(String[] args) {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        WebElement skipCooki = driver.findElement(By.xpath("//button[@title='Allow all cookies']"));
        skipCooki.click();

        //        find the button create new account
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

//        fill in the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("moazzam");
    }
}
