import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCreation extends TestBase{

    @Test
    public void createYahooMailAccount(){

        int i = (int) ((System.currentTimeMillis()/1000)%3600);



       /* wd.findElement(By.cssSelector("._yb_u8yva")).click();
        wd.findElement(By.id("createacc")).click();
        WebElement element = wd.findElement(By.id("usernamereg-firstName"));
        element.click();
        element.clear();
        element.sendKeys("Yakow");*/

    }

}
