package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://snapdeal.com/");

        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));

        // elemanin attribute larina ulasmak icin getAttribute u kullaniyoruz
        System.out.println("inputValEnter.getAttribute(class) = " + inputValEnter.getAttribute("class"));

        // Class in karsiligi olan CSS-Sekillendirme degerlerini almak icin getCssValue kullanilir
        System.out.println("inputValEnter.getCssValue(color) = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(font-size) = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(background) = " + inputValEnter.getCssValue("background"));

        BekleVeKapat();
    }
}
