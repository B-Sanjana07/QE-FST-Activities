package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/drag-drop");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(ball, dropzone1).perform();
        Thread.sleep(2000);

        String text1 = dropzone1.getText();
        System.out.println("After Dropzone 1: " + text1);

        actions.dragAndDrop(ball, dropzone2).perform();
        Thread.sleep(2000);

        String text2 = dropzone2.getText();
        System.out.println("After Dropzone 2: " + text2);

        driver.quit();
    }
}
