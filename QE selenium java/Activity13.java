package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/tables");

        System.out.println(driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

        System.out.println("Rows: " + rows.size());
        System.out.println("Columns: " + cols.size());

        List<WebElement> thirdRowCells = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        for (WebElement cell : thirdRowCells) {
            System.out.println(cell.getText());
        }

        WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column: " + cellValue.getText());

        driver.quit();
    }
}
