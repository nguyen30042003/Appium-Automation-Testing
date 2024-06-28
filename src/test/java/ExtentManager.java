import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extentReports;
    public static ExtentReports createInstance(){
        ExtentSparkReporter reporter = new ExtentSparkReporter("ExtentReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        return extentReports;
    }
}
