package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver",
                            "src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");

    }
}
