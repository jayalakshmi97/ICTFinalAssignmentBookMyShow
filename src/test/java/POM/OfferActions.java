package POM;

import Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfferActions extends Driver {
    @FindBy(linkText = "Offers")
    private WebElement offers;
    @FindBy(xpath = "//li[@data-id='rewards']")
    private WebElement rewards;
    @FindBy(xpath = "//*[@data-id='offers-Reward-Points-Redemption']")
    private WebElement rewardPoints;
    @FindBy(xpath = "//*[@data-id='offers-PAYBACK-POINTS']")
    private WebElement paybackPoints;
    @FindBy(xpath = "//*[@data-id='offers-SimplyCLICK-SBI-Card-Rewards-Offer']")
    private WebElement SBIRewards;
    @FindBy(xpath = "//input[@placeholder='Search for Offers by Name or Bank']")
    private WebElement bankSearchBox;
    @FindBy(xpath="//*[@data-search-filter='offers-ICICI-Bank-25%-Discount-Offer']")
    private WebElement icicBankDetails;
    @FindBy(xpath = "//div[@class='tt-no-results']")
    private WebElement kotakDetails;

    public OfferActions(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOffer() {
        WebDriverWait wait4 = new WebDriverWait(driver, 20);
        WebElement waitElement4 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")));
        offers.click();
    }

        public void clickRewards () {
            rewards.click();
            WebDriverWait wait5 = new WebDriverWait(driver, 20);
            WebElement waitElement5 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-id='offers-Reward-Points-Redemption']")));

        }
        public boolean isRewardOptionsDisplayed () {
            if ((rewardPoints.isDisplayed()) && (paybackPoints.isDisplayed()) && (SBIRewards.isDisplayed())) {
                return true;
            } else
                return false;
        }
        public void iciciOfferSearch(String BankName){
            WebDriverWait wait6 = new WebDriverWait(driver, 20);
            WebElement waitElement6 = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Offers by Name or Bank']")));
            waitElement6.sendKeys(BankName);
            waitElement6.sendKeys(Keys.ENTER);
        }
    public boolean isBankDetailsDisplayed() {
        try {
            return icicBankDetails.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void kotakOfferSearch(String Name){
        WebDriverWait wait6 = new WebDriverWait(driver, 20);
        WebElement waitElement6 = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Offers by Name or Bank']")));
        waitElement6.sendKeys(Name);
    }
    public boolean isDetailsDisplayed() {
        try {
            return kotakDetails.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }








        }

