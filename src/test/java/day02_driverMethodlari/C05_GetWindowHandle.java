package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_GetWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
        //CDwindow-82DF7B4532002445644EF258946DF262 yukardaki window'un kendine ozgu olan hascode
        //benzersiz olarak acilan Window'a ait olan hashcode'unu verir.
        driver.close();

    }
}
