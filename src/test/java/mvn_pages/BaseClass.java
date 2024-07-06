package mvn_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
 
    public String baseURL = "https://demo.guru99.com/v3/index.php";
    public String username = "mngr577792";
    public String password = "AbugUva";
    public static WebDriver driver;
    
 
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Initialize ChromeOptions
        ChromeOptions options = new ChromeOptions();
     // Add arguments to ChromeOptions
        options.addArguments("--remote-allow-origins=*"); // Example of adding an argument
           // Maximize browser window
        driver.manage().window().maximize();
    }
 
    @AfterClass
    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
