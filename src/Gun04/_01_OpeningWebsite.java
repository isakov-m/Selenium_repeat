package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        // oop WebDriver : Interface, Parent Class      // ChromeDriver, FirefoxDriver, EdgeDriver
        WebDriver driver=new ChromeDriver();    // driver = browser, tarayici
//        WebDriver driver2=new FirefoxDriver();
//        WebDriver driver3=new EdgeDriver();

        driver.get("https://www.google.com/");  // web sayfasini acar

        MyFunc.Wait(3);
        //driver.close(); // o anda aktif olan acik tarayiciyi kapatiyor, hafizadan siliyor
        driver.quit();  // program calisirken olusturulmus olanlarin hepsini kapatiyor ve hafizadan siler




    }
}
