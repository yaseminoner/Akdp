package com.akdp.step_defs;

import com.akdp.utilities.BrowserUtils;
import com.akdp.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag");
    }
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }
    @After
    public void teardownScenario(Scenario scenario){
        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        BrowserUtils.sleep(5);
        Driver.closeDriver();

    }
    public void setupStep(){
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //  @AfterStep
    public void afterStep(){
        System.out.println("--------> applying tearDown using @AfterStep");
    }


}
