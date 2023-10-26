package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Attestation {
    DialogContent dc=new DialogContent();

    @When("User fills the necessary data in Attestation")
    public void userFillsTheNecessaryDataInAttestation(DataTable sendkeys) {
        List< List<String> >   items=  sendkeys.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e=dc.getWebElement(items.get(i).get(0));
            String sendingText = items.get(i).get(1);
            dc.sendKeysMethod(e, sendingText);}}

    @And("User delete the element name")
    public void userDeleteTheElementName(DataTable deletes) {
        List<String> silinecekler = deletes.asList(String.class);

        for (int i = 0; i < silinecekler.size(); i++) {
            dc.deleteItemR(silinecekler.get(i));
        }


    }
    }
