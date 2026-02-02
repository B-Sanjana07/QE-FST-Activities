package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://training-support.net/webelements/alerts");

        System.out.println(driver.getTitle());

        js.executeScript("document.getElementById('prompt').scrollIntoView(true);");
        js.executeScript("document.getElementById('prompt').click();");

        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Awesome!");
        alert.accept();

        driver.quit();
    }
}
