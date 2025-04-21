Feature: Validar almacenamiento correcto del documento cargado

  Scenario: Carga y verificación del documento en el sistema
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento válido
    Then el sistema debe almacenar el documento correctamente
    And el documento debe aparecer en la sección de administración con los metadatos correctos