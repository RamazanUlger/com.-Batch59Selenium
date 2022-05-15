package day04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get(" https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
driver.findElement(By.xpath("//button")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
         WebElement addButton=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (addButton.isDisplayed()) {
            System.out.println("AddElement Passed");
        } else System.out.println("FAILED");
        //4- Delete tusuna basin
     WebElement removeELement=   driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
     removeELement.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
    /*    if (removeELement .isDisplayed()) {
            System.out.println("DELETE PASSED");
        }else System.out.println("DELETE FAILED");*/





    }
}
