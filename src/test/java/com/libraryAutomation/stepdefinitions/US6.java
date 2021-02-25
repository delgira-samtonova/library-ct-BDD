package com.libraryAutomation.stepdefinitions;

import com.libraryAutomation.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US6 {
    @Given("I login using {string} and {string}")
    public void iLoginUsingAnd(String arg0, String arg1) {
        loginPage.emailInput.sendKeys(arg0);
        loginPage.passwordInput.sendKeys(arg1 + Keys.ENTER);
    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedTableHeaders) {
        List<WebElement> headers = new ArrayList<>(studentHomePage.tableHeaders);
        List<String> actualTableHeaders = BrowserUtils.translateToStrList(headers);
        Assert.assertEquals(expectedTableHeaders, actualTableHeaders);
    }
}
