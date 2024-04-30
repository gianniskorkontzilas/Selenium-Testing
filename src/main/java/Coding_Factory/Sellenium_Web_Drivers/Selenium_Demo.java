package Coding_Factory.Sellenium_Web_Drivers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium_Demo {
    public static void main(String[] args) throws InterruptedException {

        String path = System.getProperty("user.dir") + "\\TestReports\\intex.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("CF Web Automation Test");
        reporter.config().setDocumentTitle("Test Results");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Giannis Ka");
        extent.createTest("Coding Factory Test");

        System.setProperty("webdriver.chrome.driver",  "C:/Users/coding_factory/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("inputUsername")).sendKeys("Giannis");

        Thread.sleep(2000);

        driver.findElement(By.xpath("input[@name=='inputPassword']")).sendKeys("Kati");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#checkboxTwo")).click();

        Thread.sleep(2000);

        driver.findElement(By.className("submit")).click();

        String x = driver.findElement(By.cssSelector("p.error")).getText();

        System.out.println(x);


        driver.close();

        extent.flush();
    }
}
