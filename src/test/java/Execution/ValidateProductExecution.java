package Execution;

import Commons.Driver;
import POM.ValidateProduct;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateProductExecution extends Driver {
@Test
    public void sortingProduct() throws InterruptedException {
    ValidateProduct validateProduct=new ValidateProduct(driver);
    validateProduct.onClickFanhood();
    boolean verifyurl=validateProduct.verifyUrl();
    Assert.assertEquals(true,verifyurl);
    validateProduct.selectProduct();
    boolean reslut= validateProduct.sortProduct();
    Assert.assertEquals(true,reslut);
    Thread.sleep(8000);
}
}
