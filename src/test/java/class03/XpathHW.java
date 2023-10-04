package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        WebElement FulName = driver.findElement(By.xpath("//input[@id='userName']"));
        FulName.sendKeys("Osman Sotskyi");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("sockiy.o@gmail.com");

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("flat 1, Armitage Bridge House, Huddersfield, UK");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("flat 1, Armitage Bridge House, Huddersfield, UK");

        driver.findElement(By.xpath("//button[@id='submit']")).click();







    }
}
