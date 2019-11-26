package co.com.servicio.empleados.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerDatosEmpleados implements Task {

    private String idEmpleado;

    public ObtenerDatosEmpleados(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static Performable basicos(String idEmpleado){
        return instrumented(ObtenerDatosEmpleados.class,idEmpleado);
    }
}
