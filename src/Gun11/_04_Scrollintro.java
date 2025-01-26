package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class _04_Scrollintro extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Wait(2);

        // Actions actionDriver = new Actions(driver); // driver dan action calistirabilen driver urettik

        JavascriptExecutor js =(JavascriptExecutor) driver; // casting

        js.executeScript("window.scrollTo(0, 500);");   // x, y : bastan verilen yere gider

        MyFunc.Wait(2);
        js.executeScript("window.scrollBy(0, 500);");   // en kaldigi yerden 500 daha gider

        MyFunc.Wait(2);
        js.executeScript("window.scrollBy(0, -200);");   // en kaldigi yerden 500 daha gider

        BekleVeKapat();
    }
}
