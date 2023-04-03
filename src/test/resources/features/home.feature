Feature: Home

	Background: Abrir pagina de home
				Given Logueo Pyemnt 
				When Ingreso a la pagina de home

	Scenario: Verificar que los contenidos dentro de home sean los correctos				
        Then Se muestra el mensaje ¡Pensamos en ti! Por eso creamos esta aplicación que facilitara tu trabajo
        And Se muestra el mensaje Pronto encontrarás aquí los enlaces que más necesitas para tu gestión.
        And Se muestra el mensaje Natalia bienvenid@ a esta nueva experiencia.
        And Se muestra el nombre del asesor
        
 	Scenario: Boton deslogueo
        When Ingresar al desplegable con la opcion de cerrar sesion
        And Dar click sobre la opcion de cerrar sesion
        Then Se saldra del aplicativo
        
  Scenario: Ingreso de reserva
        When Escribe un numero de reserva
        And Se valida que no contenga mas de seis valores
        And Dar clic en el boton gestionar
        Then Ingresara a la pagina de detalles de la reserva