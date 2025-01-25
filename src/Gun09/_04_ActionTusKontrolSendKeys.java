package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleContainer"));
        MyFunc.Wait(3);

        new Actions(driver).moveToElement(txtBox)   // kutucuga gel
                .click()                            // icine tiklat
                .keyDown(Keys.SHIFT)                // shift e bas
                .sendKeys("a")                      // "a" harfini gonder
                .keyUp(Keys.SHIFT)                  // shift i birak
                .sendKeys("hmet")                   // "hmet" kalan ismi gonder
                .build()                            // aksiyonu hazirla
                .perform();                         // islemi gerceklestir

        BekleVeKapat();
    }
}
