package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_AlertPart2 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        WebElement clickMe2 = driver.findElement(By.id("confirmexample"));
        clickMe2.click();

        MyFunc.Wait(2);
        // alert acildi
        driver.switchTo().alert().dismiss();
        // alert kutusuna git ve CANCEL a bas. Boylece kapaniyor.

        BekleVeKapat();
    }
}
