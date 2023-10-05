package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hw1 {
    public static void main(String[] args) {
        //declare the instance of Webdriver
        WebDriver driver = new ChromeDriver();
        //use the driver.get() method
        driver.get("http://35.175.58.98/handle-iframe.php");
        //maximize our window
        driver.manage().window().maximize();

        driver.switchTo().frame(1);
        WebElement checkBox = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(checkBox);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        WebElement textBoxTopic = driver.findElement(By.xpath("//input[@name='Topic']"));
        textBoxTopic.sendKeys("Baby Cat");
    }
}
