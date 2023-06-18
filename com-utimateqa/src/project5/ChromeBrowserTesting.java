package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting
{
    public static void main(String[] args)throws InterruptedException
    {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //1. Setup  Chrome Browser
        WebDriver driver = new ChromeDriver();

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
