package Execution;

import Commons.Driver;
import POM.LanguageSelection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageSelectionExecution extends Driver {
    @Test
    public void languageVerification(){
        LanguageSelection languageSelection=new LanguageSelection(driver);
        languageSelection.clickLang();
        languageSelection.verifyLangCount();
        boolean result8 =languageSelection.verifyLanguages();
        Assert.assertEquals(true,result8);
    }
}
