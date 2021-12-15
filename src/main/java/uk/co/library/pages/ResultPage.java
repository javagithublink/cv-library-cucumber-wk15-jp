package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//header[@class='search-header search-card']//div//h1[1]")
    WebElement resultText;

    public ResultPage() {
        PageFactory.initElements(driver,this);
    }

    public void verifyTheResults(String expected){

        pmVerifyElements("wrong page",expected,resultText);
        log.info("Verifying search result header message : "+resultText.getText());

    }

}
