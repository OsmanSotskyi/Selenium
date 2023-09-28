package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='Checkbox-1']"));
        checkBox1.click();
        boolean chBox1Enabled = checkBox1.isEnabled();
        if (chBox1Enabled){
            System.out.println("CheckBox1 is enabled");
        }
        else {
            System.out.println("CheckBox1 is not enabled");
        }

        WebElement btnEnableCheckBox = driver.findElement(By.cssSelector("button#enabledcheckbox"));
        btnEnableCheckBox.click();

        checkBox1.click(); 
        boolean secondTestCheckBox1 = checkBox1.isEnabled();
        if (secondTestCheckBox1){
            System.out.println("CheckBox1 is enabled");
        }
        else {
            System.out.println("CheckBox1 is not enabled");
        }                                                     

        boolean ChBoxSelected = checkBox1.isSelected();
        if (ChBoxSelected){
            System.out.println("CheckBox1 is selected");
        }
        else {
            System.out.println("CheckBox1 is NOT selected");
        }







    }
}
