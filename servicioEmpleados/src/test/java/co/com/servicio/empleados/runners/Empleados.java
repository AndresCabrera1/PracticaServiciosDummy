package co.com.servicio.empleados.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/empleados.feature",
        glue = "co.com.servicio.empleados.stepdefinitions"
)

public class Empleados {
}
