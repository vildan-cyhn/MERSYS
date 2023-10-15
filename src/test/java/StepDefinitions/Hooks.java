package StepDefinitions;

import Utilities.WD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before(){


    }


    @After
    public void after(){

        WD.quitDriver();

    }



}
