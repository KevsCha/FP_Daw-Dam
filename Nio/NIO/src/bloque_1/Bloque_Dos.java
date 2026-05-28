package bloque_1;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bloque_Dos {

	public static void main(String[] args) {
		
		//Ejercicio 8
		//8.Lectura por líneas: Lee un archivo y guarda las líneas en una lista.
		try {
			System.out.println("Forma A");
			Path archivo = Path.of("notas.txt");
			
			if(!Files.exists(archivo)) {
				System.out.println("El archivo no existe");
			}
			
			//Files.readAllLines --> metodo para leer de manera directa, devuelve una lista
			List<String> lineas = Files.readAllLines(archivo, StandardCharsets.UTF_8);
			System.out.println("Lineas lineas con exito: \n" + lineas);
			System.out.println("________________________________________________");
			
			
			System.out.println("\n\n\nForma B\n");
			//Files.lines --> metodo para leer con el estilo funcional, devuelve un stream de str
			try (Stream<String> streamLines = Files.lines(archivo, StandardCharsets.UTF_8)){
				List<String> listaStream = streamLines.collect(Collectors.toList());
				listaStream.forEach(System.out::println);
			} 
			
			
		} catch (NoSuchFileException e){
			System.err.println("Error: El archivo '" + e.getFile() + "' no existe. Verifica la ruta.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
