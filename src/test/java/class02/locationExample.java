package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //navigate to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //maximize the window
        driver.manage().window().maximize();
        WebElement userName =driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Osman");
    }
}
