package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_DragAnd_DropBy extends BaseDriver {

    @Test
    public void Test1()
    {
        // dragAndDropBy : Webelementi dikey veya yatay yonde kaydirma islemi yapar
        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions aksiyonDriver = new Actions(driver);

        WebElement solSurgu = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunc.Wait(2);

                                        // dragAndDropBy(WebElement, X , Y)     x: yatay yonde, y: dikey yonde
        Action aksiyon = aksiyonDriver.dragAndDropBy(solSurgu, 100, 0).build(); // yatay yonde 100 birim ilerledi
        aksiyon.perform();                                                      // 0 : dikey yonde hareket etme imkani zaten yok
        // + deger dirdigimizde saga dogru, - deger girdigimizde sola dogru kaydiriyor

        BekleVeKapat();

        // TODO : Sol surgu 200$, sag surgu 400$ a getiriniz
        // int genislik = solSurgu.getSize().width;
    }

    @Test
    public void Test2()
    {

    }

    @Test
    public void Test3()
    {

    }


}
