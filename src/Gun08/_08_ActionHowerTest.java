package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionHowerTest extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).build(); // elementin uzerine gel
        aksiyon.perform();  // etkinlestir

        MyFunc.Wait(2);
        BekleVeKapat();
    }
}
