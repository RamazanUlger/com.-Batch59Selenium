package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {

       //     Main method oluşturun ve aşağıdaki görevi tamamlayın.
       System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // a. http://a.testaddressbook.com adresine gidiniz.
       driver.get("http://a.testaddressbook.com");
        // b. Sign in butonuna basin
        WebElement signinLink=driver.findElement(By.linkText("Sign in"));
       signinLink.click();
       // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
      WebElement emailTextBox=driver.findElement(By.id("session_email"));
      WebElement passwordTextBox=driver.findElement(By.name("session[password]"));
      WebElement signInbutton=driver.findElement(By.name("commit"));
      // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //     i. Username : testtechproed@gmail.com
       //     ii. Password : Test1234!
       emailTextBox.sendKeys("testtechproed@gmail.com");
       passwordTextBox.sendKeys("Test1234!");
       signInbutton.click();
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
      WebElement userIdElement=driver.findElement(By.className("navbar-text"));
      String expectedUserName="testtechproed@gmail.com";
        if (userIdElement.equals(expectedUserName)) {
            System.out.println("Kullanici Testi PASSED");
        }else System.out.println("Kullanici Testi FAILED");


       // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
      WebElement addressesElement=driver.findElement(By.linkText("addresses"));
        WebElement signOutElement=driver.findElement(By.linkText("sign-out"));

       // 3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi : " + linklerListesi.size());
        // linkleri yazdiralim
        // Listemiz webelementlerden olustugu icin, direk yazdirirsak referanslari yazdirir
        // onun yerine for-each loop yapip her bir link webelementinin uzerindeki yaziyi yazdirmaliyiz
        for (WebElement each: linklerListesi
        ) {
            System.out.println(each.getText());
        }


    }
}
