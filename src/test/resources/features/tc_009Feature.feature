Feature: Validar funcionalidad de vista previa del documento

  Scenario: Generar y verificar vista previa de un documento
    Given el usuario carga un documento válido
    When solicita la vista previa del documento
    Then el sistema genera una vista previa visual que permite confirmar el contenido del documento
    And la vista previa muestra correctamente todos los elementos esenciales del documento
    And no hay errores en la representación del contenido del archivo