package Gun12;
/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSoru extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Wait(2);

        String anaSayfaWindowId = driver.getWindowHandle(); // ana sayfanin id sini aldim, digerleri acilmadan

        // _blank olan butun a taglerini aldim
        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        // yeni tabda sayfa acicak linklere tiklattim
        for (WebElement e: linkler){
            js.executeScript("arguments[0].click();",e);
        }

        // acilan butun yeni tablardaki windowlarin ID lerini aldim
        Set<String> windowsIdler = driver.getWindowHandles();

        // her tab a geciliyor ve title ve url si yazdiriliyor
        for (String id: windowsIdler){
            MyFunc.Wait(20);
            driver.switchTo().window(id);
            System.out.println("title = "+driver.getTitle()+", url= "+driver.getCurrentUrl());
        }

        for (String id: windowsIdler){
            if (id.equals(anaSayfaWindowId)) continue;      // ana sayfanin id si gelirse pas gec
            driver.switchTo().window(id);
            driver.close();
        }

        BekleVeKapat();
    }
}
