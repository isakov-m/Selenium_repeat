package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://amazon.com/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu = new Select(webMenu);    // elementi daha rahat kullanabilir SELECT nesnesi haline donusturdu

        // bu element select tag i ile basliyorsa, sen bunu SELECT e cast yap ve oyle kullan.

        // ddMenu.selectByIndex(4);     ister bu sekilde secebilirsin : indexli
        // ddMenu.selectByValue("search-alias=electronics-intl-ship");      ister bu sekilde secebilirsin : value ile
        ddMenu.selectByVisibleText("Electronics");  // ister bu sekilde secebilirsin : gorunen string ile

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());
        // select in kac tane option u var bunu bu sekilde alabiliriz
        for (WebElement e: ddMenu.getOptions()) {
            System.out.println("e.getText() = " + e.getText());
            System.out.println("- value = "+e.getAttribute("value"));
        }
        BekleVeKapat();
    }
}
