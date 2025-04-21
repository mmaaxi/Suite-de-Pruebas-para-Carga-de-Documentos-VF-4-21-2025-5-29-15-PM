Feature: Validar respuesta ante archivos corruptos.

  Scenario: Subiendo un archivo corrupto
    Given el usuario está en la página de carga de archivos
    When intenta cargar un archivo dañado o corrupto
    Then el sistema no debe proceder con la carga
    And el usuario debe recibir un mensaje específico sobre el problema del archivo