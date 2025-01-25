package Gun10;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _05_Soru extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.demoblaze.com/index.html");

        WebElement link = driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement addToCart = driver.findElement(By.linkText("Add to cart"));
        addToCart.click();

        wait.until(ExpectedConditions.alertIsPresent());    // alert gozukene kadar tikla
        driver.switchTo().alert().accept();

        WebElement productStore = driver.findElement(By.linkText("PRODUCT STORE"));
        productStore.click();


        BekleVeKapat();
    }

}
