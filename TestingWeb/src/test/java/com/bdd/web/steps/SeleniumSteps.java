package com.bdd.web.steps;

import com.bdd.web.page.SeleniumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumSteps {
    WebDriver driver;
    SeleniumPage Selenium(){
        return new SeleniumPage(driver);
    }

    public void que_estoy_en_la_página_de_inicio_de_selenium() {
        System.setProperty("webdriver.chrome.driver","drivers/win/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public String validoTitulo() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(Selenium().validoTitulo());
        return Selenium().validoTitulo();
    }

    public void hagoClicEnElEnlace() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Selenium().hagoClicEnElEnlace().click();
    }

    public void debería_Ser_Redirigido_A_La_Página_De_Documentación() {
        System.setProperty("webdriver.chrome.driver","drivers/win/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.selenium.dev/documentation/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public void hagoClicEnBuscar() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Selenium().hagoClicEnBuscar().click();
    }

    public void hagoClicEnSearchDocs() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Selenium().hagoClicEnSearchDocs().click();
    }

    public void escriboPalabraKey(String consulta) throws InterruptedException {
        Selenium().escriboPalabraKey().sendKeys(consulta);
        TimeUnit.SECONDS.sleep(3);

    }

    public String validarResultado() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(Selenium().validarResultado());
        return Selenium().validarResultado();
    }

    public void cierraLaPaginaSelenium() {
        driver.quit();
    }
}

