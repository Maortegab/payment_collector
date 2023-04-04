package net.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath= "C:\\Users\\mortegabuitr\\eclipse-workspace\\payment_collector\\src\\test\\resources\\configs\\propiedades.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("propiedades.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getMail(){
		String correo = properties.getProperty("correo");
		if(correo!= null) return correo;
		else throw new RuntimeException("correo not specified in the propiedades.properties file.");		
	}
	
	public String getPassword() {		
		String contrasena = properties.getProperty("contrasena");
		if(contrasena != null) return contrasena;
		else throw new RuntimeException("contrasena not specified in the propiedades.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url_payment");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the propiedades.properties file.");
	}
	
	public String getConfigkey() {
		String config_key = properties.getProperty("config_key");
		if(config_key != null) return config_key;
		else throw new RuntimeException("config_key not specified in the propiedades.properties file.");
	}
	public String getConfig_value() {
		String config_value = properties.getProperty("config_value");
		if(config_value != null) return config_value;
		else throw new RuntimeException("config_value not specified in the propiedades.properties file.");
	}
	public String getExcelLocation() {
		String excelLocation = properties.getProperty("excelLocation");
		if(excelLocation != null) return excelLocation;
		else throw new RuntimeException("excelLocation not specified in the propiedades.properties file.");
	}
}
