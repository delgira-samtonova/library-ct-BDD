package com.libraryAutomation.stepdefinitions;

import com.libraryAutomation.pages.UsersPage;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LibraryCT_StepDefinitions {

    UsersPage usersPage = new UsersPage();
    Select select;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    @Given("the user login as a {string}")
    public void the_user_login_as_a(String string) {
        // waiting for the implementation of preceding steps
        //Paul
    }

    @When("the user click users module")
    public void the_user_click_users_module() {
      // waiting for the implementation of preceding steps
        //Paul
    }
    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expectedUserGroupDropDownOptions) {
        wait.until(ExpectedConditions.visibilityOf(usersPage.addUserButton));
        select = new Select(usersPage.userGroupDropDown);
        List<String> actualUserGroupDropDownOptions = BrowserUtils.getElementText(select.getOptions());

        Assert.assertEquals(expectedUserGroupDropDownOptions, actualUserGroupDropDownOptions);
    }
}
