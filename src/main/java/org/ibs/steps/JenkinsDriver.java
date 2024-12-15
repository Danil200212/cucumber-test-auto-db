package org.ibs.steps;

import io.cucumber.java.ru.И;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class JenkinsDriver {
//    private RemoteWebDriver driver;
@И("драйвер Jenkins")

public void testVegetableAdd() throws MalformedURLException {
    // Настройка ChromeOptions для Selenoid
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--remote-allow-origins=*"); // Добавляем аргумент для разрешения удаленного доступа

    // Настройка DesiredCapabilities для Selenoid
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

    // Добавляем параметры для Selenoid
    Map<String, Object> selenoidOptions = new HashMap<>();
    selenoidOptions.put("enableVNC", true); // Включение VNC
    selenoidOptions.put("enableVideo", false); // Отключение записи видео
    capabilities.setCapability("selenoid:options", selenoidOptions);

    // Подключение к Selenoid Hub
    WebDriver driver = new RemoteWebDriver(new URL("http://jenkins.applineselenoid.fvds.ru:4444/wd/hub"), capabilities);

    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize(); // дисплей на максимум

    driver.get("https://qualit.applineselenoid.fvds.ru/");  // открыли страницу

//public void initRemoteDriver() {
//    DesiredCapabilities capabilities = new DesiredCapabilities();
//    capabilities.setCapability("browserName", "chrome");
//    capabilities.setCapability("browserVersion", "109.0");
//    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//            "enableVNC", true,
//            "enableVideo", true
//    ));
//    try {
//        RemoteWebDriver driver;
//        driver = new RemoteWebDriver(
//                URI.create("http://selenoid:4444/wd/hub").toURL(),
//                capabilities
//        );
//    } catch (MalformedURLException e) {
//        throw new RuntimeException(e);
//    }


}}