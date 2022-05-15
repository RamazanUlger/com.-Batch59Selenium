package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println("Pencere olculeri : "+driver.manage().window().getSize());
        System.out.println("Pencere konumu"+driver.manage().window().getPosition());
       driver.manage().window().setPosition(new Point(15,30));

       driver.manage().window().setSize(new Dimension(900,500));
       System.out.println("Yeni Pencere konumu"+driver.manage().window().getPosition());
        System.out.println("Yeni Pencere olculeri : "+driver.manage().window().getSize());
    }
}
