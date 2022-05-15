package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        //amazon sitesinde gidip kaynak kodlarinda "spend less"
        // yaziginiz test edin.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
       String kaynakKodlari= driver.getPageSource();
   String arananaKelime="Free shipping on millions of items.";
        if (kaynakKodlari.contains(arananaKelime)) {
            System.out.println("Kaynak kodlarinda "+arananaKelime +" icermektedir.\n Test Basarili");
        }else System.out.println("Kaynak kodlarinda aradiginiz kelime yok.\n TEST FAILED");
    }
}
