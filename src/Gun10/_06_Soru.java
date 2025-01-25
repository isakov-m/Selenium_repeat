package Gun10;

/*
    Senaryo:
    https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _06_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://google.com/");

        List<WebElement> cookiesAccept= driver.findElements(By.xpath("//button[@id='L2AGLb']"));
        if (cookiesAccept.size() > 0) //
            cookiesAccept.get(0).click();

        MyFunc.Wait(2);
        WebElement srcBox = driver.findElement(By.name("q"));
        srcBox.sendKeys("selenium" + Keys.ENTER);


//        WebElement srcBtn = driver.findElement(By.name(""));
//        srcBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/h3)[1]")));
        WebElement link1 = driver.findElement(By.xpath("(//a/h3)[1]"));
        link1.click();

        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
        Assert.assertTrue("URL dogrulanamadi", driver.getCurrentUrl().equals("https://www.selenium.dev/"));

        BekleVeKapat();
    }

    // // TODO:  selenium yazısını göndermeyi ve ENTER a basmasını Actions la yapınıw,

    @Test
    public void Test2(){
        driver.get("https://google.com/");
        WebElement srcBox = driver.findElement(By.name("q"));

        new Actions(driver).moveToElement(srcBox).click().sendKeys("selenium"+Keys.ENTER).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/h3)[1]")));
        WebElement link1 = driver.findElement(By.xpath("(//a/h3)[1]"));
        link1.click();

        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
        Assert.assertTrue("URL dogrulanamadi", driver.getCurrentUrl().equals("https://www.selenium.dev/"));

        BekleVeKapat();
    }

}
