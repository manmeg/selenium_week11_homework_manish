package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting
{
    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //1. Setup Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2. Open the URL into Browser
        driver.get(baseUrl);

        //Maximize screen
        driver.manage().window().maximize();

        // implicitly wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3.Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        //4. Print the Current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //5. Print the Page Source
        System.out.println("Page source : " + driver.getPageSource());

        //6. Enter the email to email field
        //Find the Email Field Element
        WebElement usernameField = driver.findElement(By.name("username"));

        //Type the username address to the username field element
        usernameField.sendKeys("Mani");

        //7. Enter the password to password field
        //Find the Password Field Element
        WebElement passwordField = driver.findElement(By.name("password"));

        //Type the password address to the password field element
        passwordField.sendKeys("mani1598@");

        // Hold Screen
        Thread.sleep(2000);

        //8.Close The Browser
        driver.close();

    }
}
