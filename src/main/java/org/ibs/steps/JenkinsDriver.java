package org.ibs.steps;

import io.cucumber.java.ru.И;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class JenkinsDriver {
    private RemoteWebDriver driver;
@И("драйвер Jenkins")
public void initRemoteDriver() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "chrome");
    capabilities.setCapability("browserVersion", "109.0");
    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
            "enableVNC", true,
            "enableVideo", true
    ));
    try {
        RemoteWebDriver driver;
        driver = new RemoteWebDriver(
                URI.create("http://selenoid:4444/wd/hub").toURL(),
                capabilities
        );
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    }

}}