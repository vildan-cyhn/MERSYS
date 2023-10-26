package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;


public class US_04_Ethem_StepDefinitons {
DialogContent dc=new DialogContent();



    @And("FieldType status")
    public void fieldtypeStatus()
    {
        dc.clickMethod(dc.FieldType);
        dc.clickMethod(dc.FieldType2);
    }


    }

