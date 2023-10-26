package Pages;

import Utilities.WD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContent extends Parent{
    public DialogContent(){PageFactory.initElements(WD.getDriver(),this);}

    @FindBy(xpath = "//*[@placeholder='Kullanıcı Adı']")
    public WebElement inputUserName;

    @FindBy(xpath = "//*[@placeholder='Parola']")
    public WebElement inputPassword;

    @FindBy(xpath = "//span[text()=' GİRİŞ YAP ']")
    public WebElement buttonLogin;

    @FindBy(xpath ="//div[text()='Invalid username or password']")
    public WebElement invalidText;

    @FindBy(xpath ="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath ="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='name']//input")
    public WebElement name;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement code;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortName;

    @FindBy(xpath="//div[contains(text(),'successfully')]")  //    (//ms-toaster-message//div)[2]
    public WebElement successMessage;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement nameSearch;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Code']")
    public WebElement codeSearch;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//tbody[@role='rowgroup']//td)[2]")
    public WebElement nameLocAfterSearch;

    @FindBy(xpath="(//tbody[@role='rowgroup']//td)[3]")
    public WebElement codeLocAfterSearch;

    @FindBy(xpath ="(//ms-edit-button//button)[1]")
    public WebElement editButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteSecondButton;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "name"                 : return this.name;
            case "code"                 : return this.code;
            case "shortName"            : return this.shortName;
            case "addButton"            : return this.addButton;
            case "saveButton"           : return this.saveButton;
            case "successMessage"       : return this.successMessage;
            case "deleteButton"         : return this.deleteButton;
            case "nameSearch"           : return this.nameSearch;
            case "codeSearch"           : return this.codeSearch;
            case "searchButton"         : return this.searchButton;
            case "deleteSecondButton"   : return this.deleteSecondButton;
            case "editButton"           : return this.editButton;

        }return null;}

    public void deleteItem(String text,String mtn){
        sendKeysMethod(nameSearch, text);
        sendKeysMethod(codeSearch, mtn);
        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickMethod(deleteButton);
        clickMethod(deleteSecondButton);
    }


    public void deleteItemR(String text){

        sendKeysMethod(nameSearch, text);
        // sendKeysMethod(codeSearch, mtn);
        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickMethod(deleteButton);
        clickMethod(deleteSecondButton);


    }

    public void editItemR(String oldName,String newName){
        sendKeysMethod(nameSearch, oldName);
        // sendKeysMethod(codeSearch, oldCode);
        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickMethod(editButton);

        name.clear();
        name.sendKeys(newName);}

    // ama bu hep ortak degıl, mesela us 4 te type de var name ve code dan baska edıtlenecek, o kodu yazıp, olmazsa kırılma devam et yaparsak ortak olur
    // us 5 te name, code yok- name,shortname var, loc u ortak yapabılır msıın bak
    public void editItem(String oldName,String oldCode,String newName, String newCode){
        sendKeysMethod(nameSearch, oldName);
        sendKeysMethod(codeSearch, oldCode);
        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickMethod(editButton);

        name.clear();
        name.sendKeys(newName);
        code.clear();
        code.sendKeys(newCode);
    }

    public void searchFunction(String text,String mtn){  // name- code
        sendKeysMethod(nameSearch, text);
        sendKeysMethod(codeSearch, mtn);
        clickMethod(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));
        Assert.assertEquals(text, nameLocAfterSearch.getText());
        Assert.assertEquals(mtn, codeLocAfterSearch.getText());
    }















}
