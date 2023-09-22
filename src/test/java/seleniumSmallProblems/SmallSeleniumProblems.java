package seleniumSmallProblems;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;


public class SmallSeleniumProblems {

    public static void main(String[] args) {
        findBrokenLinks();
    }

    private static void findBrokenLinks() {
        WebDriver driver = null;

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        // Navigate to the demoqa website
        String URL = "https://www.google.com/search?q=broken+link+selenium&sca_esv=564995893&sxsrf=AB5stBj7ZbnatUEKGrHWZu6DIQvlZasYTQ%3A1694606146734&ei=QqMBZfW3LOGVg8UPgMCAyAY&oq=&gs_lp=Egxnd3Mtd2l6LXNlcnAiACoCCAAyBxAjGOoCGCcyBxAjGOoCGCcyBxAjGOoCGCcyBxAjGOoCGCcyBxAjGOoCGCcyBxAjGOoCGCcyBxAjGOoCGCcyBxAjGOoCGCcyBxAjGOoCGCcyBxAjGOoCGCcyFhAAGAMYjwEY5QIY6gIYtAIYjAPYAQEyFhAAGAMYjwEY5QIY6gIYtAIYjAPYAQEyFhAAGAMYjwEY5QIY6gIYtAIYjAPYAQEyFhAAGAMYjwEY5QIY6gIYtAIYjAPYAQEyFhAAGAMYjwEY5QIY6gIYtAIYjAPYAQEyFhAAGAMYjwEY5QIY6gIYtAIYjAPYAQEyFhAAGAMYjwEY5QIY6gIYtAIYjAPYAQEyFhAAGAMYjwEY5QIY6gIYtAIYjAPYAQEyGBAAGAMYjwEY5QIY6gIYtAIYChiMA9gBATIWEAAYAxiPARjlAhjqAhi0AhiMA9gBAUjBJFCnBVinBXADeAGQAQCYAeYBoAHmAaoBAzItMbgBAcgBAPgBAagCFMICChAAGEcY1gQYsAPCAhYQLhgDGI8BGOUCGOoCGLQCGIwD2AEB4gMEGAAgQYgGAZAGB7oGBggBEAEYCw&sclient=gws-wiz-serp";
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
//        verifyLinks("wqheiuqw");

        for (WebElement E1 : links) {
            String url = E1.getAttribute("href");
            System.out.println(url);
            verifyLinks(url);
        }

        driver.quit();
    }

    private static void verifyLinks(String linkUrl) {
        try {
//            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            Response response = given().log().all().get(linkUrl);
            Assert.assertEquals(response.getStatusCode(), 200);
//            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
//            httpURLConnect.setConnectTimeout(5000);
//            httpURLConnect.connect();
//            if (httpURLConnect.getResponseCode() >= 400) {
//                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
//            }
//
//            //Fetching and Printing the response code obtained
//            else {
//                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
//            }
        } catch (Exception ignored) {
            System.out.println("*******************************************");
        }
    }
}
