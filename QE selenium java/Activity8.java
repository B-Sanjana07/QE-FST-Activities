package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://training-support.net/webelements/mouse-events");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement cargoLock = driver.findElement(By.id("cargo-lock"));
        WebElement cargoToml = driver.findElement(By.id("cargo-toml"));
        WebElement src = driver.findElement(By.id("src"));
        WebElement target = driver.findElement(By.id("target"));
        WebElement confirmation = driver.findElement(By.id("result"));

        actions
                .click(cargoLock)
                .moveToElement(cargoToml)
                .click()
                .build()
                .perform();

        System.out.println("Confirmation Text (Seq 1): " + confirmation.getText());

        actions
                .doubleClick(src)
                .contextClick(target)
                .build()
                .perform();

        driver.findElement(By.cssSelector("li[data-action='open']")).click();
        System.out.println("Confirmation Text (Seq 2): " + confirmation.getText());
        driver.quit();
    }
}
