package co.com.servicio.empleados.tasks;

import co.com.servicio.empleados.models.DatosBasicoEmpleado;
import io.vavr.collection.List;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;


import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerDatosEmpleados implements Task {

    private String idEmpleado;
    private EnvironmentVariables environmentVariables;
    public ObtenerDatosEmpleados(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    @Step("{0} Ejecuta el servicio de empleados")
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(environmentVariables.getProperty("UrlBaseService"))).attemptsTo(
                Get.resource("/api/v1/employee/{id}").with( restpuesta -> restpuesta.pathParam("id", idEmpleado))
                );
        Map<String, Object> DataServices = SerenityRest.lastResponse().getBody().jsonPath().get();
        Serenity.setSessionVariable("DATA_SERVICE").to(DataServices);
}

    public static Performable basicos(String idEmpleado){
        return instrumented(ObtenerDatosEmpleados.class,idEmpleado);
    }
}
