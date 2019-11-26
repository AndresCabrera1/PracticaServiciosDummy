package co.com.servicio.empleados.stepdefinitions;

import co.com.servicio.empleados.tasks.ObtenerDatosEmpleados;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;
public class EmpleadoStepDefinitions {

    @Before
     public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
     }

    @Dado("^que ana tiene el (.*) del empleado$")
    public void queAnaTieneElDelEmpleado(String id) {
        theActorCalled("C0pernic0").attemptsTo(
                ObtenerDatosEmpleados.basicos(id)
        );
    }


    @Cuando("^visualiza los datos basicos del mismo$")
    public void visualizaLosDatosBasicosDelMismo() {

    }

    @Entonces("^verifica los datos correspondientes al servicio$")
    public void verificaLosDatosCorrespondientesAlServicio() {

    }

}
