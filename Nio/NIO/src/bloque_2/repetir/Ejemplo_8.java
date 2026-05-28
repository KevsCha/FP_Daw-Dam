package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejemplo_8 {
	//Lectura y escritura simultánea: Abre un archivo en modo lectura/escritura, lee el primer byte y cámbialo por una 'X'.
	public static void main(String[] args) {
		Path ruta = Path.of("saveE3.txt");
		ByteBuffer buffer = ByteBuffer.allocate(1);
		
		
		try (FileChannel canal = FileChannel.open(ruta, StandardOpenOption.READ, StandardOpenOption.WRITE)){
			canal.read(buffer);
			buffer.flip();
			char charrr = (char)buffer.get();
			System.out.println(charrr + "--- Caracter original");
			buffer.clear();
			
			buffer.put((byte)'X');
			buffer.flip();
			canal.position(0);
			canal.write(buffer);
			buffer.clear();
		
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
