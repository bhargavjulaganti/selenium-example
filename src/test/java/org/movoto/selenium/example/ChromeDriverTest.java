package org.movoto.selenium.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by haozuo on 3/22/16.
 */
public class ChromeDriverTest {

    private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() {
       
        
        System.out.println("before method " );
        
    }

    @Test
    public void testTitle() throws IOException {
	    
	 System.out.println("test title method" );    
      /*   String exePath = "webdriver/chromedriver";
		
        System.setProperty("webdriver.chrome.driver", exePath);
        
		driver = new ChromeDriver();
		
        driver.get("http://www.google.com");
              
        String title = driver.getTitle();
        
        System.out.println("Title of the page is : " + title); */
    }

    @After
    public void teardown() throws IOException {
       
	    System.out.println("tear down method" );  
	   // driver.quit();
    }

}
