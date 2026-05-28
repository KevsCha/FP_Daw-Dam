package bloque_1.repetir;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Stream;


public class Ejemplo_5 {

	public static void main(String[] args) {
		Path notas = Path.of("notas.txt");
		LocalDateTime fecha = LocalDateTime.now();
		String s = fecha.format(DateTimeFormatter.ofPattern("yyyy MM dd HH:mm:ss"));
		
		try {
			Files.write(notas, List.of(s), StandardCharsets.UTF_8, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
		} catch (IOException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}
		
	}

}
