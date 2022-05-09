import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwithces",new String[]{"enable-automation"});
*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/uye-ol");
        driver.manage().window().maximize(); //Ekranı büyütür

        Thread.sleep(2000);
        driver.findElement(By.name("RegisterFormView.RegisterEmail")).sendKeys("yanliss");
        driver.findElement(By.name("RegisterFormView.Password")).sendKeys("abcde1234");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".button.bc-blue.register-button-link.submit-button")).click();

        String uyari = driver.findElement(By.cssSelector("#RegisterFormView_RegisterEmail-error")).getText();
        System.out.println(uyari);
















    }
}
