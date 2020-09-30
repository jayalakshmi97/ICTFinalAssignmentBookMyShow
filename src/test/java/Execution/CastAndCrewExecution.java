package Execution;

import Commons.Driver;
import POM.SearchCastAndCrew;
import org.testng.annotations.Test;

public class CastAndCrewExecution extends Driver {
    @Test
    public void validSearch() {
        SearchCastAndCrew searchCastAndCrew=new SearchCastAndCrew(driver);
        searchCastAndCrew.onwardMovieSearch("Onward");
    }

}
