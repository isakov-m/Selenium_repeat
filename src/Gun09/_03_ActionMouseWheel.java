package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionMouseWheel extends BaseDriver {
    // mousun doner topu (Wheel) kaydirma

    @Test
    public void Action_mw_ts1(){
        // elemente scroll
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        WebElement iframe = driver.findElement(By.name("nested_scrolling_frame"));

        MyFunc.Wait(3);
        // iframe kadar scroll yap
        new Actions(driver).scrollToElement(iframe).build().perform();

        BekleVeKapat();
    }

    @Test
    public void Action_mw_ts2(){
        // driver = new ChromeDriver();     // coklu calisma icin
        // belli bir miktar kadar scroll
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Wait(3);

        new Actions(driver).scrollByAmount(0,500).build().perform();

        BekleVeKapat();
    }

    @Test
    public void Action_mw_ts3(){
        // driver = new ChromeDriver();     // coklu calisma icin
        // belli bir miktar kadar adim adim scroll
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Wait(3);
        WebElement iframe = driver.findElement(By.name("nested_scrolling_frame"));

        // TODO : iframe kadar 100px 100px seklinde adim adim 1 sn araliklarla scroll islemi yapiniz
        // ipucu elementin sayfanin basindan nekadar asagida oldugu bilgisini
        // element.getReact().getY;     seklinde alabilirsiniz

        BekleVeKapat();
    }
}
