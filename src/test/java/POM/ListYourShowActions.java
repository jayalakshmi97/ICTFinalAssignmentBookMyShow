package POM;

import Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListYourShowActions extends Driver {
    
    @FindBy(linkText = "ListYourShow")
    private WebElement ListYourShow;
    @FindBy(xpath = "//div[@class='grid-box']")
    private WebElement gridBox;
    @FindBy(xpath = "//div[@open-modal='Streaming']")
    private WebElement streaming;
    @FindBy(xpath="//div[@open-modal='Performances']")
    private WebElement performances;
    @FindBy(xpath = "//div[@open-modal='Experiences']")
    private WebElement experiences;
    @FindBy(xpath = "//div[@open-modal='Expositions']")
    private WebElement expositions;
    @FindBy(xpath="//div[@open-modal='Parties']")
    private WebElement parties;
    @FindBy(xpath="//div[@open-modal='Sports']")
    private WebElement sports;
    @FindBy(xpath = "//div[@open-modal='Conferences']")
    private WebElement conferences;
    @FindBy(xpath = "//div[@open-modal='Sales']")
    private WebElement sales;
    @FindBy(xpath = "//div[@open-modal='Pricing']")
    private WebElement pricing;
    @FindBy(xpath = "//div[@open-modal='Food']")
    private WebElement food;
    @FindBy(xpath = "//div[@open-modal='Onground']")
    private WebElement onGround;
    @FindBy(xpath = "//div[@open-modal='Reports']")
    private WebElement reports;
    @FindBy(xpath = "//div[@open-modal='Pos']")
    private WebElement pos;

    public ListYourShowActions(WebDriver driver){ PageFactory.initElements(driver, this);}

    public void clickListYourShow() {

        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        WebElement waitElement3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")));
        ListYourShow.click();
        WebDriverWait wait4 = new WebDriverWait(driver, 20);
        WebElement waitElement4 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='grid-box']")));
    }
    public boolean displayedHostElementsOrNot(){
        if(streaming.isDisplayed()&&performances.isDisplayed()&&experiences.isDisplayed()&&expositions.isDisplayed()
                &&parties.isDisplayed()&&sports.isDisplayed()&&conferences.isDisplayed()){
            return true;
        }
        else
            return false;
    }
    public boolean displayedServiceElementsOrNot(){
        if(sales.isDisplayed()&&pricing.isDisplayed()&&food.isDisplayed()&&onGround.isDisplayed()
                &&reports.isDisplayed()&&pos.isDisplayed()){
            return true;
        }
        else
            return false;
    }
    public void clickReport(){
        reports.click();
    }
    public boolean displayedReportElements(){

        if ((driver.getPageSource().contains("In depth reports"))&&(driver.getPageSource().contains("Access registration data"))&&(driver.getPageSource().contains("behavioural insights"))){
            return true;
        }
        else return false;
    }




}
