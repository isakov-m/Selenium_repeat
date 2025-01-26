package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _05_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Wait(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");   // sayfanin sonuna gider
        MyFunc.Wait(2);
        js.executeScript("window.scrollTo(0, 0);"); // sayfanin en ustune gider

        BekleVeKapat();
    }
}
