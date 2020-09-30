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

import java.util.concurrent.TimeUnit;

public class CitySelection extends Driver {
    @FindBy(xpath = "//input[@placeholder='Search for your city']")
    private WebElement citySearchBox;
    @FindBy (xpath ="//span[@id='spnSelectedRegion']")
    private WebElement cityDropper;

public CitySelection(WebDriver driver){
    PageFactory.initElements(driver,this);
}

public void onClickCitySearch(){
    WebDriverWait wait5 = new WebDriverWait(driver, 20);
    WebElement waitElement3 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")));
    cityDropper.click();
}
    public void enterCityName(String name){
    citySearchBox.sendKeys(name);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

}
