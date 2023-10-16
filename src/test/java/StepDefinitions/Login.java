package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.WD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @Given("Navigate to Mersys")
    public void navigateToMersys() {WD.getDriver().get("https://test.mersys.io/");}

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.clickMethod   (dc.inputUserName);
        dc.sendKeysMethod(dc.inputUserName,"turkeyts");
        dc.clickMethod   (dc.inputPassword);
        dc.sendKeysMethod(dc.inputPassword,"TechnoStudy123");
        dc.clickMethod   (dc.buttonLogin);}

    @Then("Reach the Dashboard")
    public void reachTheDashboard() {

//        dc.verifyTextMethod(dc.verifyText,"Student");
        dc.verifyTextMethod(ln.dashboard,"Dashboard");
//        Assert.assertTrue(dc.verifyText.getText().contains("Student"),"Giriş yapılamadı.");

    }
}
