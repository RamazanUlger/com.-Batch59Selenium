package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_WiederholungTest {
    public static void main(String[] args) {
      //  1. Bir class oluşturun : AmazonSearchTest
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //  2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        amazonSucheTest(driver);
        driver.close();

    }//

    private static void amazonSucheTest(WebDriver driver) {
        //          a.google web sayfasına gidin. https://www. amazon.com/
       driver.get("https://www.amazon.com");

       //  b. Search(ara) “city bike”
        WebElement sucheLeiste=driver.findElement(By.id("twotabsearchtextbox"));
        sucheLeiste.sendKeys("city bike"+ Keys.ENTER);

        //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
       WebElement ergebnisZahl=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
       String []arrStr=ergebnisZahl.getText().split(" ");
        System.out.println("Gewunschtes Ergebnis : "+arrStr[2]);
        //  e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
      WebElement ersteErgebniss=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/" +
              "div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div"));
      ersteErgebniss.click();
        //  d. “Shopping” e tıklayın.
       WebElement inDenEikaufKorb=driver.findElement(By.id("add-to-cart-button"));
       inDenEikaufKorb.click();



    }
}
