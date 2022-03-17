package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    UserHelper userHelper;

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.yahoo.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userHelper = new UserHelper(wd);

    }

    public void stop() {
        wd.quit();
    }


}
