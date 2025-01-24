package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method

    static{     // bunun sarti extends olmasi ve basta yer almasi
        driver=new ChromeDriver();
        driver.manage().window().maximize();    // ekrani max yapiyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 30 sn muhlet: sayfayi yukleme muhleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn muhlet: elementi bulma muhleti
    }

    public static void BekleVeKapat(){
        MyFunc.Wait(5);
        driver.quit();
    }

}
