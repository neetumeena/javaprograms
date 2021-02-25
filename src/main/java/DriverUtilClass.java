import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtilClass {

    static WebDriver driver;
//    public static void main(String[] args)
//    {
//        upDriver();
//    }
    public static WebDriver upDriver()
    {
        System.setProperty("webdriver.chrome.driver","/Users/neetusingh/Documents/chromedriver");
        driver=new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/basic_auth");
        return driver;

    }

    static void tearDownDriver()
    {
        driver.quit();
    }
}
