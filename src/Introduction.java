import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Introduction {

    /** Selenium allows us to create code for automation testing. **/
    // Selenium is an umbrella project for a range of tools and libraries that
    // - enable support of automation testing within browsers.

    /** Basic methods: **/
    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver","C:\\Users\\zdarw\\Downloads\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(  );
        driver.get("https://www.duotech.io/");


        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.duotech.io/";


        //Verification of Webpage
        if(actualUrl.equals(expectedUrl)){
            System.out.println("\nTest passed.");
            System.out.println(actualUrl);
        }else{
            System.out.println("\nTest failed.");
        }


        //Assert object class allows for ease of verification:
        Assert.assertEquals("https://www.duotech.io/",actualUrl);


        driver.getTitle(); // returns the current page's title


        System.out.println("\n" + driver.getPageSource());
        driver.getPageSource();// returns the html code of the webpage

        driver.close();//Closes current window, quitting the browser if it's the last window open.
        driver.quit();//Closes the driver's entire web session


/** Introduction **/
/** Git work part2**/




    }
}
