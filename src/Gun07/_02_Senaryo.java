package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Senaryo extends BaseDriver {
//        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.

    @Test
    public void test1() {
        driver.get("https://www.saucedemo.com/");

        MyFunc.Wait(1);
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginBtn.click();
        MyFunc.Wait(1);

        // 1. urun sepete eklendi
        WebElement backpack = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        backpack.click();
        MyFunc.Wait(1);


        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCart.click();
        MyFunc.Wait(1);


        WebElement backBtn = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backBtn.click();
        MyFunc.Wait(1);

        // 2. urun sepete eklendi
        WebElement tshirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        tshirt.click();
        MyFunc.Wait(1);


        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCart2.click();
        MyFunc.Wait(1);

        WebElement shoppingCart= driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        shoppingCart.click();
        MyFunc.Wait(1);

        WebElement checkout= driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        WebElement firstName= driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Ismet");

        WebElement lastName= driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Temur");

        WebElement zipCode= driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("12345");

        WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
        continueBtn.click();

        // urunlerin ucret toplamlarinin kontrolu
        List<WebElement> ucretler= driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for (WebElement e: ucretler)
        {
            System.out.println(e.getText());
            toplam+=Double.parseDouble(e.getText().replaceAll("[^0-9,.]",""));
        }
        System.out.println("toplam = " + toplam);

        // item total alindi ve double a cevrildi
        WebElement itemtotalElement= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        Double itemtotal=Double.parseDouble(itemtotalElement.getText().replaceAll("[^0-9,.]",""));
        System.out.println("itemtotal = " + itemtotal);

        Assert.assertTrue("Degerler esit degil",toplam==itemtotal);

        BekleVeKapat();
        driver.quit();
    }
}
