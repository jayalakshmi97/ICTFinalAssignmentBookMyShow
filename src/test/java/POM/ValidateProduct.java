package POM;

import Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateProduct extends Driver {
    public WebDriverWait wait;

    @FindBy(linkText = "Fanhood")
    WebElement fanhoodElement;
    @FindBy (xpath = "//li[@class='nav-bar__item nav-bar__item--static']")
    WebElement products;
    @FindBy(xpath = "//select[@id='ajaxSort']")
    WebElement sortbar;
    @FindBy(xpath="//*[@id=\"dropdown-desktop-menu-0-2-mega-menu-0\"]/div/div/div[8]/ul/li[2]/a")
    WebElement lunchbag;

    public ValidateProduct(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void onClickFanhood(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")));
        fanhoodElement.click();
    }
    public boolean verifyUrl(){
        String url1=driver.getCurrentUrl();
        if (url1.contains("fanhood")){
            return true;
        }
        else return false;
    }
    public void selectProduct(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='nav-bar__item nav-bar__item--static']")));
        products.click();

        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dropdown-desktop-menu-0-2-mega-menu-0\"]/div/div/div[8]/ul/li[2]/a")));
        lunchbag.click();
        }

    public boolean sortProduct(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ajaxSort']")));
        Select sortingProduct=new Select(driver.findElement(By.xpath("//select[@id='ajaxSort']")));
        sortingProduct.selectByVisibleText("Alphabetically: Z-A");
        if (sortingProduct.getFirstSelectedOption().getText().equals("Alphabetically: Z-A")){
           return true;
        }
        else return false;
    }
}