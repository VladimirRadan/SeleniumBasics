import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    static WebDriver driver;


    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver"); //importovati odgovarajuci driver
        //WebdriverManager
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        //WebElement usernameField = driver.findElement(By.cssSelector("#username"));
        usernameField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement button = driver.findElement(By.cssSelector("button[class='radius']"));
        //WebElement button = driver.findElement(By.cssSelector(".radius")); primeri dohvatanja elementa preko klase
        //WebElement button = driver.findElement(By.className("radius")); primeri dohvatanja elementa preko klase
        button.click();

//        driver.findElement(By.className("fa fa-2x fa-sign-in")); primeri dohvatanja elementa preko klase
//        driver.findElement(By.cssSelector(".fa.fa-2x")); primeri dohvatanja elementa preko klase

        String expectedText = "You logged into a secure area!";

        WebElement loggedInUserText = driver.findElement(By.cssSelector(".flash.success"));
        String actualText = loggedInUserText.getText();

        String actual = loggedInUserText.getText().substring(0, loggedInUserText.getText().length()-1);

        String [] actualRegexArray = loggedInUserText.getText().split("(?<=!)");

        String actualRegexText = actualRegexArray[0];


        String expectedColor = "rgba(93, 164, 35, 1)";
        String actualColor = loggedInUserText.getCssValue("background-color");

        System.out.println(actualColor);

        if (expectedColor.equals(actualColor)){
            System.out.println("Verified");
        }else {
            System.out.println("color error");
        }



        if (expectedText.equals(actualRegexText.trim())){
            System.out.println("Verified");
        }else {
            System.out.println("Error!");
        }

        //driver.close();// zatvara prozor ili tab na kom se korisnik nalazi
        driver.quit();//zatvara sve otvoreno






    }




}