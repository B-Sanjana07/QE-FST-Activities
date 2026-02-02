package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/dynamic-attributes");
        System.out.println(driver.getTitle());

        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id^='username']")));
        WebElement password = driver.findElement(By.cssSelector("input[id^='password']"));
        WebElement submit = driver.findElement(By.cssSelector("button[id^='submit']"));

        username.sendKeys("admin");
        password.sendKeys("password");
        submit.click();

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success")));
        System.out.println(message.getText());

        driver.quit();
    }
}

