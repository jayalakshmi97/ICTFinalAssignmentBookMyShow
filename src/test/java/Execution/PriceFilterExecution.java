package Execution;

import Commons.Driver;
import POM.PriceFilter;
import POM.ValidateProduct;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriceFilterExecution extends Driver {
@Test
    public void validateFiterByPrice() throws InterruptedException {
    PriceFilter priceFilter=new PriceFilter(driver);
    ValidateProduct validateProduct=new ValidateProduct(driver);
    validateProduct.onClickFanhood();
    boolean verifyurl=validateProduct.verifyUrl();
    Assert.assertEquals(true,verifyurl);
    priceFilter.selectProduct();
    priceFilter.verifyCount();
    priceFilter.filterPrice();
    boolean reslut=priceFilter.verifyMsg();
    Assert.assertEquals(true,reslut);
    Thread.sleep(8000);
}
}
