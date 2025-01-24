package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);

public class _04_Odev extends BaseDriver {

    @Test
    public void odev() {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Wait(2);

        WebElement business = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();
        MyFunc.Wait(2);

        WebElement s1 = driver.findElement(By.cssSelector("[id$='_4588']"));
        s1.click();
        MyFunc.Wait(2);

        WebElement s2 = driver.findElement(By.cssSelector("[id$='_4588'] :nth-child(4)"));
        s2.click();
        MyFunc.Wait(2);

        WebElement evrDay = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        evrDay.click();
        MyFunc.Wait(2);

        WebElement good = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        good.click();
        MyFunc.Wait(2);

        WebElement s3 = driver.findElement(By.cssSelector("select[id$='_4597']"));
        s3.click();
        MyFunc.Wait(2);

        WebElement s4 = driver.findElement(By.cssSelector("select[id$='_4597']  :nth-child(3)"));
        s4.click();

        good.click();
        MyFunc.Wait(2);

        BekleVeKapat();
    }
}
