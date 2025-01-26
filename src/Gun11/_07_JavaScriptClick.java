package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _07_JavaScriptClick extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.Wait(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;


        WebElement readStoryLink= driver.findElement(By.xpath("//div[text()='Read Success Story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", readStoryLink);

        // readStoryLink.click();  // üst menunun altına kaldığından sayfa üstünden tıklatamadı
        js.executeScript("arguments[0].click();", readStoryLink); // html içinde JavaScript kodu ile
        // tıklattık. ve çalıştı

        MyFunc.Wait(3);
        BekleVeKapat();
    }
}
