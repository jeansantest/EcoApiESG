package com.esg.eco_api.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/esg/eco_api/steps",
        plugin = {"pretty"}
)
public class TestRunner {
}