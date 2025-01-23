package Gun06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _03_CssSelectorTest extends BaseDriver {
    @Test   // sen testsin maine ihtiyacin yok
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesaj="Merhaba Selenium";
        WebElement txtBox= driver.findElement(By.cssSelector(""));
        txtBox.sendKeys(mesaj);

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("Aranilan mesaj bulunamadi",msg.getText().contains(mesaj));   // icindeki TRUE mu DEGIL mi
        // TRUE ise hic mesaj verme, degilse hata mesaji ver

        BekleVeKapat();
    }
}
