package Gun09;
// https://www.hepsiburada.com/ sayfasina gidiniz
// Elektronik -> Bilgisayar ve Tabletler -> Tablet Click
// tiklatma isleminden sonra URL de
// tablet kelimesinin gectigini dogrulayin

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionHoverOverSoru extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.hepsiburada.com/");

        Actions aksiyonDriver = new Actions(driver);

        WebElement elektronik = driver.findElement(By.xpath("//span[text()='Elektronik']"));
        WebElement bilgisayar = driver.findElement(By.linkText("Bilgisayar/Tablet"));
        WebElement tablet = driver.findElement(By.xpath("(//a[text()='Tablet'])[1]"));

        aksiyonDriver.moveToElement(elektronik).build().perform();
        MyFunc.Wait(2);
        aksiyonDriver.moveToElement(bilgisayar).build().perform();
        MyFunc.Wait(2);
        aksiyonDriver.moveToElement(tablet).build().perform();
        MyFunc.Wait(2);

        tablet.click();
        // aksiyonDriver.moveToElement(tablet).click().build().perferm();
        MyFunc.Wait(3);

        Assert.assertTrue("Tablet kelimesi URL de bulunumadi",driver.getCurrentUrl().contains("tabl") );

        BekleVeKapat();
    }
}
