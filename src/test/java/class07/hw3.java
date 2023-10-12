package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class hw3 extends CommonMethods {

    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-search-filter-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for (WebElement tableRow : tableRows) {
            List<WebElement> tableCells = tableRow.findElements(By.xpath("./td"));

            for (WebElement tableCell : tableCells) {
                String textCell = tableCell.getText();
                if (textCell.equals("in progress")) {
                    System.out.println(tableRow.getText());

                }
            }
        }
    }
}