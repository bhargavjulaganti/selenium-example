package org.movoto.selenium.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by haozuo on 3/23/16.
 */
public class FirefoxTest {

    private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() {

        testUrl = "https://www.google.com";

        System.setProperty("webdriver.gecko.driver","webdriver/geckodriver");

        // Create a new instance of the Chrome driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        driver = new FirefoxDriver();

        // And now use this to visit myBlog
        // Alternatively the same thing can be done like this
        // driver.navigate().to(testUrl);
        driver.get(testUrl);
    }

    @Test
    public void testTitle() throws IOException {

        String title = driver.getTitle();
        
        System.out.println("Title of the page is : " + title);
    }

    @After
    public void teardown() throws IOException {
        driver.quit();
    }

}
