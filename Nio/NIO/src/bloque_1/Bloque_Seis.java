package bloque_1;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bloque_Seis {

	//12.Filtrado de líneas: Lee un archivo de texto y crea uno nuevo que solo contengan las líneas que incluyan la palabra "Java".
	public static void main(String[] args) {
		Path ruta = Path.of("lista_nomb.txt");
		Path nuevaRuta = Path.of("nueva_ruta.txt");
		
		
		
		try(Stream<String> lines = Files.lines(ruta, StandardCharsets.UTF_8)) {
			
			List<String> pal = lines.filter(x -> x.contains("Java")).collect(Collectors.toList());
			Files.write(nuevaRuta, 
					pal, 
					StandardCharsets.UTF_8,
					StandardOpenOption.CREATE);
			
			
			
			System.out.println(pal);
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		try (BufferedReader reader = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)){
			
			List<String> str = reader.lines().filter(x -> x.contains("Java")).collect(Collectors.toList());
			Files.write(Path.of("RutaTest.txt"),  str, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
			
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	}

}
