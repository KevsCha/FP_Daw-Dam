package bloque_1.repetir;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Ejemplo_1 {

	public static void main(String[] args) {
		Path origen = Path.of("notas.txt");
		Path copia = Path.of("notasCopia.txt");
		try {
			
			if (!Files.exists(origen)) {
				Files.createFile(origen);
				Files.write(origen, List.of("Quiero una hamburguesa con queso", "Quiero a mi puchufita!!!", "Manifiesto que mi puchufa este aqui... PORFIIII"), StandardOpenOption.CREATE);
			}
			Files.copy(origen, copia, StandardCopyOption.REPLACE_EXISTING);
			
		} catch (Exception e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}
			
		
	}

}
