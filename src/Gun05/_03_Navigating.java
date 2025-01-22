package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");


        WebElement element=driver.findElement(By.id("alerttest"));
        element.click();
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());     // o anda bulundugun URL bilgisini verir

        driver.navigate().back();
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());     // o anda bulundugun URL bilgisini verir

        driver.navigate().forward();
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());     // o anda bulundugun URL bilgisini verir
        System.out.println(driver.getTitle());          // o anda bulundugun TITLE bilgisini verir


        BekleVeKapat();
    }
}
