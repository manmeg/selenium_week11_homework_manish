package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting
{
    static String browser = "Firefox";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    static WebDriver driver;

    public static void main(String[] args)throws InterruptedException
    {
        //1. Setup Multi Browser
        if (browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid Browser name");
        }

        driver.get(baseUrl);

        //2. Open the URL into Browser
        driver.get(baseUrl);

        //Maximize screen
        driver.manage().window().maximize();

        // implicitly wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        //4. Print the Current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //5. Print Page Source
        System.out.println("Page source : " + driver.getPageSource());

        //6. Enter the email to email field
        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("user[email]"));

        //Type the email address to the email field element
        emailField.sendKeys("Mani789@gmail.com");

        //7. Enter the password to password field
        //Find the Password Field Element
        WebElement passwordField = driver.findElement(By.id("user[password]"));

        //Type the password address to the password field element
        passwordField.sendKeys("Mani123@");

        //hold Screen
        Thread.sleep(2000);

        //Close The Browser
        driver.close();

    }


}
