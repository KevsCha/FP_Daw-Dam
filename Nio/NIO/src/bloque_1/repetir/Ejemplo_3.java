package bloque_1.repetir;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo_3 {
	//Leer por lineas
	public static void main(String[] args) {
		Path ruta = Path.of("notas.txt");
		Path saveE3 = Path.of("saveE3.txt");
		List<String> lista = null;
		
		try(Stream<String> lines =  Files.lines(ruta)) {
			
			lista = lines.toList();
			System.out.println(lista);
			Files.write(saveE3, lista, 
						StandardCharsets.UTF_8, 
						StandardOpenOption.TRUNCATE_EXISTING,
						StandardOpenOption.CREATE);
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
