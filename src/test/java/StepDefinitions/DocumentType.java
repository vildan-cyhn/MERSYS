package StepDefinitions;

import Pages.DialogContent_Ihs;
import Pages.LeftNav_Ihs;
import Utilities.WD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DocumentType {
    LeftNav_Ihs lni=new LeftNav_Ihs();
    DialogContent_Ihs dci=new DialogContent_Ihs();

    @Given("Clicks on the element in LeftNav_Ihs")
    public void clicksOnTheElementInLeftNav_Ihs(DataTable linkler) {
        List<String> clicks = linkler.asList(String.class);

        for (int i = 0; i < clicks.size(); i++) {
            WebElement linkWebElement = lni.getWebElementI(clicks.get(i));
            dci.clickMethod(linkWebElement);}}



    @When("User fills the necessary datas")
    public void userFillsTheNecessaryDatas(DataTable sendkeys)
    {
        List< List<String> >   items=  sendkeys.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e=dci.getWebElement(items.get(i).get(0));
            String gidecekYazi = items.get(i).get(1);
            dci.sendKeysMethod(e, gidecekYazi);}
    }



    @And("select a stage type from down drop menu")
    public void selectAStageTypeFromDownDropMenu(){

        dci.clickMethod(dci.stage);
        dci.clickMethod(dci.stageEx);
        new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();


    }



    @And("user edits two elements")
    public void userEditsTwoElements(DataTable edits)

    {
        List< List<String> > toBeEdited =  edits.asLists(String.class);

        for (int i = 0; i < toBeEdited.size(); i++) {
            dci.editItem(toBeEdited.get(i).get(0),
                    toBeEdited.get(i).get(1),
                    toBeEdited.get(i).get(2));}

    }

    @And("click on a different stage type")
    public void clickOnADifferentStageType() {


        dci.clickMethod(dci.stage);
        dci.clickMethod(dci.stageEm);
        new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();





    }

    @And("User search the elements")
    public void userSearchTheElements(DataTable search) {
        List< List<String> > toBeSearch =  search.asLists(String.class);

        for (int i = 0; i < toBeSearch.size(); i++) {
            dci.searchFunction(toBeSearch.get(i).get(0));}
    }

    @And("User delete the elements")
    public void userDeleteTheElements(DataTable deletes) {
        List< List<String> > deleteElmnt =  deletes.asLists(String.class);

        for (int i = 0; i < deleteElmnt.size(); i++) {
            dci.deleteItem(deleteElmnt.get(i).get(0));}}
    }



