package com.example.demo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    int cakes = 0;

    @Given("^I have (\\d+) cukes in my belly$")
    public void iHaveCukesInMyBelly(int cakes) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.cakes = cakes;
    }

    @When("^I wait (\\d+) hour$")
    public void iWaitHour(int hours) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.cakes = hours;
    }

    @Then("^my belly should growl$")
    public void myBellyShouldGrowl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(cakes, 1);
    }
}
