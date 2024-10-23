import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    static WebDriver driver;


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver"); //importovati odgovarajuci driver
        //WebdriverManager
        driver = new ChromeDriver();

        driver = new FirefoxDriver();

        driver = new EdgeDriver();

        driver.get("https://www.selenium.dev/downloads/");

    }




}