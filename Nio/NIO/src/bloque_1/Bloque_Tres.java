package bloque_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Bloque_Tres {

	public static void main(String[] args) {
		Path destino = Path.of("lista_nomb.txt");
		List<String> nombres = List.of("Africa", "Kevs", "Canelita", "Miaaaaauuuu", "Miaaaaau");
		// Ejercicio 9
		// 9.Escritura de lista: Toma una lista de 5 nombres y escríbelos en un archivo nuevo, cada uno en una línea.
		try {
		
			
			Files.write(destino, 
					nombres, 
					StandardCharsets.UTF_8,
					StandardOpenOption.TRUNCATE_EXISTING);
			
		} catch (IOException e) {
			System.err.println("Error al intentar escribir el archivo: " + e.getMessage());
			e.printStackTrace();
		}
	}

}

/*
 * Todos los funcionales deben entrar dentro de un try-cath
 * Escritura
 * 
 * Directo/Files.write() los ultimos parametros es para configurar el archivo .CREATE -> crea el archivo si no existe
 * 												TRUNCATE_EXISTING si existe lo sobreescribe, return Path
 * Directo/Files.writeString escribe una string largo, return Path
 * -----------------------------------------------------------------------------------
 * Funcional/Files.lines lee linea a linea, return --> Strema<String>
 * Funcional/Files.list --> return flujo de rutas (Stream<path>)
 * Funcional/Files.walk --> return flujo de rutas (Stream<Path>)
 * 
 * _______________________________________________________________________________________________
 * Lectura
 *  
 * Directo/Files.readAllLines() return List<String> cada elemento de la lista es una linea 
 * Directo/Files.readString() return String, Todo el archivo en un string
 * -----------------------------------------------------------------------------------------------
 * Funcional/Files.lines() return Stream<string> 
 * Funcional/Files.list
 * 
 * Funcional/Files.newBufferedReader --> return un Stream<String>, usar el metodo .lines para acceder al stream
 * 
 * BufferedReader/BufferedWrite -> se pueden abrir con Files.new....
 * 
 * .flatMap(linea -> Arrays.stream(linea.split(" "))) --> trocear en palabras
 * .flatMapToInt(linea -> linea.chars()) --> trocear en caracteres
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * // FileSystems.getDefault() es el sistema de ficheros del sistema operativo
 * 
 * FileSystem zipFs = FileSystems.newFileSystem(pathAlZip
 * 
 * 
 * 
 * 
 * 
 * List<Ruta> listaRuta = lines
        //EL TRUCO FUNCIONAL: Si la primera línea empieza con el BOM, lo borramos
        .map(linea -> linea.startsWith("\uFEFF") ? linea.substring(1) : linea)
        
        // A partir de aquí el texto ya está limpio de fantasmas invisibles
        .map(x -> {
            String[] a = x.split(";");
            return new Ruta(a[0], a[1], a[2], Double.parseDouble(a[3]), Integer.parseInt(a[4]));
        })
        .collect(Collectors.toList());
 *  
*/
