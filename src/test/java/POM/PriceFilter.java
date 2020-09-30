package POM;

import Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PriceFilter extends Driver {

    public WebDriverWait wait;

//    @FindBy(linkText = "Fanhood")
//    WebElement fanhoodElement;
    @FindBy (xpath = "//li[@class='nav-bar__item nav-bar__item--static']")
    WebElement products;
    @FindBy(xpath = "//*[@id=\"dropdown-desktop-menu-0-2-mega-menu-0\"]/div/div/div[3]/ul/li[6]/a")
    WebElement planner;
    @FindBy (xpath = "//*[@id=\"sidebar-filter\"]/div[2]/li/ul/li[1]/span[2]")
    WebElement checkbox;
    @FindBy(xpath = "//*[@id=\"shopify-section-mm-collection-template\"]/section/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/span")
    WebElement verifiedmsg;
    @FindBy (xpath="//div[@class='product-list product-list--collection product-list--with-sidebar']")
    WebElement productList;


    public PriceFilter(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void selectProduct(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='nav-bar__item nav-bar__item--static']")));
        products.click();

        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dropdown-desktop-menu-0-2-mega-menu-0\"]/div/div/div[3]/ul/li[6]/a")));
        planner.click();
    }

    public void verifyCount(){
        productList.click();
        List products = driver.findElements(By.xpath("//div[@class='product-item product-item--vertical  1/3--tablet-and-up 1/4--desk']"));
        System.out.println("Count of Products in the page is:"+products.size() );
    }

    public void filterPrice(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sidebar-filter\"]/div[2]/li/ul/li[1]/span[2]")));
        checkbox.click();
    }
    public boolean verifyMsg(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"shopify-section-mm-collection-template\"]/section/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/span")));
        if (verifiedmsg.getText().contains("Showing 2 out of 5 products.")){
           return true;
       }
       else return false;
    }

}
