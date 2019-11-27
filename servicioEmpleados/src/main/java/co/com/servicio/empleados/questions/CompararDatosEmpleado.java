package co.com.servicio.empleados.questions;

import static co.com.servicio.empleados.models.DatosBasicoEmpleado.getDataEmpleado;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.HashMap;
import java.util.Map;

public class CompararDatosEmpleado implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Map<String, String> DataEmpleados = Serenity.sessionVariableCalled("DATA_SERVICE");
        return DataEmpleados.get("employee_name").equals(getDataEmpleado().get("employee_name")) &&  DataEmpleados.get("employee_salary").equals(getDataEmpleado().get("employee_salary"))
                && DataEmpleados.get("employee_age").equals(getDataEmpleado().get("employee_age"));
    }

    public static CompararDatosEmpleado verdadero(){
        return new CompararDatosEmpleado();
    }
}
