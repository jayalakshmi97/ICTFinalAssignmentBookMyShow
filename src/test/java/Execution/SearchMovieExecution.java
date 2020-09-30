package Execution;

import Commons.Driver;
import DataProvider.SearchMovieDP;
import POM.SearchMovie;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchMovieExecution extends Driver {

    @Test(dataProvider = "movieNameSearch",dataProviderClass= SearchMovieDP.class)

    public void movieSearch(String movie,String status){
        SearchMovie searchMovie=new SearchMovie(driver);
        searchMovie.validAndInvalidMovieSearch(movie);

        boolean movieDisplayed=searchMovie.isMovieDisplayed();
        if (status=="pass")
            Assert.assertEquals(true,movieDisplayed);
        else
            Assert.assertEquals(false,movieDisplayed);
        }
    }


