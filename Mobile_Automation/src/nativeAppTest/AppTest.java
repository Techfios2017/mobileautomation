package nativeAppTest;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
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
        capb.setCapability("app", "C:\\Users\\eldrid\\Desktop\\Techfios\\selendroid-test-app-0.17.0.apk");
        
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capb);
        Thread.sleep(4000);
        
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.id("io.selendroid.testapp:id/waitingButtonTest")).click();
        Thread.sleep(12000);
        driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("Abbas");
        Thread.sleep(3000);
        driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("abc@gmai.com");
        Thread.sleep(3000);
        WebElement pass = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
        pass.sendKeys("Test123");
        Thread.sleep(3000);
        
        driver.hideKeyboard();
        
        
    }

}