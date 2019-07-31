package com.ejercicio3.features.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"com/ejercicio3/features/stepsDefinitions"} //link features (cucumber) with step definitions
)
public class TestRunner {

}
