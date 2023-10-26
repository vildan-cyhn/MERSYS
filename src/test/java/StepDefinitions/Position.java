package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.testng.Assert;

import java.util.List;

public class Position {
    DialogContent dc=new DialogContent();



    @And("User edit two elements in DCV")
    public void userEditTwoElementsInDCV(DataTable edits) {
        List<List<String>> editDesc = edits.asLists(String.class);

        for (int i = 0; i < editDesc.size(); i++) {
            dc.editItemV(editDesc.get(i).get(0),
                    editDesc.get(i).get(1),
                    editDesc.get(i).get(2),
                    editDesc.get(i).get(3));
        }

    }


    @And("User should see  the element")
    public void userShouldSeeTheElement(DataTable search) {
        List< List<String> > searchItems =  search.asLists(String.class);

        for (int i = 0; i < searchItems.size(); i++) {
            dc.searchFunctionV(searchItems.get(i).get(0),searchItems.get(i).get(1));}
    }
    @And("user should see the active button")
    public void userShouldSeeTheActiveButton() {

        Assert.assertTrue(dc.activeButton.isDisplayed(),"Active button does not display");
    }

    @And("User delete the elements in Position menu")
    public void userDeleteTheElementsInPositionMenu(DataTable deletes) {
        List< List<String> > toBeDelete =  deletes.asLists(String.class);

        for (int i = 0; i < toBeDelete.size(); i++) {
            dc.deleteItemV(toBeDelete.get(i).get(0),toBeDelete.get(i).get(1));}}


}




