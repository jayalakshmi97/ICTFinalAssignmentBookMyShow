package Execution;

import Commons.Driver;
import POM.FooterTextValidation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FooterTextValidationExecution extends Driver {
    @Test
    public void Validation(){
        FooterTextValidation footerValidation=new FooterTextValidation(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//h4[contains (text(), 'BOOKMYSHOW APP ')]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        footerValidation.verifyFooter();
//      Assert.assertEquals(true,status);
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
