import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class testSelenium {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();



        try {
            String baseUrl = "https://www.bing.com/";
            String expectedTitle = "必应";
            String actualTitle = "";

            driver.get(baseUrl);

            actualTitle = driver.getTitle();

            Thread.sleep(5000);

            if (actualTitle.contentEquals(expectedTitle)){
                System.out.println("PASS");
            }
            else {
                System.out.println("FAILED");
            }
        } catch (InterruptedException e) {
            System.out.println("an interrupted occurs: "+e.getMessage());
        }
        finally {
            driver.close();
            System.out.println("END");
        }
    }

}
