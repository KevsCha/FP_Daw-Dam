package bloque_1.repetir;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Ejemplo_2 {
//Mover y rename 
	public static void main(String[] args) {
		Path origen = Path.of("notasCopia.txt");
		Path rename = Path.of("notasv2.txt");
		
		try {
			if(!Files.exists(origen)) {
				System.out.println("El fichero ya existe");
				/*Files.createFile(origen);
				Files.write(origen, 
						List.of("Yo quiero mas a mi puchufa", "", "Afri y Kevs X siempre <3"), 
						StandardCharsets.UTF_8, 
						StandardOpenOption.TRUNCATE_EXISTING);*/
				
			}else {
				Files.move(origen, rename, StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
