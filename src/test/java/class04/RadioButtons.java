package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radioButtonMale.click();

        boolean status = radioButtonMale.isSelected();
        if(status){
            System.out.println("the radio button male was selected");
        }else {
            System.out.println("the radio button male was not selected");
        }
        //check if the male radio button is enabled
        boolean btEnableStatus = radioButtonMale.isEnabled();
        System.out.println("the male radio button is enabled "+btEnableStatus);
        // check if the radio button is displayed
        boolean btnisDisplayedStatus = radioButtonMale.isDisplayed();
        System.out.println("the male radio button is displayed " + btnisDisplayedStatus);

        List<WebElement> ageRanges = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement ageRange:ageRanges){
            String option = ageRange.getAttribute("value");
            if (option.equalsIgnoreCase("5 - 15")){
                ageRange.click();
            }
        }
    }
}
