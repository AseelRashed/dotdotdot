package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public abstract class TestBaseReport {



    protected WebDriver driver;
    protected Actions actions;

    protected static ExtentReports extentReports;

    protected static ExtentSparkReporter extentSparkReporter;

    protected static ExtentTest extentTest;

    @BeforeClass
    public static void setupClass(){
        extentReports = new ExtentReports();

        String currentDate = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/test-output/reports/testReport_"+currentDate+".html";

        extentSparkReporter = new ExtentSparkReporter(filePath);

        extentReports.attachReporter(extentSparkReporter);

    }

    @Before
    public void setup(){
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions = new Actions(driver);

        extentTest = extentReports.createTest(getClass().getSimpleName() + " - " + Thread.currentThread().getStackTrace()[2].getMethodName());


    }
    @After
    public void tearDown(){
        driver.quit();
        extentReports.flush();
    }

    @AfterClass
    public static void tearDown2(){
        //extentReports.flush();
    }
}