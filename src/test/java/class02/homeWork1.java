package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("abc");
        userName.sendKeys(Keys.CONTROL + "a");
        userName.sendKeys(Keys.DELETE);
        userName.sendKeys("Admin");


        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");


        WebElement button = driver.findElement(By.tagName("button"));
        String msg = button.getText();
        System.out.println("Text from button is: "+msg);

        button.click();



    }
}
