package bloque_2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejercicio_1 {

	//Ejercicio 1 2da parte
	//1.Escritura básica: Escribe la cadena "Hola Mundo NIO" en un archivo usando un ByteBuffer y un FileChannel
	public static void main(String[] args) {
		Path ruta = Path.of("hola_nio.txt");
		String str = "Hola Mundo NIO";
		byte[] byteTexto = str.getBytes(StandardCharsets.UTF_8);
		
		ByteBuffer miBuffer = ByteBuffer.allocate(byteTexto.length);
		
		miBuffer.put(byteTexto);
		
		miBuffer.flip();
		
		try (FileChannel canal = FileChannel.open(ruta, StandardOpenOption.CREATE, StandardOpenOption.WRITE)){
			canal.write(miBuffer);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
