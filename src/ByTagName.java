import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ByTagName {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\zdarw\\Downloads\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(  );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.navigate().to("https://www.duotech.io/");


        driver.findElement(By.tagName("h1")).getText();//Use tag name for unique elements with no duplicates



        //Task is to print the list of links:
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //All links are <a> tag



        for (WebElement link : links) {
            System.out.println(link.getText());
        }



        driver.close();
    }
}
