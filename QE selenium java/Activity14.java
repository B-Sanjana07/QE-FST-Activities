package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/tables");

        System.out.println(driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

        System.out.println("Rows: " + rows.size());
        System.out.println("Columns: " + cols.size());

        WebElement bookBefore = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
        System.out.println("Book in 5th row before sort: " + bookBefore.getText());

        driver.findElement(By.xpath("//table/thead/tr/th[3]")).click();
        Thread.sleep(2000);

        WebElement bookAfter = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
        System.out.println("Book in 5th row after sort: " + bookAfter.getText());

        driver.quit();
    }
}
