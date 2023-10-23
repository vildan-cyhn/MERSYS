package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Ihs extends Parent {

    public LeftNav_Ihs() {PageFactory.initElements(WD.getDriver(), this); }


    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement setupParameters;

    @FindBy(xpath = "//span[text()='Document Types']")
    public WebElement documentTypes;


    public WebElement getWebElementI(String strElement){
        switch (strElement){
            case "setup"          : return this.setup;
            case "setupParameters": return this.setupParameters;
            case "documentTypes"  : return this.documentTypes;

        }return null;}

}
