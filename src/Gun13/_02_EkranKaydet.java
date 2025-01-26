package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Wait(2);

        // kendine kod yaziyorsan
        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("1234");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMsj = driver.findElements(By.xpath("//p[text()='Invalid credentials']"));
        if (errorMsj.size()>0){ // hata olmusSA

            System.out.println("Hata oldu");
            // ekran kaydet

            TakesScreenshot ts = (TakesScreenshot) driver;  // 1. asama ekran goruntusu alma degiskenini tanimladim
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);  // 2.asama ekran goruntusu alindi, hafizada
            // Ekran goruntusu dosya formatinda hafizaya al: "get screenshot as file"

            // 3. asama hafizadaki ekran goruntusunu fiziksel dosyaya kaydetmem gerekiyor
            //hafızadaki ekran kaydını, yolunu(path) ini ve ismini verdiğim şu dosyaya kaydet
            FileUtils.copyFile(hafizadakiHali,new File("ekrangoruntuleri\\screenshot.png"));

            // TODO : Oyle bir sey yapinki her ekran kaydi, AYRI kaydedilsin
        }

        BekleVeKapat();
    }

}
