package Execution;

import Commons.Driver;
import DataProvider.CityNameDP;
import DataProvider.SearchMovieDP;
import POM.CitySelection;
import com.mongodb.DBRef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CitySelectionExecution extends Driver {
    @Test(dataProvider = "cityNameSearch",dataProviderClass= CityNameDP.class)
    public void setCityName (String nameOfCity){
        CitySelection citySelection=new CitySelection(driver);
        citySelection.onClickCitySearch();
        citySelection.enterCityName(nameOfCity);
    }
}
