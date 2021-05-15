package project.airquality.Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;


class SeleniumTests {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.gecko.driver", "/home/passos/Downloads/firefox/geckodriver");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void airtest() {
        System.out.println("Print Driver Path :- " + driver);
        driver.get("http://localhost:8080/AirQuality/Aveiro");
        driver.manage().window().setSize(new Dimension(945, 1027));
        driver.findElement(By.name("city")).click();
        driver.findElement(By.name("city")).sendKeys("Porto");
        driver.findElement(By.name("results")).click();
        driver.findElement(By.name("city")).click();
        driver.findElement(By.name("city")).sendKeys("Vila Nova de Gaia");
        driver.findElement(By.name("results")).click();
        driver.findElement(By.name("city")).click();
        driver.findElement(By.name("city")).sendKeys("Arcozelo");
        driver.findElement(By.name("results")).click();
        driver.findElement(By.name("city")).click();
        driver.findElement(By.name("city")).sendKeys("Aveiro");
        driver.findElement(By.name("results")).click();
    }

}