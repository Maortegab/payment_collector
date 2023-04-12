package net.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class Conection_db {
	public static String fechaLog;
	public static String horaLog;
	public static String fechaDeslog;
	public static String horaDeslog;
	public static String usuarioBD;
	public static String ipUsuario;
	public static String navegadorBD;
	public static String tiempoSesion;
	
//	public static void main(String[] args) throws Exception{
//		conexion();
//	}
	public void conexion () throws SQLServerException, SQLException {
		
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("az-sqla-server-pci-qa.database.windows.net");
        ds.setDatabaseName("az-sqla-bd-eccepaycoll-use-qa"); 
        ds.setUser("m.ortegabuitrago@dxc.com"); 
        ds.setPassword("INeedABetterPC91!\"#");
        ds.setAuthentication("ActiveDirectoryPassword");

        try (Connection connection = ds.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT TOP (1) [Id]\r\n"
                		+ "      ,[DateStart]\r\n"
                		+ "      ,[TimeStart]\r\n"
                		+ "      ,[UserEmail]\r\n"
                		+ "      ,[IpUser]\r\n"
                		+ "      ,[CalculationMinutes]\r\n"
                		+ "      ,[Browser]\r\n"
                		+ "      ,[LastLogin]\r\n"
                		+ "      ,[CreatedBy]\r\n"
                		+ "      ,[Created]\r\n"
                		+ "      ,[ModifiedBy]\r\n"
                		+ "      ,[Modified]\r\n"
                		+ "      ,[accessGranted]\r\n"
                		+ "  FROM [dbo].[LogSession]\r\n"
                		+ "  WHERE [UserEmail] = 'm.ortegabuitrago@dxc.com'\r\n"
                		+ "  AND [DateStart] >= '2023-03-02'")) {
            if (rs.next()) {
            	fechaLog = rs.getString(2);
            	horaLog = rs.getString(3);
            	fechaDeslog = rs.getString(8);
            	horaDeslog = rs.getString(8);
            	usuarioBD = rs.getString(4);
            	ipUsuario = rs.getString(5);
            	navegadorBD = rs.getString(7);
            	tiempoSesion = rs.getString(6);
            	
//    		System.out.println("You have successfully logged on as: \n" 
//				+"fechaLog: " + fechaLog
//				+"\nhoralog: " + horaLog
//				+"\nfechaDeslog: " + fechaDeslog
//				+"\nhoraDeslog: " + horaDeslog
//				+"\nusuarioBD: " + usuarioBD
//				+"\nipUsuario: " + ipUsuario
//				+"\nnavegadorBD: " + navegadorBD
//				+"\ntiempoSesion: " + tiempoSesion);
            }            
        }catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
