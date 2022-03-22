import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindingElementsDay1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zdarw\\Downloads\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(  );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.navigate().to("https://www.duotech.io/");

        //The return type for the findElemnt() is WebElement.

        WebElement h2 = driver.findElement(By.className("section-header"));
        System.out.println(h2.getText());//getText() method will printout the text of the associating element.

        driver.findElements(By.className("section-header"));//using "findElements" will return a string list for all the elements

        System.out.println("\n");

        List<WebElement> headers = driver.findElements(By.className("section-header"));
        System.out.println(headers.size());


        for (WebElement header : headers) {
            System.out.println(header.getText());
        }




        //Now what if the findElement throws a exception if id is not found?

        //Now what if matching elements are not found in the findElement(s) -> there will be no exception and will return a empty
        //- list of webelemets.

        System.out.println("\n Test completed.");



        driver.close();


    }
}
