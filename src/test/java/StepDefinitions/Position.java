package StepDefinitions;

import Pages.DialogContent;
import Pages.DialogContentV;
import Pages.LeftNav;
import Pages.LeftNavV;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Position {
    DialogContent dc=new DialogContent();
    LeftNavV lnv=new LeftNavV();

    DialogContentV dcv=new DialogContentV();

    @Given("Clicks on the element in LeftNavV")
    public void clicksOnTheElementInLeftNavV(DataTable linkler) {
        List<String> clicks = linkler.asList(String.class);

        for (int i = 0; i < clicks.size(); i++) {
            WebElement linkWebElement = lnv.getWebElementV(clicks.get(i));
            dc.clickMethod(linkWebElement);}
    }


    @And("User edit two elements in DCV")
    public void userEditTwoElementsInDCV(DataTable edits) {
        List<List<String>> editDesc = edits.asLists(String.class);

        for (int i = 0; i < editDesc.size(); i++) {
            dcv.editItem(editDesc.get(i).get(0),
                    editDesc.get(i).get(1),
                    editDesc.get(i).get(2),
                    editDesc.get(i).get(3));
        }

    }


    @And("User should see  the element")
    public void userShouldSeeTheElement(DataTable search) {
        List< List<String> > aranacaklar =  search.asLists(String.class);

        for (int i = 0; i < aranacaklar.size(); i++) {
            dcv.searchFunction(aranacaklar.get(i).get(0),aranacaklar.get(i).get(1));}
    }
    @And("user should see the active button")
    public void userShouldSeeTheActiveButton() {

        Assert.assertTrue(dcv.activeButton.isDisplayed(),"Active button does not display");
    }

    @And("User delete the elements")
    public void userDeleteTheElements(DataTable deletes) {
        List< List<String> > toBeDelete =  deletes.asLists(String.class);

        for (int i = 0; i < toBeDelete.size(); i++) {
            dcv.deleteItem(toBeDelete.get(i).get(0),toBeDelete.get(i).get(1));}}


}




