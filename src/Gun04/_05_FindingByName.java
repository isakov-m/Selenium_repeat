package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        // textBox lari name ile bulup adinizi ve soyadinizi doldurun
        // ve butonu da id veya name ile bulup tiklatin

        WebElement firstName = driver.findElement(By.name("q8_name[first]"));   // name ile bulma
        firstName.sendKeys("Ismet");


        WebElement lasttName = driver.findElement(By.name("q8_name[last]"));    // name ile bulma
        lasttName.sendKeys("Temur");

        WebElement clickBtn = driver.findElement(By.id("input_2"));
        clickBtn.click();

        MyFunc.Wait(5);
        driver.quit();

    }
}
