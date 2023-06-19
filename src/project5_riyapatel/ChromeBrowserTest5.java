package project5_riyapatel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest5 {
    public static void main(String[] args) {

        //1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Open the URL into Browser
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.get(baseUrl);

        //3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        //4. Print the current url
        String url = driver.getCurrentUrl();
        System.out.println("Current url is " + url);

        //5. Print the page source
        System.out.println("Page source " + driver.getPageSource());

        //6. Enter the email to email field
        WebElement email = driver.findElement(By.name("user[email]"));
        email.sendKeys("reemexperts@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 7. Enter the password to password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("riya123");

        //8. Close the browser
        driver.close();
    }
}
