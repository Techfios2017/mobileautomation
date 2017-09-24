package webAppTest;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppTest {
	
	AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capb = new DesiredCapabilities();
        capb.setCapability("platformName", "Android");
        capb.setCapability("platformmVersion", "7.0");
        capb.setCapability("deviceName", "emulator-5554");
        capb.setCapability("browserName", "chrome");
        
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capb);
        Thread.sleep(9000);
        //driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
        Thread.sleep(9000);
        //driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
        Thread.sleep(9000);
        driver.navigate().to("https://amazon.com");
        
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        
        driver.findElement(By.id("gwSearchKeyword")).sendKeys("Iphone");
        
    }

}
