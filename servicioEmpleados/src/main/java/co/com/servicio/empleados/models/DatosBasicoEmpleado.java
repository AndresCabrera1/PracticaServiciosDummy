package co.com.servicio.empleados.models;

import java.util.Map;

public class DatosBasicoEmpleado {

  private static Map<String, String> DataEmpleado;

    public static Map<String, String> getDataEmpleado() {
        return DataEmpleado;
    }

    public static void setDataEmpleado(Map<String, String> dataEmpleado) {
        DataEmpleado = dataEmpleado;
    }
}
