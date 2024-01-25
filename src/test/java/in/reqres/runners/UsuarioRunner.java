package in.reqres.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/Usuario.feature",
        glue = "in.reqres.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class UsuarioRunner {
}
