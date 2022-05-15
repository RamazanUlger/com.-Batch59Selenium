package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Maximize Konum :"+driver.manage().window().getPosition());
        System.out.println("Maximize Boyut :"+driver.manage().window().getSize());
   driver.manage().window().fullscreen();
        System.out.println("Fullscreen Maximize Konum :"+driver.manage().window().getPosition());
        System.out.println("Fullscreen Maximize Boyut :"+driver.manage().window().getSize());

    }
}
