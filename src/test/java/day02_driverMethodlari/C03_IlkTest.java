package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*
        1 : https://www.amazon.com url'ine gidin
        2 : Basligin Amazon kelimesini icerdigini test edin
        3 : URl'in https://www.amazon.com url'ine esit olup olmadigini kontrol edin
        4 : sayfay kapatin
        * */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

      //  1 : https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");
      //  2 : Basligin Amazon kelimesini icerdigini test edin
      String actualTitel=  driver.getTitle();
      String arananKelime="Amazon";
        if (actualTitel.contains(arananKelime)) {
            System.out.println("Titel Testi PASSED");
        }else System.out.println(arananKelime+" kelimesi basliga esit degildir.TEST FAILIED");
      //  3 : URl'in https://www.amazon.com url'ine esit olup olmadigini kontrol edin
        String actualURL= driver.getCurrentUrl();
        String expectedURL="https://www.amazon.com/";
        if (actualTitel .equals(expectedURL)) {
            System.out.println("TEST BASARILI");
        }else System.out.println("TEST FAILIED");

      //  4 : sayfay kapatin
        driver.close();

    }
}
