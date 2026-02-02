package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println(driver.getTitle());

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));

        toggleButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        toggleButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.quit();
    }
}

