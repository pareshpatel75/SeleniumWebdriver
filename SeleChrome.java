package SeleLerning;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("tester01");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();



    }



    }

