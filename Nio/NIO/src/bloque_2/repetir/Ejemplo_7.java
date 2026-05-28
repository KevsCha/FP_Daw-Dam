package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejemplo_7 {

	public static void main(String[] args) {
		Path ruta = Path.of("notas.txt");
		ByteBuffer buffer = ByteBuffer.allocate(20);
		
		try(FileChannel canal = FileChannel.open(ruta, StandardOpenOption.READ)) {
			canal.position(100);
			
			int lectura = canal.read(buffer);
			if (lectura != -1) {
				buffer.flip();
				/*
				byte[] byteStr = new byte[buffer.remaining()];
				buffer.get(byteStr);
				*/
				System.out.print(StandardCharsets.UTF_8.decode(buffer));
				buffer.clear();
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
