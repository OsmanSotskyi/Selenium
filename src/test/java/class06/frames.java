package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {
        //declare the instance of Webdriver
        WebDriver driver = new ChromeDriver();
        //use the driver.get() method
        driver.get("http://35.175.58.98/handle-iframe.php");
        //maximize our window
        driver.manage().window().maximize();
        //        write down the topic
//        switch to the iframe
        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("heelo");

        driver.switchTo().frame("checkboxIframe");
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        // switch to default
        driver.switchTo().defaultContent();
        // locate the frame u want to switch
        WebElement frame  = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        // switch to the frame
        driver.switchTo().frame(frame);
        // locate the webelement select
        WebElement animals  = driver.findElement(By.xpath("//select[@id='animals']"));
        // create an object of select class
        Select sel =new Select(animals);
        sel.selectByVisibleText("Baby Cat");
    }
}
