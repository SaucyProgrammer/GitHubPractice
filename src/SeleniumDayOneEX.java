import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayOneEX {
    public static void main(String[] args) {
        //Navigate to Toyota.com
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zdarw\\Downloads\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(  );
        driver.get("https://www.toyota.com/");

        driver.findElement(By.xpath("//a[@href='https://privacy.toyota.com/']")).click();

        System.out.println("Test was completed. ");
    }
}
