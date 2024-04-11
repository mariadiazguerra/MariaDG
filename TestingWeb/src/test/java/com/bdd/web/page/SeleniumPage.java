package com.bdd.web.page;

import org.openqa.selenium.*;

public class SeleniumPage {
    WebDriver driver;

    public SeleniumPage(WebDriver driver) {
        this.driver = driver;
    }

    By Titulo = By.xpath("//h1[@class='d-1 fw-bold']");
    By clickEnlace = By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a");
    By clickBuscar = By.xpath("//*[@id=\"docsearch-1\"]/button/span[1]/span");
    By clickSearchDocs = By.xpath("//*[@id=\"docsearch-input\"]");
    By escriboWord = By.xpath("//*[@id=\"docsearch-input\"]");
    By validoResultado = By.xpath("//*[@id=\"docsearch-item-0\"]/a/div/div[2]");

    public String validoTitulo() {
        return driver.findElement(Titulo).getText();
    }

    public WebElement hagoClicEnElEnlace() {
        return driver.findElement(clickEnlace);
    }

    public WebElement hagoClicEnBuscar() {
        return driver.findElement(clickBuscar);
    }

    public WebElement hagoClicEnSearchDocs() {
        return driver.findElement(clickSearchDocs);
    }

    public WebElement escriboPalabraKey() {
        return driver.findElement(escriboWord);
    }

    public String validarResultado() { return driver.findElement(validoResultado).getText();
    }
}
