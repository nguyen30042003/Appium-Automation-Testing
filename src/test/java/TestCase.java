import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class TestCase {
    private static AppiumDriver<MobileElement> appiumDriver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Xiaomi 2201117TG API 33");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("udid", "99acff86");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "io.taskbox.app");
        capabilities.setCapability("appActivity", "io.taskbox.app.MainActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AppiumDriver<>(url, capabilities);
        System.out.println("Application started");
    }

    @Test
    public void testcaseLoginWithPassworkInvalid() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));
        emailField.sendKeys("nguyenpv.30@gmail.com");
        passwordField.sendKeys("3004003nguyen");
        signInButton.click();
        MobileElement errorElement = appiumDriver.findElement(MobileBy.xpath("//android.webkit.WebView[@text=\"Taskbox\"]" +
                "/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView"));
        errorElement.click();
        Assert.assertEquals(true, errorElement.isDisplayed(), "Login unsuccessful - Incorrect password");
    }

    @Test
    public void testcaseLoginWithEmailEmpty() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        passwordField.sendKeys("3004003nguyen");
        signInButton.click();
        MobileElement errorElement = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[1]"));
        errorElement.click();
        Assert.assertEquals(true, errorElement.isDisplayed(), "Login unsuccessful - Incorrect password");
    }
    @Test
    public void testcaseLoginWithPassworkEmpty() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30@gmail.com");


        passwordField.click();
        signInButton.click();
        MobileElement errorElement = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[1]"));
       // errorElement.click();
        Assert.assertEquals(true, errorElement.isDisplayed(), "Login unsuccessful - Emtpy password");
    }
    @Test
    public void testcaseLoginWithEmailInvalid() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30gmailcom");
        passwordField.sendKeys("30042003nguyen");
        signInButton.click();
        MobileElement errorElement = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[1]"));
        Assert.assertEquals(true, errorElement.isDisplayed(), "Login unsuccessful - email invalid");
    }
    @Test
    public void loginValid(){
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30@gmail.com");
        passwordField.sendKeys("30042003nguyen");
        signInButton.click();
        MobileElement create = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create\"]/android.view.View"));
        create.click();
    }
    @AfterMethod
    public void tearDown() {
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }
}
