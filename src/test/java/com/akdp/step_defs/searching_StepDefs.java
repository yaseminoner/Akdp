package com.akdp.step_defs;


import com.akdp.pages.SearchingJob;
import com.akdp.utilities.BrowserUtils;
import com.akdp.utilities.ConfigurationReader;
import com.akdp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class searching_StepDefs extends SearchingJob {

    SearchingJob searchingJob=new SearchingJob();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @When("user enters the main page")
    public void user_enters_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user clicks neewsroom button")
    public void user_clicks_over_neewsroom_button() {
        BrowserUtils.sleep(1);
        searchingJob.neewsRoomBtn.click();

    }
    @And("user clicks kundenstorys button")
    public void userClicksKundenStorysButton() {
        BrowserUtils.sleep(2);
        searchingJob.kundenStorysBtn.click();
    }
    @And("user scroll down and up")
    public void userScrollDownAndUp() {
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,1500)");
        }
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-1500)");
        }
    }

    @And("user goes back to main page")
    public void userGoesBackToMainPage() {
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
    }
    @Then("user should see the main page")
    public void userShouldSeeTheMainPage() {
        BrowserUtils.sleep(2);
        String expectedTitle = "AKDB - Anstalt für Kommunale Datenverarbeitung in Bayern";
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.sleep(1);

        Assert.assertEquals(expectedTitle,actualTitle);



    }
}
