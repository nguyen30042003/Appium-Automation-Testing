
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import org.aspectj.lang.annotation.After;
import org.junit.Assert;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.TestNG;

import java.util.Collections;
public class DemoTest {


   // private static AppiumDriver<MobileElement> appiumDriver;


    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { DemoTest.class });
        testng.addListener(new TestListener());
        testng.setOutputDirectory("test-output");

        testng.run();
       /* try {
            //openCalculator();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }*/
    }
   /* ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
    @BeforeMethod
    public void setup() throws MalformedURLException{
        extent.attachReporter(spark);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Xiaomi 2201117TG API 33");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("udid","99acff86");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("appPackage",
                "com.dencreak.dlcalculator");
        capabilities.setCapability("appActivity",
                "com.dencreak.dlcalculator.DLCalculatorActivity");

        URL url  = new URL ("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AppiumDriver<MobileElement>(url,capabilities);
        System.out.println("application start");
    }

    @Test
    public void testcase1(){
        ExtentTest extentTest = extent.createTest("Plus 2 number");
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        *//*MobileElement mobileElement1 = appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"nguyenpv.30@gmail.com\")"));
        MobileElement mobileElement1 = appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"30042003nguyen\")"));
*//*

        MobileElement mobileElement1 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a"));
        MobileElement mobileElement2 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b"));
        MobileElement mobileElement3 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d"));
        MobileElement mobileElement4 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d"));
        MobileElement mobileElement5 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val"));
        mobileElement1.click();
        mobileElement3.click();
        mobileElement2.click();
        mobileElement4.click();
        extentTest.log(Status.PASS, "ok lalala");
        extentTest.pass("okopkokokok");
    }
    @AfterMethod
    public void tearDown() {
        if (appiumDriver != null) {
            extent.flush();
            appiumDriver.quit();
        }
    }*/


    /*public static void openCalculator() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","Xiaomi 2201117TG API 33");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("udid","99acff86");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("appPackage",
                "com.dencreak.dlcalculator");
        capabilities.setCapability("appActivity",
                "com.dencreak.dlcalculator.DLCalculatorActivity");

        URL url  = new URL ("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AppiumDriver<MobileElement>(url,capabilities);
        System.out.println("application start");

        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        MobileElement mobileElement1 = appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"nguyenpv.30@gmail.com\")"));
        MobileElement mobileElement1 = appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"30042003nguyen\")"));


        MobileElement mobileElement1 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a"));
        MobileElement mobileElement2 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b"));
        MobileElement mobileElement3 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d"));
        MobileElement mobileElement4 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d"));
        MobileElement mobileElement5 = appiumDriver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val"));
        mobileElement1.click();
        mobileElement3.click();
        mobileElement2.click();
        mobileElement4.click();


    }*/


}