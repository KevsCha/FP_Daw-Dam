package personalizado;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path ruta = Path.of("rutas.txt");
		Path destino = Path.of("rutas_alta.txt");
		//RutaReord rutaRecord = new RutaRecord(null, null, null, 0, 0);

		
		try (Stream<String> lines = Files.lines(ruta, StandardCharsets.UTF_8)){
			
			List<Ruta> listaRuta = lines.map(x -> {
				String[] a = x.split(";");
				return new Ruta(a[0], a[1], a[2], Double.parseDouble(a[3]) , Integer.parseInt(a[4]));
			}).collect(Collectors.toList());
			
			
			listaRuta.stream()
						.filter(Ruta::esAltaLarga)
						.sorted(Comparator.comparing(Ruta::getNombre))//Para comparar utilizamos el comparator
						.forEach(x -> System.out.println("[Nombre: " + x.getNombre() + ", Provincia: "+ x.getProvincia() +"]"));
			
			double distanciaMedia = listaRuta.stream()
									.mapToDouble(x -> x.getDistancia())
									.average().orElse(-1);  
			System.out.println("Distancia media: " + distanciaMedia);
			
			
			int desnivelMaximo = listaRuta.stream()
								.mapToInt(x -> x.getDesnivel())
								.max().orElse(-1);
			System.out.println("Desnivel Maximo: " + desnivelMaximo);
			
			
			Map<String, Long> rutasPorProvincia =  listaRuta.stream()
														.collect(Collectors.groupingBy(
																	Ruta::getProvincia, 
																	Collectors.counting()));
			
			rutasPorProvincia.forEach((x, y) -> System.out.println("[Provincia: " + x +", Cantidad: " + y +"]"));
			
			lines.forEach(System.out::println);
			
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
