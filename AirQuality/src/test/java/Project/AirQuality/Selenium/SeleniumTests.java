package Project.AirQuality.Selenium;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;


class SeleniumTests {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void airtest() {
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