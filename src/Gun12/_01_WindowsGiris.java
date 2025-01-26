package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsGiris extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");
        MyFunc.Wait(2);
        JavascriptExecutor js = (JavascriptExecutor)driver;

        String anaSayfaWindowId = driver.getWindowHandle();     // bulundugum yani ana sayfanin id sini aldim

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement e: linkler){
            //e.click();
            js.executeScript("arguments[0].click();", e);
        }

        Set<String> windowsIdler= driver.getWindowHandles();

        for (String id: windowsIdler){
            System.out.println("id = " + id);
        }

        MyFunc.Wait(2);
        driver.switchTo().window(anaSayfaWindowId); // ilgili Window (Tab) a gecis

        BekleVeKapat();
    }
}
