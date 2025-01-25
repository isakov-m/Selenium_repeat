package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_YonTuslariSecim extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleContainer"));
        MyFunc.Wait(3);

        Actions aksiyonDriver = new Actions(driver);

        // elemente git, icine tiklat ve "b" yi gonder
        aksiyonDriver
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();

        MyFunc.Wait(2);

        aksiyonDriver
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        BekleVeKapat();
    }

}
