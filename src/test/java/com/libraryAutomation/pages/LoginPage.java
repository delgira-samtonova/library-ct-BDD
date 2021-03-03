package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement usernameInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in'] ")
    public WebElement singInButton;

public void login( String role){
    if(role.equals("librarian")){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlEnvironment"));
        usernameInput.sendKeys(ConfigurationReader.getProperty("librarian1"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("librarian1pw"));
        singInButton.click();
    }else{
        Driver.getDriver().get(ConfigurationReader.getProperty("urlEnvironment"));
        usernameInput.sendKeys(ConfigurationReader.getProperty("student1"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("student1pw"));
        singInButton.click();
    }
}
}
