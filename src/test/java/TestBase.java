import application.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {

protected static ApplicationManager app = new ApplicationManager();
    //WebDriver wd;

    @BeforeSuite
    public void setUp() {

       app.init();
       /* wd = new ChromeDriver();
        wd.navigate().to("https://www.yahoo.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
    }

    @AfterSuite
    public void tearDown() {
       // wd.quit();
app.stop();
    }

}
