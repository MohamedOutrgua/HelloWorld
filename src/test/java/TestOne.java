import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestOne {

@Test()
    public void test () throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://arahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
    driver.findElement(By.name("inputPassword")).sendKeys("hello123");
    driver.findElement(By.className("signInBtn")).click();
    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(1000);//
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail");
    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864351222111");
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("123");
    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("123");
    driver.findElement(By.id("chkboxOne")).click();
    driver.findElement(By.xpath("//button[contains(@class,'su')]")).click();
    System.out.println(driver.getTitle());
    driver.quit();
}
}
