package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo_1 {

	public static void main(String[] args) {
		Path destino = Path.of("Archivo_1.txt");
		String str = "Hola Mundo NIO";
		//List<String> list = List.of("Canelita", "Kevs", "Afri", "Familia Feliz");
		//Stream<Byte[]> x = list.stream().map(x -> x.getBytes(StandardCharsets.UTF_8));
		byte[] byteStr = str.getBytes(StandardCharsets.UTF_8); 
		
		ByteBuffer buffer = ByteBuffer.allocate(byteStr.length);
		
		try (FileChannel canal = FileChannel.open(destino, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			int i = 0;
			while(i < byteStr.length) {
				int capacity = Math.min(buffer.capacity(), byteStr.length - i);
				buffer.put(byteStr, i, capacity);
				
				buffer.flip();
				canal.write(buffer);
				buffer.clear();
				System.out.println(i);
				i = capacity + i;
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
