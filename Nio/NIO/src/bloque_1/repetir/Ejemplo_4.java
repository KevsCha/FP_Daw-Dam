package bloque_1.repetir;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Ejemplo_4 {

	public static void main(String[] args) {
		Path save = Path.of("saveE4.txt");
		List<String> nombres = List.of("Africa", "Kevin", "Canelita", "Noa", "Gala");
		try {
			Files.write(save, nombres, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}

	}

}
