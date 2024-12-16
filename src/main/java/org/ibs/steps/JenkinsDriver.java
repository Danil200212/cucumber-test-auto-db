package org.ibs.steps;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.ru.И;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class JenkinsDriver {
//    private WebDriver driver;
//    private Properties props;
//
//    @BeforeAll
//    void setUp() throws MalformedURLException {
//        // Загрузка настроек из файла свойств
//        props = new Properties();
//        // Пример: загрузка из файла или системных переменных
//        // props.load(new FileInputStream("config.properties"));
//
//        // Определяем, где запускается тест (локально или удаленно)
//        boolean isRemote = Boolean.parseBoolean(System.getProperty("remote", "true"));
//
//        if (isRemote) {
//            // Удаленный запуск через Selenoid
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            Map<String, Object> selenoidOptions = new HashMap<>();
//            selenoidOptions.put("browserName", "chrome"); // Указываем браузер
//            selenoidOptions.put("browserVersion", "109.0"); // Указываем версию браузера
//            selenoidOptions.put("enableVNC", true); // Включаем VNC
//            selenoidOptions.put("enableVideo", false); // Отключаем запись видео
//            capabilities.setCapability("selenoid:options", selenoidOptions);
//
//            // Подключение к Selenoid
//            driver = new RemoteWebDriver(
//                    URI.create(props.getProperty("SELENOID_URL", "http://jenkins.applineselenoid.fvds.ru:4444/wd/hub")).toURL(),
//                    capabilities
//            );
//        } else {
//            // Локальный запуск
//            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//            driver = new ChromeDriver();
//        }
//
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//    private RemoteWebDriver driver;
//@И("драйвер Jenkins")
//
//public void testVegetableAdd() throws MalformedURLException {
//    // Настройка ChromeOptions для Selenoid
//    ChromeOptions chromeOptions = new ChromeOptions();
//    chromeOptions.addArguments("--remote-allow-origins=*"); // Добавляем аргумент для разрешения удаленного доступа
//
//    // Настройка DesiredCapabilities для Selenoid
//    DesiredCapabilities capabilities = new DesiredCapabilities();
//    capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//
//    // Добавляем параметры для Selenoid
//    Map<String, Object> selenoidOptions = new HashMap<>();
//    selenoidOptions.put("enableVNC", true); // Включение VNC
//    selenoidOptions.put("enableVideo", false); // Отключение записи видео
//    capabilities.setCapability("selenoid:options", selenoidOptions);
//
//    // Подключение к Selenoid Hub
//    WebDriver driver = new RemoteWebDriver(new URL("http://jenkins.applineselenoid.fvds.ru:4444/wd/hub"), capabilities);


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

    //    @BeforeEach
//    public void testVegetableAdd() throws MalformedURLException {
//        // Настройка ChromeOptions для Selenoid
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*"); // Добавляем аргумент для разрешения удаленного доступа
//
//        // Настройка DesiredCapabilities для Selenoid
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//
//        // Добавляем параметры для Selenoid
//        Map<String, Object> selenoidOptions = new HashMap<>();
//        selenoidOptions.put("enableVNC", true); // Включение VNC
//        selenoidOptions.put("enableVideo", false); // Отключение записи видео
//        capabilities.setCapability("selenoid:options", selenoidOptions);
//
//        // Подключение к Selenoid Hub
//        WebDriver driver = new RemoteWebDriver(new URL("http://jenkins.applineselenoid.fvds.ru:4444/wd/hub"), capabilities);
//
//    }

}