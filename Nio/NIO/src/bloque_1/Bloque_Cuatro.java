package bloque_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Bloque_Cuatro {
	
	//10.Añadir contenido: Agrega una fecha y hora al final de un archivo existente sin borrar lo anterior.
	public static void main(String[] args) {
		Path ruta = Path.of("lista_nomb.txt");
		LocalDateTime fecha =  LocalDateTime.now();
		
		try {
			
			Files.write(ruta, 
					List.of(fecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))), 
					StandardCharsets.UTF_8,
					StandardOpenOption.APPEND);//escribe debajo del archivo
			
			
		} catch (IOException e) {
			System.err.println("Error al crear el fichero: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
