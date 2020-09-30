package DataProvider;

import org.testng.annotations.DataProvider;

public class OfferSearchDP {
    @DataProvider(name="ICICIofferNameSearch")
    public static Object[][] ICICIofferNamesDP(){
        return new Object[][]{
                {"ICICI Bank 25% Discount Offer","pass"}
        };
    }

    @DataProvider(name="KotakofferNameSearch")
    public static Object[][] kotakofferNamesDP(){
        return new Object[][]{
                {"Kotak Mahindra Offers","pass"}
        };
    }
}
