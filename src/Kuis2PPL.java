/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/**
 *
 * @author ALL
 */
public class Kuis2PPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.1crmcloud.com/login.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        WebElement A = driver.findElement(By.id("login_button"));
        A.click();
        Thread.sleep(6000);
        driver.findElement(By.className("default-avatar")).click();
    }
    
}
