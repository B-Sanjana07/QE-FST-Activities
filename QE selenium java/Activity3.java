package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Activity3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            // Open page
            driver.get("https://training-support.net/webelements/login-form/");

            // Print title
            System.out.println("Page Title: " + driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement username = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//input[@id='username']")
                    )
            );
            username.sendKeys("admin");
            WebElement password = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//input[@id='password']")
                    )
            );
            password.sendKeys("password");
            WebElement loginButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[@type='submit']")
                    )
            );
            loginButton.click();
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}

