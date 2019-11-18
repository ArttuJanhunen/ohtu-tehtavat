package ohtu;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;;

public class Tester {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://localhost:4567");

        sleep(2);

        // original login scenario
        /*
         * WebElement element = driver.findElement(By.linkText("login"));
         * element.click();
         * 
         * sleep(2);
         * 
         * 
         * element = driver.findElement(By.name("username")); element.sendKeys("pekka");
         * element = driver.findElement(By.name("password")); element.sendKeys("akkep");
         * element = driver.findElement(By.name("login"));
         */

        // scenario where username is real and password is incorrect
        /*
         * WebElement element = driver.findElement(By.linkText("login"));
         * element.click();
         * 
         * sleep(2);
         * 
         * 
         * element = driver.findElement(By.name("username")); element.sendKeys("pekka");
         * element = driver.findElement(By.name("password")); element.sendKeys("wrong");
         * element = driver.findElement(By.name("login"));
         */
        // scenario where new user is created
        /*
         * WebElement element = driver.findElement(By.linkText("register new user"));
         * element.click();
         * 
         * sleep(2);
         * 
         * Random r = new Random();
         * 
         * element = driver.findElement(By.name("username")); element.sendKeys("arttu" +
         * r.nextInt(100000)); element = driver.findElement(By.name("password"));
         * element.sendKeys("newpassword"); element =
         * driver.findElement(By.name("passwordConfirmation"));
         * element.sendKeys("newpassword"); element =
         * driver.findElement(By.name("signup"));
         * 
         * sleep(2); element.submit();
         * 
         * sleep(3);
         * 
         * // and if you have made a new account, this will log it out element =
         * driver.findElement(By.linkText("continue to application mainpage"));
         * element.click(); sleep(2); element =
         * driver.findElement(By.linkText("logout")); element.click();
         */

        sleep(2);

        driver.quit();
    }

    private static void sleep(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (Exception e) {
        }
    }
}
