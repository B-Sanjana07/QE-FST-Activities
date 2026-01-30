package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement textField = driver.findElement(By.id("input-text"));

        System.out.println("Text field enabled before clicking Enable: "
                + textField.isEnabled());

        WebElement enableButton = driver.findElement(By.id("toggleInput"));
        enableButton.click();

        Thread.sleep(3000);

        System.out.println("Text field enabled after clicking Enable: "
                + textField.isEnabled());

        driver.quit();
    }
}
