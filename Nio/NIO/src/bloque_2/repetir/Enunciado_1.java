package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Enunciado_1 {

	public static void main(String[] args) {
		Path ruta = Path.of("Enunciado_1.txt");
		ByteBuffer buffer = ByteBuffer.allocate(3);
		
		try(FileChannel canal = FileChannel.open(ruta, StandardOpenOption.READ)) {
			int contador = 0;
			
			
			while(canal.read(buffer) != -1) {
				buffer.flip();
				byte[] byteStr = new byte[buffer.remaining()];
				buffer.get(byteStr);
				String temp = new String(byteStr, StandardCharsets.UTF_8);
				contador += temp.chars().filter(c -> c >= '0' && c <= '9').count();
				buffer.clear();
			}
			System.out.println("Digitos en total: " + contador);
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
