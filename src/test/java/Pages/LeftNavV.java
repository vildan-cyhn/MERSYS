package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavV extends Parent {

   public LeftNavV(){PageFactory.initElements(WD.getDriver(),this);}


   //humanResources baslığı altındakiler*********************************************************
   @FindBy(xpath = "//span[text()='Human Resources']")
   public WebElement humanResources;

   @FindBy(xpath = "(//span[text()='Setup'])[3]")
   public WebElement hrSetup;

           @FindBy(xpath = "//span[text()='Positions']")
           public WebElement positions;


    public WebElement getWebElementV(String strElement){
        switch (strElement){
            case "humanResources"      : return this.humanResources;
            case "hrSetup"       : return this.hrSetup;
            case "positions"        : return this.positions;


        }return null;}



}
