Feature: Validar carga de documento con archivo válido

  Scenario: El usuario carga un documento válido
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona el botón de carga de documento
    Then El explorador de archivos debe mostrarse

    When Elige un archivo en formato válido
    Then El archivo debe ser aceptado por el sistema

    When Hace clic en 'Cargar'
    Then El sistema debe mostrar un indicador de progreso y confirmar la carga exitosa