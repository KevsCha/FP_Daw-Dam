
## **Básicos**

 	- FileReader("nombre.txt"); --> puedo leer un fichero

 		·  Crear una clase de tipo FileReader, inicializar en NULL

 		·  Luego instanciar el FileReader con "new FileReader("nombre.txt");"

 		·  métodos de lectura del objeto --> .read (hay 4 buscar para que sirven los métodos )

 		·  Devuelve el numero de caracteres leídos



 	- FileWrite("characteroutput.txt"); --> puedo escribir un fichero

 		· si el argumento (***nombre del fichero***) pasado a la clase existe... se sobrescribe y se pierde los datos del fichero q existía

 		· si existe y quieres añadir mas cosas debes pasarlo un segundo argumento --> ***TRUE***

 		· si no existe crear el fichero con el nombre que le pasas

 		· ver el tipo de ***CONSTRUCTORES*** que tiene y los ***METODOS***



## **Avanzado**

* **BufferedReader(FileReader("nombre.txt")) --> leer por lineas**

  **·** Si quieres leer un archivo de linea en línea se usa esta clase.

   	· Te duelve un String (la linea leida)

   	· Se lo inicializa el tipo de dato con null y luego se instancia el mismo tipo con **--> new BufferedReader**

* **PrintWriter**

   	**·** Escribe en el fichero **--> *BUSCAR***

  

  Trabajar con texto: También se puede usar scanner para trabajar para leer ficheros

   	--> EJEMPLO: s = *new Scanner(new BufferedReader(new FileReader("fichero.txt")));*

  

  **DECIMALES:** Para controlar el formato de cuantos decimales quiero que salga... se puede hacer con

   	--> EJEMPLO: *System.out.format("The square root of ");*

   	· **BUSCAR FORMAT CON SUS LETRAS Y SIGNIFICADO**

  ## 

  ## **Ficheros binarios**

  

  Para leer tipos primitivos -->

  y para leer cadenas de texto (STRING) -->

  

   	· Metodos: ***DataOutputStream*** y ***DataInputStream***

  

  \*\*\*--> iniciarlos con null\*\*\*

  	--> EJEMPLO: out = new DataOutputStream(new BufferedOutputStream(dataFile));
  

   	· Metodos:

   		- out.writeDouble(prices\[i]);

   		- out.writeInt();

   		- out.write()

   	--> EJEMPLO: in = new DataInputStream(new BufferedInputStream(dataFile));

   	· Metodos:

   		- in.readInt();

   		- in.readDouble();

   		- in.readUTF();

  &nbsp;	

  -------------------------------------------------------------------------------------------

  #### ***Tarea:***

  Crear una app para añadir un objeto a un fichero de objetos (no sobreescribir sino añadir)

  ejecutar 2 veces para comprobar que añade --> habrá 2 objetos

  &nbsp;	- Otra app que lea esos objs del fichero y lo saque x pantalla

  si salta un error:

  &nbsp;	- Averiguar xq

  &nbsp;	- Como solucionar

  -------------------------------------------------------------------------------------------

  

  

  

  
## ***APi_Stream***


Si quieres trabajar con estas operaciones (intermedias) es necesario convertirlos a streams
Los streams se podrian entender como una cinta transportadora, en la cual se pasan los elementos uno a uno haciendo que pase por alguna operacion, una vez que termina la operacion sigue con la otra operacion y asi sucesivamente hasta que pasa al siguiente elemento, asi con todos los elementos
*Operacion que son la excepcion a esta metafora*
- sorted()
- disctinct()
- limit()
- skip (n)

