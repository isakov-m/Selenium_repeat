package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementinStatus extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-label"));

        MyFunc.Wait(2);
        System.out.println("sali.isDisplayed() = " + sali.isDisplayed());   // web de gorunuyor mu
        System.out.println("sali.isEnabled() = " + sali.isEnabled());       // web de etkin mi
        System.out.println("sali.isSelected() = " + sali.isSelected());     // cekli durumda mi

        sali.click();
        MyFunc.Wait(2);
        System.out.println("sali.isSelected() = " + sali.isSelected());

        WebElement cumartesi = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-label"));

        MyFunc.Wait(2);
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed());
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled());
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected());

        BekleVeKapat();
    }
}
