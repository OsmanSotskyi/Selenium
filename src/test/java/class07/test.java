package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;

public class test extends CommonMethods {
    public static void main(String[] args) {


        // Synchronization explicit page.
        String url = "http://35.175.58.98/synchronization-explicit-wait.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        // "Checkbox Checked base on click" section
        WebElement checkBoxBtn = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        checkBoxBtn.click();
        wait.until(ExpectedConditions.elementSelectionStateToBe(checkBox, true));
        if (checkBox.isSelected()) {
            System.out.println("5. 'Checkbox Checked base on click' test passed!");
        } else {
            System.out.println("5. 'Checkbox Checked base on click' test failed");
        }

    }
}
