Feature: Validar integridad del contenido del documento cargado

  Scenario: Cargar y verificar documento
    Given un documento conocido y previamente validado
    When se carga el documento al sistema
    Then el contenido del documento debe permanecer sin modificaciones

    When se descarga el documento del sistema
    Then el documento descargado no debe tener alteraciones o pérdida de datos