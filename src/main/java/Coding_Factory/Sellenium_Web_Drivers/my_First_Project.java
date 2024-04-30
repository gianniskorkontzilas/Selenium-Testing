package Coding_Factory.Sellenium_Web_Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_First_Project {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/coding_factory/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mvnrepository.com/"); // invoke chrome browser and redirect to respective url

        driver.manage().window().maximize();  // maximize the window

        Thread.sleep(3000);

        driver.findElement(By.id("query")).click();

        driver.findElement(By.id("query")).sendKeys("Selenium Java");

        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);




        Thread.sleep(3000);


        driver.close();
    }
}
