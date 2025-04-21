Feature: Validar proceso de carga sin seleccionar documento

  Scenario: Hacer clic en el botón de carga sin seleccionar ningún archivo
    Given El usuario está en la página de carga de archivos
    When Hace clic en el botón de carga sin seleccionar archivo
    Then El sistema impide la carga y muestra un mensaje de advertencia de que se requiere un archivo