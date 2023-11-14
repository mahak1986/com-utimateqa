package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Utimateqa {

    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/";

    public static void main(String[] args) throws InterruptedException {
        // Which browser to launch using if else
        // EqualsIgnoreCase ignores upper case or lower case
        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else {
            System.out.println("Invalid browser name");
        }

        //Open Url
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Printing the totle of the page
        System.out.println("The title of the page is: " + driver.getTitle());

        //Print the current url
        System.out.println("The current Url is: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source is: " + driver.getPageSource());

        //Click on sign in link
        driver.findElement(By.linkText("Sign In")).click();

        //Print the current url
        System.out.println("The current Url is: " + driver.getCurrentUrl());

        //Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("mahak@gmail.com");

        //Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("Mahak123");
        Thread.sleep(2000);

        //Click on Login Button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Navigate to base Url
        driver.navigate().to(baseUrl);
        Thread.sleep(2000);

        //Navigate forward to Homepage
        driver.navigate().forward();
        Thread.sleep(2000);

        //Navigate back to baseUrl
        driver.navigate().to(baseUrl);
        Thread.sleep(2000);

        //Refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);

        //Close the browser
        driver.quit();



    }
}
