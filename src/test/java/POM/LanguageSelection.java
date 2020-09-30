package POM;

import Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LanguageSelection extends Driver {
    @FindBy(xpath="//div[@id='dLangWrapMob']")
    private WebElement langDropper;
    @FindBy(xpath = "//ul[@class='options']")
    private WebElement otherLangs;

    public LanguageSelection(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void clickLang(){
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        WebElement waitElement3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")));
        langDropper.click();
    }
    public void verifyLangCount(){
        List products = driver.findElements(By.xpath("//ul[@class='selected']"));
        System.out.println("Count of Languages in the page is:"+products.size() );

    }
    public boolean verifyLanguages(){
        if (otherLangs.isDisplayed()){
            return true;
        }
        else return false;
    }
}