- Operaciones Intermedias (Transformación)
Dos conceptos: Stateless(sin estado) vs Stateful(con estado)

  - *filter()*: Deja pasar solo los elementos que cumplen la condición.
      --> usa un **Predicate<T>** =  t -> boolean __recibe un argumento y devuelve un boolean__
  - *map()*: Transforma cada elemento en otra cosa.
      --> Usa una **Function<T,R>** = t -> r __Recibe <T> y devuelve <R>__
      **Variantes**
      Se utilizan, __mapToInt, mapToLong y mapToDouble__ por el rendimiento y eficiencia de memoria mientras que __MAP__ solo trabaja con *Objetos*
      *Cuando Usarlos...???*
        Realizar calculos matematicos, cuando sabes que los valores que manejas son 100% numeros y necesita hacer __.sum(), .average(), .max(), .min().__
      *Que pasa si hay nulos dentro del Stream-Integer...?*
        Cuando utilizamos List<Integer>... este tipo de coleccion a diferencia de un dato primitivo si acepta nulos y si se intenta hacer un mapToInt podria ocurrir un **nullPointerException** tenemos dos formas de manejar este escenario.
        - filter: Utilizar *.filter(Objects::nonNull)* si es null, lo saca de la cinta y no hace que pasa al siguiente proceso
        - mapToInt: Convertir los nulos a 0 *.mapToInt(n -> (n == null) ? 0 : n)*, ahora en la cinta pasan la MISMA CANTIDAD DE ELEMENTOS que en la lista original, es decir que no se ignoro a ninguna, esto nos sirve si necesitamos contar todos los elementos del stream con *.count()*.

      *Curioso...*
      Map.of(...), no acepta valores nulos, automanticamente te lanza __NullPointerException__

  - *flatMap()*: "Aplana" estructuras. Si tiene una lista de listas, las convierte en una sola lista simple.
      --> Usa una **Fuction<T, Stream<R>>** = t -> stream __Devuelve un stream__     
  - *sorted()*: Ordena los elementos.
      --> Usa una **Comparator<T>** (t1, t2) -> int __Recibe 2 elemento y devuelve +Positivo, -Negativo o 0__
      El stream se "detiene" y empieza a ordenar todos los elementos y luego pasa todo ese resultado ya **ordenado** como un stream al siguiente proceso

  - *distinct()*: Elimina duplicados.
      --> NO USA NADA **SOLO USA equals y hascode**
      El stream se "detiene" y empieza a ver si hay elmentos duplicados, una vez que termina de verificar que no hay otros elementos duplicados, devuelve un STREAM con todos los duplicados quitados y asi pasan al siguiente proceso

  - *limit(n)*: Pasan los n elementos que indiques
      --> Lo que hace es que solo permite pasar a los primeros __n__ elementos que le digas y el resto no los deja pasara al resto de operaciones
  - *skip(n)*: Recorta el stream o se salta los primeros elementos.
      --> Los primero __n__ elementos pasan y los tira a la "basura" y trabaja con el resto que sobra.

