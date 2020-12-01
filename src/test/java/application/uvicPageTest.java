package application;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uvicPageTest {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chrome_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void uvic_homepage() throws  Exception {

        // Exercise 1
        driver.navigate().to("https://www.uvic.ca/");
        driver.manage().window().maximize();

        //Exercise 2

        WebElement admissions = driver.findElement(By.cssSelector("#uvic-nav > div > div > ul > li:nth-child(1) > a"));
        assertEquals(admissions.getText(), "Admissions");

        WebElement academics = driver.findElement(By.cssSelector("#uvic-nav > div > div > ul > li:nth-child(2)"));
        assertEquals(academics.getText(), "Academics");

        WebElement research = driver.findElement(By.cssSelector("#uvic-nav > div > div > ul > li:nth-child(3)"));
        assertEquals(research.getText(), "Research");

        WebElement campus = driver.findElement(By.cssSelector("#uvic-nav > div > div > ul > li:nth-child(4)"));
        assertEquals(campus.getText(), "Campus");

        WebElement about = driver.findElement(By.cssSelector("#uvic-nav > div > div > ul > li:nth-child(5)"));
        assertEquals(about.getText(), "About UVic");

        WebElement support = driver.findElement(By.cssSelector("#uvic-nav > div > div > ul > li:nth-child(6)"));
        assertEquals(support.getText(), "Support UVic");

        // Excercise 3

        WebElement singIn_B = driver.findElement(By.cssSelector("#uv-header > div:nth-child(3) > div.glbl > div > div > div.col-auto.d-flex.align-items-center > a.btn.btn-sm.btn-outline-primary.glbl__btn.glbl__btn--unauth"));
        assertEquals(singIn_B.getText(), "Sign in");

        // Excercise 4

        WebElement phoneN = driver.findElement(By.cssSelector("body > footer > div > div.ftr__lvl3 > div > div > div:nth-child(2) > div > div:nth-child(1) > ul > li:nth-child(1) > a"));
        assertEquals(phoneN.getText(), "1-250-721-7211");


    }





}
