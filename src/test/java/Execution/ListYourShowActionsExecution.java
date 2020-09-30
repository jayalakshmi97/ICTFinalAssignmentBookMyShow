package Execution;

import Commons.Driver;
import POM.ListYourShowActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListYourShowActionsExecution extends Driver {
    @Test
    public void VerifyhostElements(){
        ListYourShowActions listYourShowActions=new ListYourShowActions(driver);
        listYourShowActions.clickListYourShow();
        WebElement scrollelement = driver.findElement(By.xpath("//div[@open-modal='Parties']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement);
        actions.perform();
        boolean result1=listYourShowActions.displayedHostElementsOrNot();
        Assert.assertEquals(true,result1);
    }
    @Test
    public void VerifyServiceElements(){
        ListYourShowActions listYourShowActions=new ListYourShowActions(driver);
        listYourShowActions.clickListYourShow();
        WebElement scrollelement2 = driver.findElement(By.xpath("//div[@open-modal='Reports']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement2);
        actions.perform();
        boolean result2=listYourShowActions.displayedHostElementsOrNot();
        Assert.assertEquals(true,result2);
    }
    @Test
    public void VerifyReportElements(){
        ListYourShowActions listYourShowActions=new ListYourShowActions(driver);
        listYourShowActions.clickListYourShow();
        WebElement scrollelement2 = driver.findElement(By.xpath("//div[@open-modal='Reports']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement2);
        actions.perform();
        listYourShowActions.clickReport();
        boolean result3=listYourShowActions.displayedReportElements();
        Assert.assertEquals(true,result3);
    }

}
