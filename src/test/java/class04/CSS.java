package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();

        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("osman");

        WebElement profileName = driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("OsmiNog");

        WebElement feedbackJenny = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedbackJenny.sendKeys("website isn't working");

        WebElement feedbackRaja = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaja.sendKeys("website is working");

        //contains method
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");

        // using starts-with
        WebElement introtoAdv = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introtoAdv.sendKeys("welcome");

        // using ends=with
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='45conclusion345Input']"));
        conclusion.sendKeys("all good");
    }
}
