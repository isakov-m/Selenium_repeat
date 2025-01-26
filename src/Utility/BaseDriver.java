package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method

    public static WebDriverWait wait;

    static {     // bunun sarti extends olmasi ve basta yer almasi

        Logger logger = Logger.getLogger("");    // output yapilan loglari al
        logger.setLevel(Level.SEVERE);  // sadece ERROR lari goster

        driver = new ChromeDriver();    // jenkins deyken: sen head olmadan hafizada calis
        driver.manage().window().maximize();    // ekrani max yapiyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50)); // 30 sn muhlet: sayfayi yukleme muhleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // 20 sn muhlet: elementi bulma muhleti
        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    }

    public static void BekleVeKapat() {
        MyFunc.Wait(5);
        driver.quit();
    }

}
