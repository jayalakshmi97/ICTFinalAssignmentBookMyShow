package POM;

import Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterTextValidation  {
    @FindBy(xpath = "//h4[contains (text(), 'BOOKMYSHOW APP ')]")
    private WebElement BookmyshowApp;
    @FindBy(xpath = "//h4[contains (text(), 'BOOKMYSHOW NEWS')]")
    private WebElement BookmyshowNews;
    @FindBy(xpath = "//h4[contains (text(), 'EXCLUSIVES')]")
    private WebElement Exclusive;
    @FindBy(xpath = "//h4[contains (text(), 'HELP')]")
    private WebElement Help;

    public FooterTextValidation(WebDriver driver)
    { PageFactory.initElements(driver,this);}
    public boolean verifyFooter(){
        if(BookmyshowApp.isDisplayed()&&BookmyshowNews.isDisplayed()&&Exclusive.isDisplayed()&&Help.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }


}
