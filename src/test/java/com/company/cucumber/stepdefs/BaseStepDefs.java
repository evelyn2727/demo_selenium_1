package com.company.cucumber.stepdefs;

import Pages.Formulario;
import com.company.base.BaseTest;


public class BaseStepDefs {

    protected Formulario currentPage;

    public BaseStepDefs(){
        currentPage = new Formulario(BaseTest.getDriver());
    }


}
