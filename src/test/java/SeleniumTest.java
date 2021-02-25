import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumTest {

    /*

char[] input = { 'j','j', 'a', 'a', 'a', 'v', 'v', 'v', 'v', 'a', 'a', 'a', 'a', 'a' 'd'};

//

     */

//    WebDriver driver = new ChromeDriver();
//    String URL="";
//    @Test
//    public void test()
//    {
//
//        driver.get(URL);
//
//        List<WebElement> list =driver.findElements(By.className("leftrooms"));
//
//        List<WebElement> imgList=driver.findElements(By.xpath("//*[@class='roomLeft']//div//img"));
//
//    }

    public static void removeConDup(char[] input)
    {

        int len=input.length;

        int i=0;
        int j=0;
        for( i=1;i<len-1;i++) {

            if (input[i] != input[j]) {
                j++;
                input[i] = input[j];
            }
        }
        for (int k=0;k<j;j++)
        {
            System.out.print(input[k]);
        }

//            System.out.print(input[i]);
//
//            for( j=i+1;j<len;j++)
//            {
//
//                if(input[i]!=input[j])
//                {
//                    i=j;
//                    break;
//                }
//
//            }
//            if(j==len-1)
//                break;


//        if(i!=len-1)
//            System.out.print(input[len-1]);
    }

    public static void main(String[] args)
    {
        char[] input = { 'j','j', 'a', 'a', 'a', 'v', 'v', 'v', 'v', 'a', 'a', 'a', 'a', 'a' };
        removeConDup(input);


    }
}
