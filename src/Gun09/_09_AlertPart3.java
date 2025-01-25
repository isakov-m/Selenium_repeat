package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _09_AlertPart3 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        WebElement clickMe3 = driver.findElement(By.id("promptexample"));
        clickMe3.click();

        MyFunc.Wait(2);
        // alert acildi
        driver.switchTo().alert().sendKeys("Ismet");    // alert kutusuna git ve "Ismet" yazisini gonder
        driver.switchTo().alert().accept(); // alert kapatildi

        MyFunc.Wait(2);
        WebElement txtActual = driver.findElement(By.id("promptreturn"));

        Assert.assertTrue("Beklenen yazi gozukmedi",txtActual.getText().contains("Ismet"));

        BekleVeKapat();
    }
}
