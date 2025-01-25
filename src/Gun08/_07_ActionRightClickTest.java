package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionRightClickTest extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
        MyFunc.Wait(2);

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.contextClick(btnRightClick).build();
        aksiyon.perform();

        aksiyonlar.moveToElement(btnRightClick).contextClick().build();

        BekleVeKapat();
    }
}
