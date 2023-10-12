package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        //use the driver.get() method
        driver.get(url);
        //maximize our window
        driver.manage().window().maximize();
        // gives us time for loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void closeBrowser(){
        driver.quit();
    }
}
