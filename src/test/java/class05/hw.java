package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance of Webdriver
        WebDriver driver = new ChromeDriver();
        //use the driver.get() method
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        //maximize our window
        driver.manage().window().maximize();
        WebElement btnDreamDestination = driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
        btnDreamDestination.click();
        Thread.sleep(2000);
        WebElement australia = driver.findElement(By.xpath("//a[contains(text(),'Australia')]"));
        australia.click();


    }
}
