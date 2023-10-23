package Pages;

import Utilities.WD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class DialogContent_Ihs extends Parent {

    public DialogContent_Ihs() {
        PageFactory.initElements(WD.getDriver(), this);
    }


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement name;

    @FindBy(xpath ="//mat-select[@formcontrolname='attachmentStages']")
    public WebElement stage;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    public WebElement stageEx;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    public WebElement stageExSearch;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    public WebElement stageEm;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    public WebElement stageSearch;


    @FindBy(xpath = "//textarea")
    public WebElement description;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "description":
                return this.description;
            case "name":
                return this.name;
        }
        return null;
    }
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement nameSearch;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//tbody[@role='rowgroup']//td)[2]")
    public WebElement nameLocAfterSearch;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteSecondButton;

    @FindBy (xpath = "(//span[@class='mat-option-text'])[5]")
    public WebElement certificateStage;


    public void deleteItem(String text) {
        sendKeysMethod(nameSearch, text);
        clickMethod(stageSearch);
        clickMethod(certificateStage);
        new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));

        clickMethod(deleteButton);
        clickMethod(deleteSecondButton);
    }

    public void editItem(String oldName,String newName, String newDescription){
        sendKeysMethod(nameSearch, oldName);
        clickMethod(stageSearch);
        clickMethod(stageExSearch);
        new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

        clickMethod(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickMethod(editButton);

        name.clear();
        name.sendKeys(newName);
        description.clear();
        description.sendKeys(newDescription);
    }

    public void searchFunction(String text) {
        sendKeysMethod(nameSearch, text);
        clickMethod(stageSearch);
        clickMethod(certificateStage);
        clickMethod(searchButton);

        new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        Assert.assertEquals(text, nameLocAfterSearch.getText());

    }
}
