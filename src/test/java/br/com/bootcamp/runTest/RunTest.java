package br.com.bootcamp.runTest;

import br.com.bootcamp.settings.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"json:target/cucumber.json" }, features = { "/Users/marcosBarbosa/Documents/automacaoWeb/src/test/resources/features" }, glue = {
				"br.com.bootcamp.steps.web","br.com.bootcamp.settings" },
        tags = "@web")


public class RunTest extends BaseTest {
	@AfterClass
	public static void AfterTests() {
		if (webDriver != null)
			closeWeb();
	}
}