package com.company.cucumber.stepdefs;

import Pages.Formulario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.JavascriptExecutor;

public class FormularioStepDef {

    BaseStepDefs baseStepDefs;
    Formulario formulario;

    public FormularioStepDef(BaseStepDefs baseStepDefs) {
        this.baseStepDefs = baseStepDefs;
    }

    @Dado("Yo voy a la pagina de Demoqa")
    public void yoVoyALaPaginaDeDemoqa() {
        System.out.println("Yo voy a la pagina de Demoqa");


    }

    @Cuando("Yo ingreso los datos del formulario")
    public void yoIngresoLosDatosDelFormulario(DataTable usuarios) {

               baseStepDefs.currentPage.registroForm(usuarios);
    }

    @Entonces("Yo deberia visualizar la página para seleccionar cabina")
    public void yoDeberiaVisualizarLaPáginaParaSeleccionarCabina() {
        System.out.println("YYo deberia visualizar la página para seleccionar cabina");

    }
}
