package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _06_FindingByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

//        WebElement firstName=driver.findElement(By.className("form-textbox")); //classname ile bulma
//        // findElement aynı locator da birden fazla element bulursa BİRİNCİSİNİ Gönderir
//        firstName.sendKeys("ismet");

        // belirli bir kritere göre çoklu elemanlara ulaşma
        List<WebElement> labels= driver.findElements(By.className("b4LLXnK8oFgCSaa4Ni13"));
        for(WebElement e: labels)
            System.out.println("e.getText() = " + e.getText());

        // findElement elemanı bulamazsa hata verir : no such element
        // findElemnts elemanları bulamazsa ne yapar ?  0 elemanlı List döndürür ve hata vermez
        List<WebElement> labels2= driver.findElements(By.className("yanlisname"));
        System.out.println("labels2.size() = " + labels2.size());

        MyFunc.Wait(5);
        driver.quit();
    }
}
