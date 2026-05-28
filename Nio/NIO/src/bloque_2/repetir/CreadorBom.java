package bloque_2.repetir;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CreadorBom {
	public static void main(String[] args) {
        Path ruta = Path.of("productos_bom.txt");

        // Abrimos el canal para crear el archivo desde cero
        try (FileChannel canal = FileChannel.open(ruta, 
                StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {
            
            // ========================================================
            // PASO 1: INYECTAMOS EL BOM REAL (3 BYTES INVISIBLES)
            // ========================================================
            ByteBuffer bufferBOM = ByteBuffer.allocate(3);
            bufferBOM.put((byte) 0xEF);
            bufferBOM.put((byte) 0xBB);
            bufferBOM.put((byte) 0xBF);
            
            bufferBOM.flip(); // Modo lectura para el canal
            canal.write(bufferBOM); // Se escriben los 3 bytes al inicio del archivo

            // ========================================================
            // PASO 2: ESCRIBIMOS EL TEXTO DEL ENUNCIADO
            // ========================================================
            String textoGenuino = "A14X\n" +
                                  "b92M\n" +
                                  "C78K\n" +
                                  "H55P\n" +
                                  "m31W\n" +
                                  "Z00A\n" +
                                  "k12L\n" +
                                  "R89X";

            // Convertimos el texto a bytes normales UTF-8
            ByteBuffer bufferTexto = ByteBuffer.wrap(textoGenuino.getBytes(StandardCharsets.UTF_8));
            canal.write(bufferTexto);

            System.out.println("¡Archivo 'productos_bom.txt' creado con BOM real!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
