package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement FemRadBut = driver.findElement(By.xpath("//input[@value='gender-female']"));
        boolean FemRadButDisp = FemRadBut.isDisplayed();
        if (FemRadButDisp){
            System.out.println("Female Radio button is Displayed");
        }
        else {
            System.out.println("Female Radio button is NOT Displayed");
        }

        WebElement showBut = driver.findElement(By.cssSelector("button#toggleRadioButtons"));
        showBut.click();
        Thread.sleep(2000);


        boolean secondFemRadButDisp = FemRadBut.isDisplayed();
        if (secondFemRadButDisp){
            System.out.println("Female Radio button is Displayed");
        }
        else {
            System.out.println("Female Radio button is NOT Displayed");
        }


    }
}
