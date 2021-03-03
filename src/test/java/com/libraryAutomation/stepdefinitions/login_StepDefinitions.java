package com.libraryAutomation.stepdefinitions;

import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String url = ConfigurationReader.getProperty("urlEnvironment");
        Driver.getDriver().get(url);
    }



    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        String username = ConfigurationReader.getProperty("librarian1");
        String password = ConfigurationReader.getProperty("librarian1pw");

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.singInButton.click();


    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected = "dashboard";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(expected));
        String actual = Driver.getDriver().getCurrentUrl();



       Assert.assertTrue(actual.contains(expected));

       Driver.closeDriver();

    }


        @When("I login as a student")
        public void iLoginAsAStudent() {
            String username = ConfigurationReader.getProperty("student1");
            String password = ConfigurationReader.getProperty("student1pw");

            loginPage.usernameInput.sendKeys(username);
            loginPage.passwordInput.sendKeys(password);
            loginPage.singInButton.click();
    }

        @Then("books should be displayed")
        public void booksShouldBeDisplayed() {
            String expected = "books";

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
            wait.until(ExpectedConditions.urlContains(expected));

            String actual = Driver.getDriver().getCurrentUrl();

            Assert.assertTrue(actual.contains(expected));
            Driver.closeDriver();

        }

        @Given("the user login as a {string}")
        public void theUserLoginAsA(String role) {
        loginPage.login(role);


    }

        @Then("the user on  {string}")
        public void theUserOn(String page) {
            String expected = page;

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
            wait.until(ExpectedConditions.urlContains(expected));
            System.out.println(expected);
            String actual = Driver.getDriver().getCurrentUrl();
            System.out.println(actual);
            Assert.assertTrue(actual.contains(expected));
            Driver.closeDriver();



    }
}

