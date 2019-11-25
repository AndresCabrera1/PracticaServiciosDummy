package co.com.qvision.project.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features ="src/test/resources/features/project_qvision.feature",
		glue="co.com.qvision.project.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)
public class ProjectQVisionRunner {}
