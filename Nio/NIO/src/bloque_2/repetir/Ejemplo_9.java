package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejemplo_9 {

	public static void main(String[] args) {
		Path ruta = Path.of("datos_origen.txt");
		Path destino = Path.of("vocales.txt");
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		ByteBuffer guardar = ByteBuffer.allocate(1024);
		
		try(FileChannel canal = FileChannel.open(ruta, StandardOpenOption.READ); 
				FileChannel canalEscribir = FileChannel.open(destino, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

			int inicio = 0;
			
			while (canal.read(buffer) != -1) {
				buffer.flip();
				inicio = buffer.position();
				
				byte[] byteStr = new byte [buffer.remaining()];
				int i = inicio;
				buffer.get(byteStr);
				while (i < byteStr.length) {
					if (byteStr[i] == 'a' || byteStr[i] == 'e' || byteStr[i] == 'i' || byteStr[i] == 'o' || byteStr[i] == 'u' ) {
						System.out.println("vocal Encontrado: " + i);
						while(byteStr[i] != '\n') 
							i++;
						guardar.put(byteStr);
						canalEscribir.write(guardar);
						guardar.clear();
						System.out.println("Linea Encontrado: " + i);
					}
					if (byteStr[i] == '\n') {
						System.out.println("Fin de linea: " + (char)byteStr[i + 1] );
						inicio = i + 1;
					}  
					i++;
				}
				buffer.clear();
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
