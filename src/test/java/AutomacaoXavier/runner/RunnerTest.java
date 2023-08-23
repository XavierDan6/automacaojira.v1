package AutomacaoXavier.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        //tags = "  @LoginInvalido",
        //tags = "@loginComSucesso",
        //tags = "@dadosEmBranco",
        tags = "",
        glue = "AutomacaoXavier.steps",
        plugin = {"json:target/reports/cucumberReports.json", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerTest {
}
