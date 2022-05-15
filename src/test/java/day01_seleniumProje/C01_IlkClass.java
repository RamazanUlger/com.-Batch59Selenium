package day01_seleniumProje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
       //en ilkel haliyle bir otomasyon yapmak icin
        //Classimiza otomasyon icin gerekli olan webDriver'in
        //yerini gostermemiz gerekir.
        //Bunun icin kutuphaneden System.setProperty() mrthodu kullaniriz
        //method iki parametre istemektedir
        //ilki

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);
        driver.get("https://www.techproeducation.com");
        Thread.sleep(5000);
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);

        driver.close();
    }
}
