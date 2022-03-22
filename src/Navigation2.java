import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Navigation2 {
    /** This class will show case how to navigate in selenium.**/

    public static void main(String[] args) { //Basic Selenium navigational methods


        System.setProperty("webdriver.chrome.driver","C:\\Users\\zdarw\\Downloads\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(  );

       //Navigate to google
       //Find the search field
       //Enter the search term
       //click search
       //Verify that the title contains the search term

        driver.navigate().to("https://www.google.com/");

        WebElement inputBox =  driver.findElement(By.name("q"));//WebElement Interface represents a HTML element

        String searchTerm = "Audi R8";

        inputBox.sendKeys("Audi R8" + Keys.ENTER);

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(searchTerm));

        driver.quit();
        System.out.println("Test has passed.");


    }
}
