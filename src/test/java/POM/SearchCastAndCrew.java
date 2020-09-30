package POM;

import Commons.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchCastAndCrew extends Driver {
    @FindBy(xpath = "//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")
    private WebElement search;
    @FindBy(xpath = "//h1[@title='Onward']")
    private WebElement onward;
    @FindBy(id="cast-carousel")
    private WebElement cast;
    @FindBy(id="crew-carousel")
    private WebElement crew;
    @FindBy(xpath="//div[@content='Tom Holland']")
    private WebElement firstActorSearch;
    @FindBy(xpath = "\"//div[@content='Mychael Danna']\"")
    private WebElement firstCrewSearch;

    public SearchCastAndCrew(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String onwardMovieSearch(String movie){
        search.sendKeys(movie);
        search.sendKeys(Keys.ENTER);
        String onwardText=onward.getText();
        if (onwardText=="Onward"){
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cast);
        }
        return movie;
    }



}
