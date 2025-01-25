package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
    Interview Sorusu : Implicit ve Explicit

    Implicitli  : Bütün elemanlar için geçerli,Bir kere tanımlanır. (HTML de verilen locator var mı?)
    Explicit    : Tek bir elemana özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur

    Her ikisi de tanımlı ise hangisinin süresi kullanılır ?
                            önce Implicit kullanılır, ve üzerine Explicit in süresi eklenerek
                            toplam hata sınırı süresi (mühlet sınırı) ortaya çıkmış olur.
 */


public class _03_ExplicitWait extends BaseDriver {
    // ExplicitWait
    @Test
    public void Test1(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
 
        WebElement btn = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        // text i WebDriver olana kadar bekle
        // bu durumda elemente ozel kriter vermek gerekir
        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Duration gibi sadece sure ve drive tanimlamasi yapildi
        // bekle.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        // visibilityOfElementLocated : bu element gozukene kadar BEKLE

        WebElement msj = driver.findElement(By.id("demo"));
        System.out.println("msj.getText() = " + msj.getText());

        MyFunc.Wait(2);
        BekleVeKapat();
    }

}
