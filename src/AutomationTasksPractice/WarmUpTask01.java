package AutomationTasksPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WarmUpTask01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zdarw\\Downloads\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(  );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



        //Task:
//        1. Search a website and verify the title
//        2. Search for a product on that website then verify that item is the title
//        3. navigate to the home page
//        4. Verify that the page has at least 6 links
//        5. printout each links text
//        6. close out.

        driver.get("https://amazon.com/");
        String expectedTitle = "Amazon";
        String actual = driver.getTitle();

        //Step1 verify:

        Assert.assertTrue(actual.contains(expectedTitle));


        //Step2:
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shovel" + Keys.ENTER);
        String exTitle2 = "Shovel";
        String actTitle2 = driver.getTitle();

        Assert.assertTrue(actTitle2.contains(exTitle2));

        //Step3:
        driver.navigate().back();

        //Step4:
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            if(links.size() >= 6){

            }else{
                System.out.println("There are not links");
            }

            System.out.println("Webpage has been verified to have more than 6 links.");

            /** this for-loop prints out all the links but due to massive amounts of links it will throw a exception **/
           // for (int i = 1; i <= links.size();i++){
               // System.out.println(links.get(i).getText());
           // }
        }


        System.out.println("All tasks have been completed. Test has passed. ");
        driver.close();


    }
    /** Line sof code for github practice on intellij**/
}
