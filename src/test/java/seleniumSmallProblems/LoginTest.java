package seleniumSmallProblems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class LoginTest {


    public static void main(String[] args) throws InterruptedException {

//        loginTest();
        int[] a = {-1, 0, -1, 1, 0, 1};
        // [-1,-1,0,0,1,1,1]
        sortArray(a);

    }

    private static void sortArray(int[] A) {


        int len = A.length;
        int count0 = 0;
        int count1 = 0;
        int countM1 = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] == -1)
                countM1++;
            else if (A[i] == 0)
                count0++;
            else
                count1++;
        }
        int i = 0;
        int j=0;
        while (i < countM1) {
            A[j++] = -1;
            i++;
        }
        i=0;
        while (i < count0) {
            A[j++] = 0;
            i++;
        }
        i=0;
        while (i < count1) {
            A[j++] = 1;
            i++;
        }
        System.out.println(Arrays.toString(A));

        //

    }

    private static void loginTest() throws InterruptedException {

        String url = "https://justcall.io/login";
        String email = "nitumeena94@gmail.com";
        String password = "testing";
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
        driver.findElement(By.xpath("//*[text()='Next']")).click();

//        WebDriverWait webDriverWait=new WebDriverWait(driver, TimeUnit.SECONDS.ordinal());
//
//        driver..
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//*[@type='password']"));
        element.sendKeys("testjsdnfb");
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        WebElement element1 = driver.findElement(By.xpath("//*[contains(text(),'The email' )]/a"));
        String actualText = element1.getText();
        System.out.println(actualText);

        Assert.assertEquals(actualText, "The email or password entered is incorrect", "Assertion failed");
        driver.quit();

    }
}
