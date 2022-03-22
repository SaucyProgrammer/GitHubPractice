import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Navigation {
    /** This class will show case how to navigate in selenium.**/

    public static void main(String[] args) { //Basic Selenium navigational methods


        System.setProperty("webdriver.chrome.driver","C:\\Users\\zdarw\\Downloads\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(  );

        driver.get("https://www.toyota.com/");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.navigate().to("https://www.duotech.io/");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.close();

        System.out.println("Test was completed.");


    }
}
