Feature: Validar la funcionalidad de la pantalla de logueo del Payment Collector

#PBI_383190 Validación Conexión con B2B

  @ScenarioValidarConexiónB2B
  Scenario: Validar que PC se conecte con B2B(Directorio Activo) para validar las credenciales ingresadas
    Given La conexión con B2B
    When ingresar usuario
    And ingresar contraseña
    And dar click en boton conectar
    Then validar conexión exitosa

  #@ScenarioAlmErroresConexB2B
  #Scenario: Validar que se almacene en appinside los errores de conexión con B2B
    #Given La conexión Erronea con B2B
    #When se tiene un error de conexión con B2B
    #Then validar que se almacena el error
#
#
 #PBI_383190 Validación Informacion Basica del Asesor
#
  #@ScenarioValidarInfoAsesor
  #Scenario: Validar que se obtenga la información básica del asesor
    #Given La conexión exitosa con payment collector
    #When aparece la información del asesor
    #Then Validar que la información es correcta
#
#
 #PBI_383190 Validación Tiempo Activo de Sesión
#
  #@ScenarioValidarTiempoActivo
  #Scenario: Validar que el tiempo activo de sesion sea de 30 minutos, despues de esto el usuario debe volver a iniciar sesion
    #Given inicio de sesión exitoso
    #When pasados 30 minutos
    #Then Validar que la sesión deja de estar activa
#
#
 #PBI_383190 Validación Usuario Payment Collector
#
  #@ScenarioValidarUsuarioPaymentC
  #Scenario: Validar que se requiera la validacion de usuario antes de permitir el ingreso a PC
    #Given La pantalla de inicio de sesión usuario
    #When solicita el usuario
    #Then Validar que se ingresa correctamente
#
  #@ScenarioValidarContraseñaPaymentC
  #Scenario: Validar que se requiera la validacion de la contraseña del usuario antes de permitir el ingreso a PC
    #Given La pantalla de inicio de sesión contraseña
    #When solicita la contraseña
    #Then Validar que se realiza el ingreso correctamente
#
  #@ScenarioValidarEstadoBloqueadoPaymentC
  #Scenario: Validar  que si el estado del usuario sea bloqueado, muestre un mensaje  para realizar la solicitud de desbloqueo
    #Given el usuario estado bloqueado
    #When muestra el mensaje de estado
    #Then Validar que aparece mensaje para solicitud de desbloqueo
