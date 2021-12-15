package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobBtn;

    @CacheLookup
    @FindBy (xpath = "//button[@class='mat-focus-indicator solo-button mat-button mat-button-base mat-raised-button']//span//div")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy (xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement iframeCookies;


    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    public void acceptCookies(){
        pmSwitchToIframe(iframeCookies);
        pmClickOnElement(acceptCookies);
    }

    public void enterJobTitle(String jobTitle1){
        pmSendTextToElement(jobTitle,jobTitle1);
        log.info("Entering Job title : "+jobTitle1);
    }

    public void enterLocation(String location1){
        pmSendTextToElement(location,location1);
        log.info("Entering location : "+location1);
    }

    public void selectDistance(String distance){
        pmSelectByVisibleTextFromDropDown(distanceDropDown,distance);
        log.info("Entering distance : "+distance);
    }

    public void clickOnMoreSearchOptionLink(){
        pmClickOnElement(moreSearchOptionsLink);
        log.info("Clicking on more search option : "+moreSearchOptionsLink.getText());
    }

    public void enterMinSalary(String minSalary){
        pmSendTextToElement(salaryMin,minSalary);
        log.info("Entering minimum salary : "+minSalary);
    }

    public void enterMaxSalary(String maxSalary){
        pmSendTextToElement(salaryMax,maxSalary);
        log.info("Entering maximum salary : "+maxSalary);
    }

    public void selectSalaryType(String sType){
        pmSelectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        log.info("Selecting salary type : "+sType);
    }

    public void selectJobType(String jType){
        pmSelectByVisibleTextFromDropDown(jobTypeDropDown,jType);
        log.info("Selecting job type : "+jType);
    }

    public void clickOnFindJobButton(){
        pmClickOnElement(findJobBtn);
        log.info("Clicking on find job button : "+ findJobBtn.getText());
    }
}
