package Pages;

import Utilities.WD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContentV extends Parent{
    public DialogContentV(){PageFactory.initElements(WD.getDriver(),this);}

    @FindBy(xpath ="//ms-text-field[@formcontrolname='name']//input")
    public WebElement name;
    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortName;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement nameSearch;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Short Name']")
    public WebElement shortNameSearch;



    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//tbody[@role='rowgroup']//td)[2]")
    public WebElement nameLocAfterSearch;


    @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[12]")
    public WebElement editButtonV;


    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteSecondButton;

    @FindBy(xpath ="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//mat-slide-toggle//button[@role='switch']")
    public WebElement activeButton;



    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "name"                 : return this.name;
            case "shortName"            : return this.shortName;
            case "successMessage"       : return this.successMessage;
            case "deleteButton"         : return this.deleteButton;
            case "nameSearch"           : return this.nameSearch;
            case "shortNameSearch"      :return this.shortNameSearch;
            case "searchButton"         : return this.searchButton;
            case "deleteSecondButton"   : return this.deleteSecondButton;
            case "saveButton"           : return this.saveButton;

        }return null;}

    public void deleteItem(String name,String shortName){
        sendKeysMethod(nameSearch, name);
        sendKeysMethod(shortNameSearch, shortName);
        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickMethod(deleteButton);
        clickMethod(deleteSecondButton);
    }


    public void editItem(String oldName,String oldShortName,String newName, String newShortName){
        sendKeysMethod(nameSearch, oldName);
        sendKeysMethod(shortNameSearch, oldShortName);
        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickMethod(editButtonV);

        name.clear();
        name.sendKeys(newName);
        shortName.clear();
        shortName.sendKeys(newShortName);
    }

    public void searchFunction(String name,String shortName){
        sendKeysMethod(nameSearch, name);
        sendKeysMethod(shortNameSearch, shortName);
        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));
        Assert.assertEquals(name, nameLocAfterSearch.getText());
    }















}
