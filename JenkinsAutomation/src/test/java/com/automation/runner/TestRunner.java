package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/JenkinsJob.feature",
        glue = "com.automation.steps",
        plugin = {"json:target/cucumber.json"}
)
public class TestRunner {

}
