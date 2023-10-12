package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class hw1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://35.175.58.98/synchronization-explicit-wait.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement btnShowAlert = driver.findElement(By.xpath("//button[@id='show_alert']"));
        btnShowAlert.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement btnChangeText = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        btnChangeText.click();

        WebElement text1 = driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']"));
        String text = text1.getText();
        System.out.println(text);

        WebElement displayBtn = driver.findElement(By.xpath("//button[@id='display_button']"));
        displayBtn.click();

        WebElement enabledBtn = driver.findElement(By.xpath("//button[text()='Enabled']"));
        enabledBtn.click();

        WebElement checkBoxBtn = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBoxBtn.click();

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(checkBox));
        System.out.println(checkBox.isSelected());


    }
}
