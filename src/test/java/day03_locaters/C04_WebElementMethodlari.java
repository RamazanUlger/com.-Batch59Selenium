package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));


      // 2- arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName=aramaKutusu.getTagName();
        String expectedTagName="input";
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("TagName Test PASSED");
        }else System.out.println("TagName Test FAILED");
      // 3- arama kutusunun name attribute'nun degerinin fieled_keywords olsugunu test edin
        String actualAttribute=aramaKutusu.getAttribute("name");
        String expectedAttribute="fieled_keywords";
        if (actualAttribute.equals(expectedAttribute)) {
            System.out.println("Attribute Test PASSED");
        }else System.out.println("Attribute Test FAILED");
        driver.close();
    }
}
