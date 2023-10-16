package Pages;

import Utilities.WD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

  public WebDriverWait wait=new WebDriverWait(WD.getDriver(), Duration.ofSeconds(20));


  public void clickMethod(WebElement element){

      wait.until(ExpectedConditions.elementToBeClickable(element));
      scrollToElement(element);
      element.click();

  }

  public void sendKeysMethod(WebElement element,String text){

      wait.until(ExpectedConditions.visibilityOf(element));

      scrollToElement(element);
      element.clear();
      element.sendKeys(text);

  }

  public void scrollToElement(WebElement element){

      JavascriptExecutor js=(JavascriptExecutor)WD.getDriver();

      js.executeScript("arguments[0].scrollIntoView();",element);


  }
  public void verifyTextMethod(WebElement element,String text){

      wait.until(ExpectedConditions.textToBePresentInElement(element,text));

      Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()),"Failed result.");

      new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();


  }


}
