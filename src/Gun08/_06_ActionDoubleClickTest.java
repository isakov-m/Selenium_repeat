package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement btnDblClick = driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Wait(2);

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(btnDblClick).doubleClick().build();
        aksiyon.perform();

        BekleVeKapat();

        // aksiyonlar.doubleClick(btnDblClick).build().perform();
    }
}
