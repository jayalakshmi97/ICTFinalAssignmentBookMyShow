package DataProvider;

import org.testng.annotations.DataProvider;

public class CityNameDP {
    @DataProvider(name = "cityNameSearch")
    public static Object[][] setCityDP() {
        return new Object[][]{
                {"Goa"}
        };
    }
}
