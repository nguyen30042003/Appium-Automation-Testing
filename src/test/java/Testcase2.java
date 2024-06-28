import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class Testcase2 {
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
    public void testCreateProject()
    {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30@gmail.com");
        passwordField.sendKeys("30042003nguyen");
        signInButton.click();
        MobileElement create = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create\"]/android.view.View"));
        create.click();
        MobileElement create_project = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create Project\"]"));
        create_project.click();
        MobileElement projectName = appiumDriver.findElement(new By.ByXPath("//android.widget.EditText"));
        projectName.sendKeys("project1");
        MobileElement space = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select a space\"]"));
        space.click();
        MobileElement selectSpace = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Space1\"]"));
        selectSpace.click();
        MobileElement due = appiumDriver.findElement(new By.ByXPath("//android.widget.Spinner"));
        due.click();
        MobileElement selectDate = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"30 tháng 6 2024\"]"));
        selectDate.click();
        MobileElement setDateButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        setDateButton.click();
        MobileElement addPeople = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Assign users\"]"));
        addPeople.click();
        MobileElement tickBoxAddPeople = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View"));
        tickBoxAddPeople.click();
        MobileElement doneAddPeople = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Done\"]"));
        doneAddPeople.click();
        MobileElement save = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Create\"]"));
        save.click();
    }


    @Test
    public void testCreateProjectInvalidEmptyProjectName()
    {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30@gmail.com");
        passwordField.sendKeys("30042003nguyen");
        signInButton.click();
        MobileElement create = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create\"]/android.view.View"));
        create.click();
        MobileElement create_project = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create Project\"]"));
        create_project.click();
        MobileElement projectName = appiumDriver.findElement(new By.ByXPath("//android.widget.EditText"));
        //projectName.sendKeys("project1");
        MobileElement space = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select a space\"]"));
        space.click();
        MobileElement selectSpace = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Space1\"]"));
        selectSpace.click();
        MobileElement due = appiumDriver.findElement(new By.ByXPath("//android.widget.Spinner"));
        due.click();
        MobileElement selectDate = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"30 tháng 6 2024\"]"));
        selectDate.click();
        MobileElement setDateButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        setDateButton.click();
        MobileElement addPeople = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Assign users\"]"));
        addPeople.click();
        MobileElement tickBoxAddPeople = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View"));
        tickBoxAddPeople.click();
        MobileElement doneAddPeople = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Done\"]"));
        doneAddPeople.click();
        MobileElement save = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Create\"]"));
        save.click();
        MobileElement error= appiumDriver.findElement(new By.ByXPath("//android.widget.TextView[@text=\"This field is required\"]"));
        Assert.assertEquals(true, error.isDisplayed(), "Okkk");
    }



    @Test
    public void testCreateProjectWithPassedDay()
    {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30@gmail.com");
        passwordField.sendKeys("30042003nguyen");
        signInButton.click();
        MobileElement create = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create\"]/android.view.View"));
        create.click();
        MobileElement create_project = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create Project\"]"));
        create_project.click();
        MobileElement projectName = appiumDriver.findElement(new By.ByXPath("//android.widget.EditText"));
        projectName.sendKeys("project1");
        MobileElement space = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select a space\"]"));
        space.click();
        MobileElement selectSpace = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Space1\"]"));
        selectSpace.click();
        MobileElement due = appiumDriver.findElement(new By.ByXPath("//android.widget.Spinner"));
        due.click();
        MobileElement selectDate = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"01 tháng 6 2024\"]"));
        selectDate.click();
        MobileElement setDateButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        setDateButton.click();
        MobileElement addPeople = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Assign users\"]"));
        addPeople.click();
        MobileElement tickBoxAddPeople = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View"));
        tickBoxAddPeople.click();
        MobileElement doneAddPeople = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Done\"]"));
        doneAddPeople.click();
        MobileElement save = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Create\"]"));
        save.click();
    }

    @AfterMethod
    public void tearDown() {
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }
}
