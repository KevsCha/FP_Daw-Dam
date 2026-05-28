package bloque_1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class BloqueUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 1 y 2 copiar y mover
		try {
			//path.of se puede poner muchos parametros y estos significan la ruta de manera escalada 
			Path origen = Path.of("notas.txt");
			Path copia = Path.of("notasCopia.txt");
			Path destino = Path.of("notasv2.txt");
			
			if (!Files.exists(origen)) {//pregunto si existe
				Files.createFile(origen);//Crea un file
				Files.write(origen, List.of("Lineas para el examen por si no existia el archivo"));
				System.out.println("El archivo origen no existia, lo acabo de crear");
			}
			Files.copy(origen, copia, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Archivo copia creado");
			
			
			Files.move(copia, destino, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Archivo se movio con otro nombre");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
