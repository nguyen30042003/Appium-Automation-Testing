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
public class TestCase3 {
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
    public void createTaskWithRepeat(){
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30@gmail.com");
        passwordField.sendKeys("30042003nguyen");
        signInButton.click();
        MobileElement create = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create\"]/android.view.View"));
        create.click();

        MobileElement create_task = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create Task\"]"));
        create_task.click();

        MobileElement taskName = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[1]"));
        taskName.sendKeys("taskname1");

        MobileElement styleDescription = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Italic (Ctrl + I)\"]"));
        styleDescription.click();
        MobileElement description = appiumDriver.findElement(new By.ByXPath("//android.widget.EditText[@text=\"\uFEFF\n" +
                "\"]"));
        description.sendKeys("description example");
        MobileElement selectProject = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select a project\"]"));
        selectProject.click();
        MobileElement pickProject = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Auto test\"]"));
        pickProject.click();
        MobileElement assign = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Assign users\"]"));
        assign.click();
        MobileElement addPeople = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View"));
        addPeople.click();
        MobileElement done = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Done\"]"));
        done.click();
        MobileElement allDate = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.CheckBox"));
        //allDate.click();
        MobileElement addDate = appiumDriver.findElement(new By.ByXPath("//android.widget.Spinner"));
        addDate.click();
        MobileElement selectDate = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"30 tháng 6 2024\"]"));
        selectDate.click();
        MobileElement setButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        setButton.click();
        MobileElement repeat = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.CheckBox"));
        repeat.click();
        MobileElement selectRepeat = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select...\"]"));
        selectRepeat.click();
        MobileElement pickRepeat = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Weekly\"]"));
        pickRepeat.click();
        MobileElement pickWeekDay = appiumDriver.findElement(new By.ByXPath("(//android.widget.TextView[@text=\"\uF0C8\"])[5]"));
        pickWeekDay.click();
        MobileElement endOn = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[16]/android.widget.Spinner"));
        endOn.click();
        MobileElement pickDateEnd = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"30 tháng 6 2024\"]"));
        pickDateEnd.click();
        MobileElement setDateEndButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        setDateEndButton.click();
        MobileElement save = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Create\"]"));
        save.click();

    }


    @Test
    public void createTaskWithoutRepeat(){
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30@gmail.com");
        passwordField.sendKeys("30042003nguyen");
        signInButton.click();
        MobileElement create = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create\"]/android.view.View"));
        create.click();

        MobileElement create_task = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create Task\"]"));
        create_task.click();

        MobileElement taskName = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[1]"));
        taskName.sendKeys("taskname1");

        MobileElement styleDescription = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Italic (Ctrl + I)\"]"));
        styleDescription.click();
        MobileElement description = appiumDriver.findElement(new By.ByXPath("//android.widget.EditText[@text=\"\uFEFF\n" +
                "\"]"));
        description.sendKeys("description example");
        MobileElement selectProject = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select a project\"]"));
        selectProject.click();
        MobileElement pickProject = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Auto test\"]"));
        pickProject.click();
        MobileElement assign = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Assign users\"]"));
        assign.click();
        MobileElement addPeople = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View"));
        addPeople.click();
        MobileElement done = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Done\"]"));
        done.click();
        MobileElement allDate = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.CheckBox"));
        //allDate.click();
        MobileElement addDate = appiumDriver.findElement(new By.ByXPath("//android.widget.Spinner"));
        addDate.click();
        MobileElement selectDate = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"30 tháng 6 2024\"]"));
        selectDate.click();
        MobileElement setButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        setButton.click();
//        MobileElement repeat = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.CheckBox"));
//        repeat.click();
//        MobileElement selectRepeat = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select...\"]"));
//        selectRepeat.click();
//        MobileElement pickRepeat = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Weekly\"]"));
//        pickRepeat.click();
//        MobileElement pickWeekDay = appiumDriver.findElement(new By.ByXPath("(//android.widget.TextView[@text=\"\uF0C8\"])[5]"));
//        pickWeekDay.click();
//        MobileElement endOn = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[16]/android.widget.Spinner"));
//        endOn.click();
//        MobileElement pickDateEnd = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"30 tháng 6 2024\"]"));
//        pickDateEnd.click();
//        MobileElement setDateEndButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
//        setDateEndButton.click();
        MobileElement save = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Create\"]"));
        save.click();

    }

    @Test
    public void createTaskWithTaskNameEmpty(){
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement emailField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,857][946,970]']"));
        MobileElement passwordField = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[@bounds='[134,1033][946,1146]']"));
        MobileElement signInButton = appiumDriver.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Let's go\"]"));

        emailField.sendKeys("nguyenpv.30@gmail.com");
        passwordField.sendKeys("30042003nguyen");
        signInButton.click();
        MobileElement create = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create\"]/android.view.View"));
        create.click();

        MobileElement create_task = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Create Task\"]"));
        create_task.click();

        MobileElement taskName = appiumDriver.findElement(MobileBy.xpath("//android.widget.EditText[1]"));
        //taskName.sendKeys("taskname1");

        MobileElement styleDescription = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Italic (Ctrl + I)\"]"));
        styleDescription.click();
        MobileElement description = appiumDriver.findElement(new By.ByXPath("//android.widget.EditText[@text=\"\uFEFF\n" +
                "\"]"));
        description.sendKeys("description example");
        MobileElement selectProject = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select a project\"]"));
        selectProject.click();
        MobileElement pickProject = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Auto test\"]"));
        pickProject.click();
        MobileElement assign = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Assign users\"]"));
        assign.click();
        MobileElement addPeople = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View"));
        addPeople.click();
        MobileElement done = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Done\"]"));
        done.click();
        MobileElement allDate = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.CheckBox"));
        //allDate.click();
        MobileElement addDate = appiumDriver.findElement(new By.ByXPath("//android.widget.Spinner"));
        addDate.click();
        MobileElement selectDate = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"30 tháng 6 2024\"]"));
        selectDate.click();
        MobileElement setButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        setButton.click();
        MobileElement repeat = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.CheckBox"));
        repeat.click();
        MobileElement selectRepeat = appiumDriver.findElement(new By.ByXPath("//android.view.View[@text=\"Select...\"]"));
        selectRepeat.click();
        MobileElement pickRepeat = appiumDriver.findElement(new By.ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Weekly\"]"));
        pickRepeat.click();
        MobileElement pickWeekDay = appiumDriver.findElement(new By.ByXPath("(//android.widget.TextView[@text=\"\uF0C8\"])[5]"));
        pickWeekDay.click();
        MobileElement endOn = appiumDriver.findElement(new By.ByXPath("//android.webkit.WebView[@text=\"Taskbox\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[16]/android.widget.Spinner"));
        endOn.click();
        MobileElement pickDateEnd = appiumDriver.findElement(new By.ByXPath("//android.view.View[@content-desc=\"30 tháng 6 2024\"]"));
        pickDateEnd.click();
        MobileElement setDateEndButton = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        setDateEndButton.click();
        MobileElement save = appiumDriver.findElement(new By.ByXPath("//android.widget.Button[@text=\"Create\"]"));
        save.click();
        MobileElement error= appiumDriver.findElement(new By.ByXPath("//android.widget.TextView[@text=\"This field is required\"]"));
        Assert.assertEquals(true, error.isDisplayed(), "Okkk");
    }


    @AfterMethod
    public void tearDown() {
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }
}
