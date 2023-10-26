package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;


public class Fields {
DialogContent dc=new DialogContent();



    @And("FieldType status")
    public void fieldtypeStatus()
    {
        dc.clickMethod(dc.FieldType);
        dc.clickMethod(dc.FieldType2);
    }


    }

