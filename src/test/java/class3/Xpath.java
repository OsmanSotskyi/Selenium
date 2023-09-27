package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
//instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/Xpath.php");
//        maximize the window
        driver.manage().window().maximize();

        WebElement textBox1=driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch16");

        WebElement textBox2=driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("batch17");

        WebElement question1=driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        question1.sendKeys("whats the color of the sun?");

        WebElement themagicalText = driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(themagicalText.getText());

        WebElement textBoxAPI = driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        textBoxAPI.sendKeys("abracadabra");

        WebElement Email1= driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        Email1.sendKeys("hello1@gmail.com");

        WebElement Email2= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        Email2.sendKeys("salamaleykum@gmail.com");

        WebElement Email3= driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        Email3.sendKeys("aleykum@gmail.com");

        WebElement Field1=driver.findElement(By.xpath("(//input[@data-detail='one' and @name='customField'])"));
        Field1.sendKeys("cat");

        WebElement Field2=driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
        Field2.sendKeys("dog");

        WebElement ChoiceField1=driver.findElement(By.xpath("(//input[@name='customField1' and @data-detail='one'])"));
        ChoiceField1.sendKeys("hotDog");

        WebElement ChoiceField2=driver.findElement(By.xpath("(//input[@name='customField1' and @data-detail='two'])"));
        ChoiceField2.sendKeys("doner");


    }
}
