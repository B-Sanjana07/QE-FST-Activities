package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-content");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//button[text()='Click me!']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicText")));
        System.out.println(text.getText());
        driver.quit();
    }
}

