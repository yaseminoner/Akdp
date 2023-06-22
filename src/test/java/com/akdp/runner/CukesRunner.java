package com.akdp.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "pretty",
                    "json:target/cucumber.json",
                    "html:target/cucumber-reports.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber",
            },
            features="src/test/resources/features",
            glue="com/akdp/step_defs",
            dryRun = false,
            tags="@smoke",
            publish = true
    )
    public class CukesRunner {
}
