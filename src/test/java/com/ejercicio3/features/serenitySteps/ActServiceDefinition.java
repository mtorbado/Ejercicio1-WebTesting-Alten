package com.ejercicio3.features.serenitySteps;

import org.junit.Assert;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ActServiceDefinition {

    private String driverExecutablePath = "src\\test\\resources\\webdrivers\\chromedriver.exe";
    private String propertiesPath = "src\\main\\resources\\user.properties";
    private WebDriver driver;
    private Properties p;

    public void getProperties(String propertiesPath) throws IOException {
        FileReader reader = new FileReader(propertiesPath);
        p=new Properties();
        p.load(reader);
    }

    @Step
    public void openLoginPage() throws IOException {
        System.setProperty("webdriver.chrome.driver", driverExecutablePath);
        driver = new ChromeDriver(); // Create a new instance of the Chrome driver
        getProperties(propertiesPath);
        driver.get(p.getProperty("url"));
    }

    @Step
    public void login(){
        driver.findElement(By.id("userName")).sendKeys(p.getProperty("user"));
        driver.findElement(By.name("password")).sendKeys(p.getProperty("password"));

        driver.findElement(By.id("loginButton")).click();
    }

    @Step
    public void pageShown() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Assert failed. Profile page not loaded", "http://172.21.0.93:8080/production/profile.html",driver.getCurrentUrl());
    }

    @Step
    public void editProfileButtonIsEnabled(){
        Assert.assertTrue("Assert failed. Edit profile button not enabled ", driver.findElement(By.id("editProfile")).isEnabled());
    }


}
