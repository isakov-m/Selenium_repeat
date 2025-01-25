package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _02_WaitsGiris extends BaseDriver {
    // Thread.Sleep, ImplicityWait
    @Test
    public void Test1(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // verilen muhlet kadar locator daki elementi bulmaya calisti bulunca cikti

        WebElement btn = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        // WebElement msj = driver.findElement(By.id("demo"));
        // Thread.sleep(20000);    // 20 sn gereksiz fazla bekleme yapiyor
        
        WebElement msj = driver.findElement(By.id("demo"));
        System.out.println("msj.getText() = " + msj.getText());

        MyFunc.Wait(2);
        BekleVeKapat();
    }

}
