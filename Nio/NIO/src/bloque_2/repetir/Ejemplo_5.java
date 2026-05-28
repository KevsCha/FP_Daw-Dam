package bloque_2.repetir;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejemplo_5 {

	public static void main(String[] args) {
		Path ruta = Path.of("notasv2.txt");
		ByteBuffer buffer = ByteBuffer.allocate(10);
		
		try(FileChannel canal = FileChannel.open(ruta, StandardOpenOption.READ)) {
			canal.read(buffer);
			System.out.println(canal.size());
			buffer.flip();
			System.out.println(StandardCharsets.UTF_8.decode(buffer));
			buffer.rewind();
			byte[] byteStr = new byte[buffer.remaining()];
			buffer.get(byteStr);
			System.out.println(new String(byteStr, StandardCharsets.UTF_8));
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
