package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejemplo_2 {

	public static void main(String[] args) {
		Path ruta = Path.of("notas.txt");
		ByteBuffer buffer = ByteBuffer.allocate(10);
		try(FileChannel canal = FileChannel.open(ruta, StandardOpenOption.READ)) {
			
			int lectura = canal.read(buffer);
			buffer.flip();
			byte[] byteStr = new byte[buffer.remaining()];
			
			buffer.get(byteStr);
			System.out.println(new String(byteStr, StandardCharsets.UTF_8));
			
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
