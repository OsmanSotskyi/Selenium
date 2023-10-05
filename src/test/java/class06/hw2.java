package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class hw2 {
    public static void main(String[] args) {
        //declare the instance of Webdriver
        WebDriver driver = new ChromeDriver();
        //use the driver.get() method
        driver.get("https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser&theme=glif");
        //maximize our window
        driver.manage().window().maximize();

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));

        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();

        String gmailHandle=driver.getWindowHandle();
        System.out.println(gmailHandle);


        Set<String> allHandles = driver.getWindowHandles();

        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String tittle = driver.getTitle();
            if (tittle.equalsIgnoreCase("Google Terms of Service – Privacy &amp; Terms – Googl")){
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(gmailHandle);
        System.out.println(driver.getTitle());


    }
}
