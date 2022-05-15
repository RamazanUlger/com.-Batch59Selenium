package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        //ilerde wait konusunu daha genis olarak ele alacagiz
        //Bir sayfa yuklerken ilk basta sayfanin icerisinde bulunan  elementlere gore
        //bir yukleme suresine ihtiyac vardir
        //veya bir webelementin kullanilmasi icin zamana ihtiyac olarabilir
        //implicitlyWait() bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin
        //beklenecek MAXIMUM sureyi belirleme olanagi tanir.
ChromeDriver driver1=new ChromeDriver();
        System.out.println(driver.getPageSource());

    }
}
