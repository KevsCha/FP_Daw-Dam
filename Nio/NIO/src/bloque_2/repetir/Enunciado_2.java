package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Enunciado_2 {

	public static void main(String[] args) {
		Path ruta = Path.of("productos_bom.txt");
		ByteBuffer bufferBOM = ByteBuffer.allocate(3);
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		try(FileChannel canal = FileChannel.open(ruta, StandardOpenOption.READ)) {
			//Lee los 3 primeros bytes
			canal.read(bufferBOM);
			bufferBOM.flip();
			if (bufferBOM.remaining() == 3 &&
					(bufferBOM.get() & 0xFF) == 0xEF &&
					(bufferBOM.get() & 0xFF) == 0xBB &&
					(bufferBOM.get() & 0xFF) == 0xBF
				) {
				canal.position(3);
			}else {
				canal.position(0);
			}
			int contador = 0;
			while (canal.read(buffer) != -1) {
				buffer.flip();
				while (buffer.hasRemaining()) {
					byte auxByte = buffer.get(); 
					if (auxByte >= 'A' && auxByte <= 'Z')
						contador++;
				}
				buffer.clear();
			}
			
			System.out.println("Caracteres Mayuscula en todo el fichero: " + contador);
			canal.position(0);
			long contadorLong = 0;
			while(canal.read(buffer) != -1) {
				buffer.flip();
				byte[] byteStr = new byte[buffer.remaining()];
				buffer.get(byteStr);
				
				String auxStr = new String(byteStr, StandardCharsets.UTF_8);
				
				contadorLong += auxStr.chars().filter(c -> c >= 'A' && c <= 'Z').count();
				buffer.clear();
			}
				
			
			System.out.println("Caracteres Mayuscula en todo el fichero: " + contadorLong);
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
