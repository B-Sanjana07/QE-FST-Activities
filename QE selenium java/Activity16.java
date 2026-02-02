package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/selects");
        System.out.println(driver.getTitle());

        WebElement selectElement = driver.findElement(By.id("single-select"));
        Select select = new Select(selectElement);

        select.selectByVisibleText("Option 2");
        select.selectByIndex(2);
        select.selectByValue("option4");

        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        driver.quit();
    }
}
