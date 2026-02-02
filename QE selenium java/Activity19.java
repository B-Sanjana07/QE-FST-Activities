package demos;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");

        System.out.println(driver.getTitle());

        driver.findElement(By.id("confirm")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        driver.findElement(By.id("confirm")).click();

        alert = driver.switchTo().alert();
        alert.dismiss();

        driver.quit();
    }
}

