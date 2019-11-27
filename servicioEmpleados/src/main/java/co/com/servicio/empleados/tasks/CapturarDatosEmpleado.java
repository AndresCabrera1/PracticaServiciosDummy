package co.com.servicio.empleados.tasks;

import static  co.com.servicio.empleados.models.DatosBasicoEmpleado.setDataEmpleado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CapturarDatosEmpleado implements Task {

     private String nomEmpleado,salEmpleado,edadEmpleado;

    public CapturarDatosEmpleado(String nomEmpleado, String salEmpleado, String edadEmpleado) {
        this.nomEmpleado = nomEmpleado;
        this.salEmpleado = salEmpleado;
        this.edadEmpleado = edadEmpleado;
    }

    @Override
    @Step("{0} obtiene los datos del empelado")
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> DataEmpleados = new HashMap<>();
        DataEmpleados.put("employee_name",nomEmpleado);
        DataEmpleados.put("employee_salary",salEmpleado);
        DataEmpleados.put("employee_age",edadEmpleado);
        setDataEmpleado(DataEmpleados);
    }

    public static Performable capturar(String nomEmpleado, String salEmpleado, String edadEmpleado){
        return instrumented(CapturarDatosEmpleado.class,nomEmpleado,salEmpleado,edadEmpleado);
    }
}
