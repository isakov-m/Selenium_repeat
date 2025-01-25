package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_AlertPart1 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        WebElement clickMe1 = driver.findElement(By.id("alertexamples"));
        clickMe1.click();

        MyFunc.Wait(2);
        // alert acildi
        driver.switchTo().alert().accept();
        // alert kutusuna git ve OK ye bas. Boylece kapaniyor.

        BekleVeKapat();
    }
}
