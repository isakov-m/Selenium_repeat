package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _03_WindowsSize extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.youtube.com/");
        MyFunc.Wait(2);


        driver.manage().window().maximize();    // ekrani max yapiyordu
        MyFunc.Wait(2);
        Dimension yeniBoyut = new Dimension(516,600);

        driver.manage().window().setSize(yeniBoyut);    // ekrandaki pencereyi
        // istenilen boyutlara getirdim, teste boyle basliyorum

        // testler

        BekleVeKapat();
    }
}
