package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
















}
