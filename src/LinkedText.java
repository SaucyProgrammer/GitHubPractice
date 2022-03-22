import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LinkedText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zdarw\\Downloads\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(  );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.duotech.io/");

        driver.findElement(new By.ByLinkText("About")).click();
        //You can use the word on that link such as "About", "Home", "FAQS"

        driver.findElement(new By.ByPartialLinkText("con")).click(); //it will click on "Contacts" because "con" is within that link text
    }
}
