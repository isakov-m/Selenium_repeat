package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");     // sayfaya gittim

        try {
            WebElement soyadKutusu = driver.findElement(By.id("hatalilokator"));

        } catch (Exception ex) {
            System.out.println("Web element bulunamadi " + ex.getMessage());
        }

        MyFunc.Wait(5);
        driver.quit();
    }
}
