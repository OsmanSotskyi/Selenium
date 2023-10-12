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

        driver.switchTo().frame("textfieldIframe");
        WebElement frameCheckBox = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frameCheckBox);
        WebElement checkBox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(animals);
        sel.selectByVisibleText("Baby Cat");



        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
//        sending the topic
        driver.findElement(By.name("Topic")).sendKeys("abcdef");

    }
}
