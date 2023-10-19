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
    public void clicksOnTheElementInLeftNav(DataTable linkler) {
        List<String> clicks = linkler.asList(String.class);

        for (int i = 0; i < clicks.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(clicks.get(i));
            dc.clickMethod(linkWebElement);}}

    @When("User fills the necessary data")
    public void userFillsTheNecessaryData(DataTable sendkeys) {
        List< List<String> >   items=  sendkeys.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e=dc.getWebElement(items.get(i).get(0));
            String gidecekYazi = items.get(i).get(1);
            dc.sendKeysMethod(e, gidecekYazi);}}

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
        List< List<String> > editlenecekler =  edits.asLists(String.class);

        for (int i = 0; i < editlenecekler.size(); i++) {
            dc.editItem(editlenecekler.get(i).get(0),
                    editlenecekler.get(i).get(1),
                    editlenecekler.get(i).get(2),
                    editlenecekler.get(i).get(3));}}

    @And("User delete the element")
    public void userDeleteTheElement(DataTable deletes) {
        List< List<String> > silinecekler =  deletes.asLists(String.class);

        for (int i = 0; i < silinecekler.size(); i++) {
            dc.deleteItem(silinecekler.get(i).get(0),silinecekler.get(i).get(1));}}

    @And("User search the element")
    public void userSearchTheElement(DataTable search) {
        List< List<String> > aranacaklar =  search.asLists(String.class);

        for (int i = 0; i < aranacaklar.size(); i++) {
            dc.searchFunction(aranacaklar.get(i).get(0),aranacaklar.get(i).get(1));}
    }
}
