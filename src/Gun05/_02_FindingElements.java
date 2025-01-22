package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _02_FindingElements extends BaseDriver {
    public static void main(String[] args) {
        // driverBaslat();
        driver.get("https://www.hepsiburada.com");

        List< WebElement> linkler = driver.findElements(By.tagName("a"));
        // butun a tag li elementleri bul

        for (WebElement e: linkler)
        {
            System.out.println("e.getText() = " + e.getText());
            //break;
        }

        BekleVeKapat();
    }
}
