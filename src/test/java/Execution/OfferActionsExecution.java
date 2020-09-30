package Execution;

import Commons.Driver;
import DataProvider.OfferSearchDP;
import POM.ListYourShowActions;
import POM.OfferActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OfferActionsExecution extends Driver {

    @Test(priority = 0)
    public void verifyRewardElements(){
        OfferActions offerActions=new OfferActions(driver);
        offerActions.clickOffer();
        offerActions.clickRewards();
        WebElement scrollelement3 = driver.findElement(By.xpath("//*[@data-id='offers-Reward-Points-Redemption']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement3);
        actions.perform();
        boolean result4=offerActions.isRewardOptionsDisplayed();
        Assert.assertEquals(true,result4);
    }
    @Test(priority = 1,dataProvider = "ICICIofferNameSearch",dataProviderClass = OfferSearchDP.class)
    public void verifyICICIOfferSearch(String nameOfBank, String status){
        OfferActions offerActions=new OfferActions(driver);
        offerActions.clickOffer();
        offerActions.iciciOfferSearch(nameOfBank);
        WebElement scrollelement = driver.findElement(By.xpath("//div[@class='__description']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement);
        actions.perform();
        boolean result5=offerActions.isBankDetailsDisplayed();
        if (status=="pass")
            Assert.assertEquals(true,result5);
        else
            Assert.assertEquals(false,result5);
    }

    @Test(priority = 2,dataProvider = "KotakofferNameSearch",dataProviderClass = OfferSearchDP.class)
    public void verifyKotakOfferSearch(String nameOfBank, String status){
        OfferActions offerActions=new OfferActions(driver);
        offerActions.clickOffer();
        offerActions.kotakOfferSearch(nameOfBank);
        boolean result6=offerActions.isDetailsDisplayed();
        if (status=="pass")
            Assert.assertEquals(true,result6);
        else
            Assert.assertEquals(false,result6);
    }
}
