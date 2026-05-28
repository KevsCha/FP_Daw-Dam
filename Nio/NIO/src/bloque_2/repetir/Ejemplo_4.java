package bloque_2.repetir;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejemplo_4 {

	public static void main(String[] args) {
		Path origen = Path.of("notasv2.txt");
		Path destino = Path.of("copia_E4.txt");
		
		try(FileChannel canalOrigen = FileChannel.open(origen, StandardOpenOption.READ) ; 
			FileChannel canalDestino = FileChannel.open(destino, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
			canalOrigen.transferTo(0, canalOrigen.size(), canalDestino);
			
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
