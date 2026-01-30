package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("checkbox"));

        System.out.println("Checkbox selected before clicking: "
                + checkbox.isSelected());

        checkbox.click();
        Thread.sleep(2000);

        System.out.println("Checkbox selected after clicking: "
                + checkbox.isSelected());
        driver.quit();
    }
}

