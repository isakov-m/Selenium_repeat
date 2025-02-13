package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/*
   Interview Sorusu

   Windows pencerelerini nasıl kontrol edersin.
   ROBOT Class la kontrol ederim.

 */

public class _03_RobotGiris extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://www.google.com/");
        MyFunc.Wait(2);

        Robot robot = new Robot();

        // java ROBOT class
        robot.keyPress(KeyEvent.VK_CONTROL);    // ctrl bas
        robot.keyPress(KeyEvent.VK_T);          // bu basiliyken T a bas
        robot.keyRelease(KeyEvent.VK_T);        // T yi birak
        robot.keyRelease(KeyEvent.VK_CONTROL);  // ctrl yi birak
        // yeni pencere acildi mi

        MyFunc.Wait(2);
        // selenium windows handle switchTo
        // yeni acilan sekmeye gec
        Set<String> windowsIDler = driver.getWindowHandles();
        Iterator gosterge = windowsIDler.iterator();
        String firstSekme = gosterge.next().toString();
        String secondSekme = gosterge.next().toString();
//        System.out.println("firstSekme = " + firstSekme);
//        System.out.println("secondSekme = " + secondSekme);

        // selenium driver.get
        // drivera facebook açmasını söyle
        MyFunc.Wait(2);

        driver.switchTo().window(secondSekme);
        driver.get("https://www.facebook.com/");

        BekleVeKapat();
    }
}
