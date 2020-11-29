package pho.formulaone.web;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import pho.formulaone.web.annotation.BehaviourTest;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:build/cucumberHtml", "json:build/cucumberJson/cucumber.json"}, strict = true, snippets = CAMELCASE,
        features = "src/test/features")
@BehaviourTest
public class RunCucumberTest {}
