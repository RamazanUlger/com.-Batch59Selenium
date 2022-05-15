package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class C01_Locator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println(driver.manage().timeouts());

        //Amazona gidip nutella aratalim
        driver.get("https://amazon.com");
        //findElement() istegimiz webelmentini bize dondurur
        //biz de o weBElmentini kullanmak icin  bir objeye assign ederiz
       // WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));


        /*
        <input type="text"
        id="twotabsearchtextbox"
        value="" name="field-keywords"
        autocomplete="off" placeholder=""
         class="nav-input nav-progressive-attribute"
         dir="auto"
         tabindex="0" aria-label="Suche">
         */
        WebElement aramaKutusu= driver.findElement(By.className("nav-input nav-progressive-attribute"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        Thread.sleep(2000);
        driver.close();





    }
}
