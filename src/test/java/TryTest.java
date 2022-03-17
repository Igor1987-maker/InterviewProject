import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TryTest {

    WebDriver wd;

    public TryTest(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text)  {

  /*      try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        new WebDriverWait(wd,10).until(ExpectedConditions.elementToBeClickable(locator));
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }

}