- Operaciones Terminales (Resultado)
  - *forEach(Consumer)*: Itera.
      --> Usa un **Consumer<T>** = t -> void __Recibe T y no devuelve nada__
  - *count()*: Devuelve el número de elementos.
      --> NO USA NADA  **_** __es operacion terminal por lo cual solo cuenta los que pasaron los "filtros" de los de arriba (operaciones intermedias)__
  - *reduce()*: Combina todos los elementos en uno solo (por ejemplo, sumar todos los valores).
      --> Usa un **BinaryOperator<T>** = (t1, t2) -> t __Toma los dos elementos y los combina en uno__   __a a c3da 3da c3d cadda  cadj cdjcdj3 --> Mi gata africa RAAAAAARW__ 
      Devuelve un Optional 


      
  - *anyMatch / allMatch*:  Verifican condiciones
      --> Usa un **Predicate<T>** = t -> boolean __Igual que el filter, pero devuelve un resultado final boolean.__
  - *findFirst() / findAny()*: Devuelven un Optional.
      --> NO USA NADA **_** __Devuelven un Optional<T> con el primer elemento que encuentran.__
  - *collect(Collectors...)*: Convierte el stream de nuevo a una colección (toList(), toSet())
      --> Usa un **Collector** = unaVariable __Normalmente usas métodos de la clase Collectors (como toList()).__
  

    *Metodos Extras*
    - .filter(x -> IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(d -> x % d == 0))
        - IntStream = Me crea una cinta transportadora que maneja enteros (int)
        - rangeClosed(inicio, final) = un metodo que me crea una lista de numeros con rango de _inicio_ hasta _final_
        - noneMatch = en este caso toma los numero uno x uno de la cinta creada con rangeClosed y va haciendo la comprobacion  con el **x** del filter
  

  ## ***Estructura de datos***

  La estructura de datos es una forma de organizar, gestionar y almacenar datos en la memoria de la computadora para que puedan ser utilizados de manera eficiente.
  Cuando se habla de una coleccion de datos se refiere a todo objeto que agrupra multiples elementos.
  
  - Coleccion de datos vienen incluidos todas estas interfaces(set,map,list) e implementeacions(ArrayList, hashset,hashmap, etc)
  - Collection Framework --> aqui se inclueyen de manera teorica todos estos conceptos
  - Collection interface --> **aqui no se incluye a los Map**

  **DATO CURIOSO**
    "¿Map hereda de Collection?" -> La respuesta es NO.
    "¿Map es parte del Java Collections Framework?" -> La respuesta es SÍ.


  ------
  ### 3 Pilares de una estrutura de datos
    Para entenderlas a fondo, piensa que cada estructura se define por tres cosas:

        - Organización: Cómo se agrupan los datos (¿están uno al lado del otro? ¿están conectados por flechas? ¿están dispersos?).
        como organizan sus datos los diferentes tipos (list, sets, maps, arrays)

        - Operaciones: Qué puedes hacer con ellos (Insertar, Eliminar, Buscar, Recorrer).

        - Algoritmos: La lógica interna que usa la estructura para gestionar esas operaciones (por ejemplo, cómo decide un HashMap dónde guardar una clave).
        Como funcionan por dentro

  ### Estructuras Lineales
        Los datos se organizan de forma secuencial, uno tras otro. Es el modelo más sencillo de entender.
        Ejemplos: Arreglos (Arrays), Listas Enlazadas (LinkedList), Pilas (Stacks) y Colas (Queues).

        Uno tras otro: [valor] -> [valor] -> [Valor] 
    
    Tipos:
    **List<>/Listas**
    List<> -> interfaz y tiene muchas formas de implementarlo, __ArrayList<>, LinkedList<>__ .

    Arrays String[] array = new String[3];
    Interfaz List<t> para __ArrayList<>() y LinkedList<>()__
        ArrayList	List<T> lista = __new ArrayList<>();__ --> *La más usada: rápida para leer datos*
        LinkedList	List<T> lista = __new LinkedList<>();__ --> *Mejor si vas a insertar/eliminar mucho en medio de la lista*
                    List<T> lista = __List.of("Java", "Python", "C++");__ --> *Crear una lista con datos iniciales (Inmutable - Java 9+)*

    *Iniciarlizar con valores*
    List<String> lista = **List.of("A", "B", "C");** --> inmutable
    List<String> lista = **new ArrayList<>(Arrays.asList("A", "B", "C"));** --> mutable
    List<String> lista = **new ArrayList<>(List.of("A", "B", "C"));** --> mutable y moderna


    Stack: modelo **LIFO** ultimo en entrar, primero en salir
        Stack<String> pila = new Stack<>();
    Stack: modelo **FIFO** Primero en entrar, primero en salir
        Queue<String> cola = new LinkedList<>() --> implementa LinkedList
    


  ### Estructuras no lineales
    Los datos se organizan de forma jerárquica o interconectada. No hay un "primero" y "último" claro en una sola línea.

    Árboles (Trees): Como el sistema de carpetas de tu computadora. Hay una raíz y ramas.
    Grafos (Graphs): Como una red social o Google Maps. Puntos conectados entre sí sin un orden jerárquico fijo.

    Tipos:
    **Sets<>:/Conjuntos** Interfaz Set<E>, se utilza cuando no se quiere duplicados
    Tiene diferente formas de implementarlo, __HashSet, TreeSet, LinkedHasSet__
        Set<T> conjunto = __new HashSet<>();__ --> *La más rápida: no garantiza ningún orden*
        Set<E> arbol = __new TreeSet<>();__  --> *Mantiene los elementos ordenados (ej: alfabéticamente)*
        Set<String> conjunto3 = __new LinkedHashSet<>();__ --> *Mantiene el orden exacto en el que insertaste los elementos*

        
    *Iniciarlizar con valores*
    Set<Integer> miSet = **Set.of(1, 2, 3);** --> Inmutable
    Set<Integer> miSet = **new HashSet<>(List.of(1, 2, 3))** --> Mutable
    Set<Integer> miSet = **new TreeSet<>(List.of(3, 1, 2));** --> Mutable y ordenado Se guardará como 1, 2, 3

    **Maps<>/Mapas** Interfaz Map<K, V>, Almacena clave y valor
    Tiene diferentes formas de implementarlas, __HashMap, TreeMap, LinkeHashMap__
        Map<Integer, String> mapa1 = __new HashMap<>();__ --> *El estándar: muy rápido, sin orden específico*
        Map<Integer, String> mapa2 = __new TreeMap<>();__ --> *Ordena las claves de forma natural (1, 2, 3... o A, B, C...)*
        Map<Integer, String> mapa3 = __new LinkedHashMap<>();__ --> *Mantiene el orden de inserción de las claves*

    *Iniciarlizar con valores*, Mapa tiene 2 formas
    - Hasta 10 valores(Inmutable)
        Map<String, String> mapa = **Map.of("clave1", "valor1", "clave2", "valor2");**
    - Mas de 10 valores(inmutable)
        Map<Integer, String> mapa = **Map.ofEntries(Map.entry(1, "Uno"), Map.entry(2, "Dos"));**
    - Cualquier Tamaño (Mutable)
        Map<Integer, String> miMapa = **new HashMap<>(Map.of(1, "Uno", 2, "Dos"))** 

    
    PriorityQueue	Queue<T> cola = new PriorityQueue<>();

    ##### La importancia de elegir el tipo de estructura
  ´´´
  Es importante por: 
  En programación profesional, la diferencia entre una aplicación rápida y una lenta no suele ser el procesador, sino la elección de la estructura de datos.

    - Eficiencia de Tiempo: Si usas la estructura correcta, una búsqueda puede tardar milisegundos en lugar de segundos.
    - Eficiencia de Memoria: Algunas estructuras gastan más RAM para ser más rápidas, otras ahorran espacio pero son más lentas.
  ´´´

  


