package com.mindera.qae;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseConfig {

    private WebDriver driver;
    private DesiredCapabilities desiredCapabilities;

    @BeforeClass(groups = {"smoke", "regression"})
    @Parameters({"browserName"})
    public void setUp(
            @Optional("chrome") String browserName
    ) throws MalformedURLException {
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName", browserName);
        desiredCapabilities.setCapability("acceptInsecureCerts", true);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
        setWebDriver(driver);
    }

    @AfterClass(groups = {"smoke", "regression"})
    public void closeBrowser() {
        driver.quit();
    }

}