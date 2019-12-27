package com.zerobank.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // path to features
        glue = "com/zerobank/stepdefinitions", //path to step definitions
        dryRun = true


)

public class CukesRunner {
}