# ***Concurrencia - Java NIO***
La concurrencia es ejecutar otro proceso mientras espera la respuesta de otro proceso, normalmente solemos ver como un proceso se ejecuta y esperar su respuesta para contunuar con normalidad... esto no es tan practico en la vida real por que tendriamos que esperar una eternidad a una respuesta para seguir con otro proceso.

---

# ***JAVA NIO***

## Canales y buffers

Para entender Java NIO manejando buffers y canales debemos conocer cual es la estructura una estructura por ejemplo en JAVA NIO 2.0 usamos el la clase **Files** junto a sus metodos para la lectura o escritura de un fichero. Ejemplo de flujo:

1. Inicio: Declaramos variables path con la ruta o el nombre del archivo que queremos 
2. Files: entra en juego la clase **Files** junto a sus metodos 
3. If: verificamos la si el archivo existe con **Files.exists(ruta)** 
    - ___Si existe___, podemos empezar a escribir o consumir el fichero para la lectura, con **Files.lines()** --> Lectura por lineas o **Files.write()** --> tienes que pasarle una lista para que escriba.
    - ___No existe___, podemos crear el archivo con **Files.createFile()**

Es una manera muy resumida de describir el flujo pero va mas alla de eso por que es necesario conocer los diversos metodo que te proporciona **Files** para que puedas conocer todo el potencial

Ejemplo de codigo:

```
public static void main(String[] args) {
    // Rutas, se utiliza path y no un String 
        // - indepencia de sistema operativo
            // windows = C:\Users\proyecto
            // Linux o MacOs = /home/proyecto
        // Path ya lo gestiona 
		Path ruta = Path.of("notas.txt");
		Path saveE3 = Path.of("saveE3.txt");
		List<String> lista = null;
		
        //Quieres leer un archivo usas Files.lines() y te devuelve un Stream<String>
		try(Stream<String> lines =  Files.lines(ruta)) {
			
            //transformas el Stream de strings en una lista de strings, pasar de esto Stream<String> --> List<String>
            //xq ?? xq Files.write solo acepta una lista
			lista = lines.toList();
			System.out.println(lista);
            //Files.write() para escribir en un file
			Files.write(saveE3, lista, 
						StandardCharsets.UTF_8, 
						StandardOpenOption.TRUNCATE_EXISTING,
						StandardOpenOption.CREATE);
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}
```

Ahora una tabla que explica algunos de los Metodos de files junto a sus parametros.

