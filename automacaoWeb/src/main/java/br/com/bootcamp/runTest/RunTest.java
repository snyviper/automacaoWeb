package br.com.bootcamp.runTest;

import org.junit.runner.RunWith;

import br.com.bootcamp.settings.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, dryRun = false,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty", "json:target/cucumber.json"},
		features = {"src/test/resources/features/web"}, glue = {
		"br.com.bootcamp.web.steps", "br.com.bootcamp.app.steps",
		"br.com.bootcamp.configuration", "br.com.bootcamp.commons",
		"br.com.bootcamp.bean"},
		tags = {"@web"})

public class RunTest extends BaseTest {
	
	

}
