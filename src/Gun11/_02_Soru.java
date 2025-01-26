package Gun11;

/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("");
        MyFunc.Wait(2);

        driver.switchTo().frame(0); // ilk frame e gecildi
        WebElement input=driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        //driver.switchTo().parentFrame(); // bi geri parente git : ana sayfa
        driver.switchTo().defaultContent(); // direk olarak ana sayfa ya git

        driver.switchTo().frame(1);  // 2.sıradaki frame geçtim.
        WebElement webSelect=driver.findElement(By.id("animals"));
        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByVisibleText("Avatar");

        BekleVeKapat();
    }

}