| Parameter | Value    | 
| :-------- | :------- |
| `Files.createFile(Path ruta)` | El path es el nombre/ruta que se dara al archivo que se creara, tambien recibe otro parametro que es **FileAttribute<?>... attrs** que son los permisos con los que se creara el archivo, Retorna  un "Path"|
| `Files.lines(Path ruta)` | "ruta" es el archivo que consumira o leera para guardar toda la info en un **Stream<String>**|
| `Files.write(Path ruta, Iterable<? extends CharSequence> lines, OpenOption... options)` |
| ---> `Path ruta` | Ruta es el archivo en el cual hara la escritura de lo que se le pase en el segundo parametro |
| ---> `Iterable<? extends CharSequence> lines` | 2do parametro, Normalmente se le pasa una lista pero... xq una lista si el tipo es **Iterable** simplemente por que la interfaz **List<>** heredad de **Collection<>** que a su vez hereda de **Iterable<>** por esa razon se permite el lujo de que pasarle muchas colleciones |
|  ---> `OpenOption... options` | Tercer parametro Option, son las reglas o Standard que le das al archivo, el standard charset que le dices como quieres que escriba, UTF-8  |
| `Files.newBufferedReader(Path ruta)` | Abre el archivo en modo lectura devolviendo un BufferedReader. Es la forma óptima para leer archivos gigantes línea a línea mediante un bucle while, ya que utiliza un búfer intermedio en la memoria RAM para no saturarla. |
| `Files.newBufferedWriter(Path ruta, OpenOption... options) ` ||
| ---> `Path ruta`| La ubicación del archivo donde el buffer irá guardando la información. |
| ---> `OpenOption... options`| Especifica el comportamiento de apertura del archivo (por defecto, si no pones nada, sobrescribe el archivo o lo crea si no existe) |
| `Files.copy(Path origen, Path destino, CopyOption... options)`||
| ---> `Path origen` | La ruta del archivo que ya existe y que quieres duplicar. |
| ---> `Path destino` |La ruta objetivo donde se creará la copia del archivo. |
| ---> `CopyOption... options` | Reglas para la copia. La más usada es StandardCopyOption.REPLACE_EXISTING, que obliga a machacar el archivo de destino si ya existía uno con ese nombre. |
| `Files.move(Path origen, Path destino, CopyOption... options)`||
| ---> `Path origen` | La ruta actual del archivo que quieres **mover** o **renombrar**. |
| ---> `Path destino` | La **nueva ubicación** o el **nuevo nombre** que tendrá el archivo. |
| ---> `CopyOption... options` | Opciones de movimiento, como REPLACE_EXISTING para sobrescribir en el destino o ATOMIC_MOVE para asegurar que la operación se haga en un solo paso indivisible a nivel de sistema operativo| 
| `Files.exists(Path ruta, LinkOption... options)` | |
| ---> `Path ruta` | La dirección del archivo o directorio que se quiere verificar. |
| ---> `LinkOption... options` | Define cómo manejar los enlaces simbólicos (accesos directos). Por defecto, si encuentra un enlace, comprueba si el archivo real al que apunta existe. Si usas NOFOLLOW_LINKS, solo comprueba el enlace en sí. |

## Buffers y Channels

El flujo para estructurar NIO con buffers y channels puede ser el siguiente:

### Tenemos 3 casos:
- Leer de un archivo (file.txt)
- Leer de string o lista de strings dentro del codigo(Harcodeo)
- Leer desde la consola, el usuario introduce valores

### Flujo
- **Path**: archivo donde haras la lectura o donde quieres escribir
- **FileChannel**: Abrir el canal con sus respectivas standares, como por ejemplo 
    - FileChannel escribir = FileChannel.open(destino, StandardOpenOption.WRITE, StandardOpenOption.CREATE)
    - FileChannel lectura = FileChannel.open(origen, StandardOpenOption.READ, StandardOpenOption.CREATE)
    - FileChannel ambas = FileChannel.open(origen, StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)
    - Si quieres abrirlos por separado... dentro del try (escribe ambos(el de escribir y lectura) y separalos con ";")
        - try (FileChannel escribir = FileChannel.open(destino, StandardOpenOption.WRITE, StandardOpenOption.CREATE) **;** FileChannel lectura = FileChannel.open(origen, StandardOpenOption.READ, StandardOpenOption.CREATE))
- **Array** de byte: Si se trata de un string debes obtener sus bytes, asi: --> string.getBytes(StandardCharsets.UTF-8);
    - Esto se hace por que al trabajar a bajo nivel el sistema solo entiende en byte y estamos preparando la info para que la maquina lo pueda entender, es decir todo lo del String(caracteres) a sus equivalentes a tabla ascii, H = 72, h = 104... todos los caracteres tienen un valor en ascii
