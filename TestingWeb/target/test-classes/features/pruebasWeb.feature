#language: es
@FlujoSelenium
Característica: Implementación de botón de Iniciar Sesión con Google

  @HappyPath @Selenium
  Escenario: Validar que cargue correctamente la pagina de inicio
    Dado que estoy en la página de inicio de selenium
    Cuando la página se carga completamente
    Entonces debería ver el título "Selenium automates browsers. That's it!"
    Y Cierra la pagina Selenium

  @HappyPath @Selenium2
  Escenario: Verificar que la navegación de Documentación funciona correctamente
    Dado que estoy en la página de inicio de selenium
    Cuando hago clic en el enlace "Documentation"
    Entonces Cierra la pagina Selenium

  @HappyPath @Selenium3
  Escenario: Validar los resultados de la búsqueda "Driver"
    Dado que estoy en la página de inicio de selenium
    Cuando hago clic en el enlace "Documentation"
    Y hago clic en buscar
    Y hago clic en search docs
    Y escribo la palabra clave "Driver" en el campo de búsqueda
    Entonces valido el resultado relacionado con "IE Driver Server"
    Y Cierra la pagina Selenium