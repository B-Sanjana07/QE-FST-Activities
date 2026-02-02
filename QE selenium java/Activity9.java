package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/keyboard-events");

            System.out.println("Page Title: " + driver.getTitle());

            WebElement body = driver.findElement(By.tagName("body"));
            body.click();

            Actions actions = new Actions(driver);
            actions.sendKeys("Selenium Test").perform();

            Thread.sleep(1000);

            WebElement message = driver.findElement(By.id("result"));
            System.out.println("Message displayed: " + message.getText());

        } finally {
            driver.quit();
        }
    }
}

