package StepDefinitions;

import Utilities.WD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before(){


    }


    @After
    public void after(Scenario scenario){

        if(scenario.isFailed()){

            TakesScreenshot ts=((TakesScreenshot) WD.getDriver());
            byte [] statusInTheFrontMem=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(statusInTheFrontMem,"image/png","screenshot name");


        }



        WD.quitDriver();

    }



}
