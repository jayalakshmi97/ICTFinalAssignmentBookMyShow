package Commons;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Driver {
    public static WebDriver driver;
    public String url = "https://in.bookmyshow.com";

    @BeforeMethod
    public void OpenBrowser() {
        String browserName = "chrome";
        switch (browserName.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
                //disabled popup
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("useAutomationExtension", false);
                driver = new ChromeDriver(options);//launch browser
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();//maximize window
        driver.navigate().to(url);//navigate to url
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        WebElement waitElement1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='inp_RegionSearch_top']")));
        waitElement1.sendKeys("kochi");
        waitElement1.sendKeys(Keys.ENTER);
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        WebElement waitElement2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("wzrk-cancel")));
        waitElement2.click();
    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


    public static String takeScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String file = "ss" + random.nextInt(1000) + ".png";
        String fileName = System.getProperty("user.dir") + "\\report\\" + file;
        File destinationFile = new File(fileName);
        FileUtils.copyFile(screenshot, destinationFile);
        return file;

    }
}
