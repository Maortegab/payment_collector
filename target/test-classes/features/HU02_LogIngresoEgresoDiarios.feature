Feature: Log de Ingreso y Egreso Diarios
  Se requiere almacenar en un log los registros de entrada y salida de los usuarios de PC

  
  Scenario: Validar que al hacer Login en PC se almacene un log que contenga la Fecha de Logueo (Formato DD/MM/AA)
    Given ingreso a plataforma  
    When login realizado correctamente
    Then se almacena log
    And contiene la fecha de logueo_Formato DD/MM/AA

	Scenario: Validar que al hacer Login en PC se almacene un log que contenga la Hora de Logueo (Formato HH:MM:SS)
		Given ingreso a plataforma  
    When login realizado correctamente
    Then se almacena log
    And contiene la Hora de Logueo_Formato HH:MM:SS
	
	Scenario: Validar que al hacer Login en PC se almacene un log que contenga la Fecha de Deslogueo (Formato DD/MM/AA)
		Given ingreso a plataforma  
    When login realizado correctamente
    Then se almacena log
    And contiene la Fecha de Deslogueo_Formato DD/MM/AA
	
	Scenario: Validar que al hacer Login en PC se almacene un log que contenga la Hora de Deslogueo (Formato HH:MM:SS)
		Given ingreso a plataforma  
    When login realizado correctamente
    Then se almacena log
    And contiene la Hora de Deslogueo_Formato HH:MM:SS
    
	Scenario: Validar que al hacer Login en PC se almacene un log que contenga el Usuario
		Given ingreso a plataforma  
    When login realizado correctamente
    Then se almacena log
    And contiene el Usuario
    
	Scenario: Validar que al hacer Login en PC se almacene un log que contenga la IP del Usuario
		Given ingreso a plataforma  
    When login realizado correctamente
    Then se almacena log
    And contiene la IP del Usuario    
    
	Scenario: Validar que al hacer Login en PC se almacene un log que contenga el Navegador Utilizado
		Given ingreso a plataforma  
    When login realizado correctamente
    Then se almacena log
    And contiene el Navegador Utilizado
    
	Scenario: Validar que al hacer Login en PC se almacene un log que contenga el Calculo de Minutos entre Fecha/Hora
		Given ingreso a plataforma  
    When login realizado correctamente
    Then se almacena log
    And contiene el Calculo de Minutos entre Fecha/Hora