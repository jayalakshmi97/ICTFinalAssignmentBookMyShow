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

public class SearchMovie extends Driver {

//    @FindBy(xpath = "//input[@class='search-box typeahead tt-input']")
//    private WebElement movieSearchBox;
    @FindBy(id = "eventTitle")
    private WebElement viewMovieDetails;

    public SearchMovie(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void validAndInvalidMovieSearch(String movieName) {
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        WebElement waitElement3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")));
        waitElement3.sendKeys(movieName);
        waitElement3.sendKeys(Keys.ENTER);
    }

    public boolean isMovieDisplayed() {
        try {
            return viewMovieDetails.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}


