package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("checkbox"));

        System.out.println("Checkbox visible before clicking Remove: "
                + checkbox.isDisplayed());

        WebElement removeButton = driver.findElement(By.id("toggleCheckbox"));
        removeButton.click();

        Thread.sleep(3000);
        try {
            System.out.println("Checkbox visible after clicking Remove: "
                    + checkbox.isDisplayed());
        } catch (Exception e) {
            System.out.println("Checkbox is not visible after clicking Remove");
        }

        driver.quit();
    }
}