- **ByteBuffered**: Preparar el almacenamiento de memoria para esa informacion que convertimos anteriormente en bytes 
- Si se trabaja con un string dentro del codigo o el enunciado te dice que trabajes con strings y no con un fichero externo para sacar la info se sigue el siguiente patron:
    - Crear un array de byte **byte[] byteString**
    - A este array de byte se le da pasa el string pero en lo valores Ascii que mencionamos antes -->  **byte[] byteString = texto.getBytes(StandardCharsets.UTF_8)**
        - Se veria de la siguiente manera: 

        ``` codigo
        String str = "hola";
        byte[] byteStr = str.getByte(StandardCharsets.UTF_8);
        ```
        - Visualmente se veria algo asi:
        ```
        String str = "Hola";
        byte[] byteStr = str.getByte(StandardCharsets.UTF_8);

        byteStr = 🔳🔳🔳🔳
        // Crea un array de byte del mismo tamaña del texto... en este caso 4, pero con otros valores --> valores en ascii
        byteStr = |7️⃣2️⃣|, |1️⃣1️⃣1️⃣|, |1️⃣0️⃣8️⃣|, |9️⃣7️⃣| 
        ```
            
        - No es necesario pero si quieres mirar la tabla ascii te dejo un link: - [@Tabla Ascii](https://elcodigoascii.com.ar/)
        - Los valores basicos son desde 0 al 127. Los demas son otro formato aparte de UTF_8 ... CREO ojito 
    - Luego de crear el contenerdor de los bytes(array de bytes) se crea al que los tranporta y les facilita la comunicacion con el canal --> **ByteBuffered**

Hasta este punto tienes que separar en dos conceptos, si utlizamos otro fichero para leer, no necesitamos el **byte[]** y solo utilizamos el siguiente proceso, en caso que sea solo sacar informacion de un **fichero** 

- Ruta 
    - --> **Path archivoLetura**
- Crear el ByteBuffered con la memoria segun te indique el enunciado
    - --> **ByteBuffered buffer = ByteBuffered.allocate(1024)**;
- Abrir el canal para lectura dentro del try () 
    - --> **try (FileChannel canal = FileChannel.open(origen, StandardOpenOption.READ));**
- Si queremos consumir el archivo (canal abierto en el try), lo hacemos con un bucle
    - --> **while (canal.read(buffer) != -1)**
        - .read no retorna un enterno que no indica 3 cosas 
        - positivo, la cantidad de byte que leyo
        - 0, que el buffer esta lleno o no leyo nada__
        - -1, que termino de leer todo el archivo, por eso la condicion de **-1** para que lea todo.
    - Otro punto importante, cuando hacemos **.read** y le pasamos el buffer vamos llenando el buffer y en el proceso recorremos la posicion en el cual incia el buffer, es decir...
        - el buffer tiene 3 caracteristica, **position, limit y capacity**
        - position, es la posicion del puntero
        - el limite al cual puede llegar, puede ser lo mismo que la capacidad pero no siempre y no puede superar a la capacidad.
        - Capacity, La memoria que reservamos para el buffer en el principio
    - Ejemplo el buffer empieza en asi:
    ```ByteBuffered

    ByteBuffer buffer = ByteBuffer.allocate(7);

    //Visualmente se veria algo asi

    buffer = ⏹️⏹️⏹️⏹️⏹️⏹️⏹️

        --> position = 0, Trabaja con indices
        --> limit = 7, no trabaja con indices
        --> capacity = 7
    ```
    - Cuando hacemos el **.read** leyendo de un archivo... lo que hace es que consume los byte necesarios para que quepa dentro del buffer, IMAGINA QUE TIENES UN TEXTO con lo siguiente.
    
    ``` txt
    Kevs quiere mucho a Africa :3
    ```
    - Los caracteres totales son 29 dentro del archivo y el .read solo puede consumir 7 por que es la capacidad maxima del buffer y para consumir todo el texto necesitaria dar unas 6 vueltas

    ```Java
    while (canalOrigen.read(buffer) != -1) {
        /*Aqui consume los primero 7 que serian "Kevs qu"
        Buffer pasa de esto 
        --> buffer = ⏹️⏹️⏹️⏹️⏹️⏹️⏹️
            --> position = 0
            --> limit = 7
            --> capacity = 7
        a
        --> buffer = "Kevs qu" 
        que en realidad serian bytes: 
        --> buffer = |75|, |101|, |118|, |115|, |32|, |113|, |117|
        Este buffer tiene indices desde el 0 al 6 = 7 bytes 
            --> position = 7, CAMBIA
            --> limit = 7, NO CAMBIA DE MOMENTO
            --> capacity = 7
        */
    }
    ```
    - Lo importante que quiero que te fijes es como cambia la position al momento de consumir info del archivo.
- Para reiniciar la posicion del puntero se utiliza **.flip** y lo convierte en modo lectura, es decir que el punter vuelve a ser  0
- Ahora podemos nuevamente recorrer el buffer pero esta vez con contenido 
    - ---> buffer = "Kevs qu"; o 
    - ---> buffer = |75|, |101|, |118|, |115|, |32|, |113|, |117|
    - La position(puntero) apunta a 0 que seria "K" o |75|
- 