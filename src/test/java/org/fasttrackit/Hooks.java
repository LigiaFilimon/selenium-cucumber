package org.fasttrackit;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",AppConfig.getChromeDriverPath());
         DriverFactory.initWebDriver("browser");
        DriverFactory.getDriver().get(AppConfig.getSiteUrl());

    }

    @After
    public void teardown() {
        DriverFactory.getDriver().quit();
    }

}
