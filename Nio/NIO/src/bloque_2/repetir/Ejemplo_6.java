package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejemplo_6 {
	public static void main(String[] args) {
		Path ruta = Path.of("save_E6.txt");
		
		int a = 43;
		double b = 166.97;
		long c = 4534543L; 
		
		
		ByteBuffer buffer = ByteBuffer.allocate(20);
		
		buffer.putInt(a);
		buffer.putDouble(b);
		buffer.putLong(c);
		
		buffer.flip();
		
		try (FileChannel canal = FileChannel.open(ruta, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.APPEND)){
			//canal.write(buffer);
			int i = 0; 
			while (buffer.hasRemaining()) {
                canal.write(buffer);
            }
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
