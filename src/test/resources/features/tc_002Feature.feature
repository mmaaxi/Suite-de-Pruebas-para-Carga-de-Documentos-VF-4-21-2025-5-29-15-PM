Feature: Validar carga de documento con formato de archivo incorrecto

  Scenario: Intentar cargar un archivo con formato no soportado
    Given Estoy en la página de carga de documentos
    When Intento cargar un archivo con formato "exe"
    Then El sistema debe mostrar un mensaje de error de formato no soportado
    And Verifico que no se ha almacenado ningún dato del archivo