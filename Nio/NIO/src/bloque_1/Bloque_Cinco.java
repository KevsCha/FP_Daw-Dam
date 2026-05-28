package bloque_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class Bloque_Cinco {

	//11 Contar palabras: Lee un archivo y cuenta cuántas vocales totales contiene
	public static void main(String[] args) {
	
		Path ruta = Path.of("notas.txt");
		
		//Si no existe podria comprobarlo con Files.Exist y crearlo
		
		try (Stream<String> lines = Files.lines(ruta, StandardCharsets.UTF_8)){//No olvidar el estandar
			long vocalesInt = lines.map(x -> x.toLowerCase())
						.flatMapToInt(x -> x.chars())
						.filter(x -> "aeiou".indexOf(x) != -1 )
						.count();
			System.out.println("Las vocales que hay en este archivo son: " + vocalesInt );
			
		} catch (IOException e) {
			System.err.println("Error : " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
