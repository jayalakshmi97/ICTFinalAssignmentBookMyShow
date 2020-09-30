package DataProvider;

import org.testng.annotations.DataProvider;

public class SearchMovieDP {
    @DataProvider (name="movieNameSearch")
public static Object[][] movieNamesDP(){
        return new Object[][]{
                {"Fantasy Island","pass"},
                {"qq","fail"}
        };
    }
}
