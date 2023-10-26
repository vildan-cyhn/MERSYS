package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Us_006_SubjectCategories {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @Given("Clicks on the element in LeftNav")
    public void clicksOnTheElementInLeftNav(DataTable links) {
        List<String> clicks = links.asList(String.class);

        for (int i = 0; i < clicks.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(clicks.get(i));
            dc.clickMethod(linkWebElement);}}

    @When("User fills the necessary data")
    public void userFillsTheNecessaryData(DataTable sendkeys) {
        List< List<String> >   items=  sendkeys.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e=dc.getWebElement(items.get(i).get(0));
            String sendingText = items.get(i).get(1);
            dc.sendKeysMethod(e, sendingText);}}

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.clickMethod(linkWebElement);}}

    @Then("User gets success message")
    public void userGetsSuccessMessage() {
        dc.verifyTextMethod(dc.successMessage,"successfully");}
    @And("User edit two elements")
    public void userEditTwoElements(DataTable edits) {
        List< List<String> > toBeEdited =  edits.asLists(String.class);

        for (int i = 0; i < toBeEdited.size(); i++) {
            dc.editItem(toBeEdited.get(i).get(0),
                    toBeEdited.get(i).get(1),
                    toBeEdited.get(i).get(2),
                    toBeEdited.get(i).get(3));}}

    @And("User delete the element")
    public void userDeleteTheElement(DataTable deletes) {
        List< List<String> > toBeDeleted =  deletes.asLists(String.class);

        for (int i = 0; i < toBeDeleted.size(); i++) {
            dc.deleteItem(toBeDeleted.get(i).get(0),toBeDeleted.get(i).get(1));}}

    @And("User search the element")
    public void userSearchTheElement(DataTable search) {
        List< List<String> > toBeSearched =  search.asLists(String.class);

        for (int i = 0; i < toBeSearched.size(); i++) {
            dc.searchFunction(toBeSearched.get(i).get(0),toBeSearched.get(i).get(1));}
    }
}
