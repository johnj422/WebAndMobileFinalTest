package org.espn.web.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/org/espn/web/tests/features",
        glue = "steps"
)
public class Runner extends AbstractTestNGCucumberTests {
}
