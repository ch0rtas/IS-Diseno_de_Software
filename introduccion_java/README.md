# Apuntes para Aprender Java 🚀

En este documento voy a organizar y estructurar mi aprendizaje de Java desde cero. A continuación, incluyo la estructura completa que seguiré para estudiar todos los aspectos fundamentales y avanzados de Java. Cada sección será detallada y desarrollada de forma progresiva. ¡Vamos allá!

---

## 1. Introducción a Java 🌱
- 1.1 Historia de Java
- 1.2 Instalación de Java (JDK, IDEs)
- 1.3 Estructura básica de un programa en Java
- 1.4 Primer programa en Java: "Hola, Mundo"

## 2. Tipos de Datos 🧑‍💻
- 2.1 Tipos primitivos
    - `int`, `short`, `long`, `byte`
    - `float`, `double`
    - `char`, `boolean`
- 2.2 Tipos no primitivos
    - `String`
    - Arrays
    - Clases envolventes (Wrapper Classes)

## 3. Operadores ➗
- 3.1 Operadores aritméticos
- 3.2 Operadores relacionales
- 3.3 Operadores lógicos
- 3.4 Operadores de asignación
- 3.5 Operadores de incremento y decremento

## 4. Control de Flujo 🔄
- 4.1 Estructuras condicionales
    - `if`, `else`, `else if`
    - `switch`
- 4.2 Estructuras de bucles
    - `for`, `while`, `do-while`
- 4.3 Uso de `break` y `continue` en bucles

## 5. Funciones y Métodos 🧩
- 5.1 Definición y uso de métodos
- 5.2 Métodos con parámetros y valores de retorno
- 5.3 Sobrecarga de métodos
- 5.4 Paso de parámetros por valor y referencia

## 6. Clases y Objetos 🏠
- 6.1 Definición de clases
- 6.2 Creación y uso de objetos
- 6.3 Atributos y métodos de clase
- 6.4 Constructores
- 6.5 Modificadores de acceso: `public`, `private`, `protected`
- 6.6 `this` y `super`

## 7. Encapsulamiento y Abstracción 🔒
- 7.1 Propósito y uso del encapsulamiento
- 7.2 Métodos `getter` y `setter`
- 7.3 Clases abstractas
- 7.4 Interfaces

## 8. Herencia y Polimorfismo 🔄
- 8.1 Herencia en Java
    - Uso de `extends`
    - Sobrescritura de métodos (override)
- 8.2 Polimorfismo
    - Sobrecarga de métodos (overload)
    - Polimorfismo en tiempo de ejecución (runtime polymorphism)

## 9. Manejo de Excepciones ⚠️
- 9.1 Introducción a las excepciones
- 9.2 Estructura `try-catch-finally`
- 9.3 Excepciones personalizadas
- 9.4 `throw` y `throws`

## 10. Colecciones 🗃️
- 10.1 Arrays
- 10.2 Listas (`ArrayList`)
- 10.3 Conjuntos (`HashSet`, `TreeSet`)
- 10.4 Mapas (`HashMap`, `TreeMap`)
- 10.5 Iteradores

## 11. Entrada y Salida de Datos ⬅️➡️
- 11.1 Lectura de datos desde la consola (`Scanner`)
- 11.2 Escritura de datos en la consola
- 11.3 Archivos (lectura/escritura con `File`, `FileReader`, `BufferedReader`, `FileWriter`)

## 12. Programación Orientada a Objetos (POO) Avanzada 🧠
- 12.1 Composición vs. Herencia
- 12.2 Clases internas y anónimas
- 12.3 Uso de `final` en clases, métodos y variables
- 12.4 Clases y métodos estáticos

## 13. Hilos y Concurrencia ⚡
- 13.1 Introducción a los hilos
- 13.2 Crear hilos con `Thread` y `Runnable`
- 13.3 Sincronización de hilos
- 13.4 Uso de `ExecutorService`

## 14. API de Java y Bibliotecas Comunes 📚
- 14.1 Biblioteca estándar de Java
- 14.2 Uso de `java.util` y `java.time`
- 14.3 Operaciones con cadenas y fechas
- 14.4 Clases utilitarias (`Collections`, `Arrays`)

## 15. Conceptos Avanzados 🔮
- 15.1 Reflexión en Java
- 15.2 Generics
- 15.3 Java 8 y nuevas características (Streams, Lambdas, etc.)


---

---

---



# 1. Introducción a Java 🌱

---

## 1.1 Historia de Java

Java es un lenguaje de programación que fue desarrollado originalmente por James Gosling y su equipo en Sun Microsystems, en 1991. El objetivo inicial era crear un lenguaje de programación independiente de la plataforma y con enfoque en la portabilidad, por lo que se desarrolló bajo el lema "Write Once, Run Anywhere" (WORA). Esto significa que, una vez que se escribe un programa en Java, puede ejecutarse en cualquier dispositivo que tenga instalada la máquina virtual de Java (JVM), sin importar el sistema operativo subyacente.

En 1995, Java fue lanzado oficialmente y se convirtió rápidamente en uno de los lenguajes más populares debido a su robustez, seguridad y la facilidad de uso en entornos de red. Con el tiempo, Java pasó a ser usado en una variedad de aplicaciones, desde servidores y aplicaciones empresariales hasta dispositivos móviles.

En 2010, Oracle adquirió Sun Microsystems, lo que llevó a Oracle a tomar el control del desarrollo de Java. Desde entonces, Java ha evolucionado constantemente con nuevas versiones y características, mejorando su rendimiento y seguridad.

---

## 1.2 Instalación de Java (JDK, IDEs)

### JDK (Java Development Kit)

Para empezar a programar en Java, necesitamos instalar el **JDK**. Este es el kit de desarrollo que incluye todo lo necesario para compilar y ejecutar programas Java. El JDK contiene el **JRE** (Java Runtime Environment), la JVM (Java Virtual Machine) y varias herramientas útiles como el compilador `javac` y el depurador `jdb`.

### Pasos para instalar el JDK:
1. **Descargar el JDK**: Ve a la página oficial de Oracle (o OpenJDK) y descarga la versión más reciente del JDK para tu sistema operativo.
2. **Instalar el JDK**: Sigue las instrucciones de instalación proporcionadas en el sitio web para tu sistema operativo (Windows, macOS, Linux).
3. **Verificar la instalación**: Abre una terminal o línea de comandos y ejecuta el comando `java -version` para verificar que la instalación fue exitosa.

### IDEs (Entornos de Desarrollo Integrados)

Existen varios IDEs que facilitan la programación en Java, con características como autocompletado de código, depuración, y soporte para proyectos grandes. Algunos de los más populares incluyen:

- **IntelliJ IDEA**: Uno de los IDEs más potentes y populares para Java, conocido por su excelente soporte para el desarrollo y depuración.
- **Eclipse**: Un IDE ampliamente utilizado en la comunidad Java, especialmente en entornos empresariales.
- **NetBeans**: IDE de código abierto que ofrece un soporte sólido para Java, aunque menos popular que Eclipse o IntelliJ.

---

## 1.3 Estructura básica de un programa en Java

Un programa en Java se organiza en clases y métodos. La estructura más básica de un programa en Java se ve de la siguiente manera:

```java
public class MiPrimerPrograma {
    public static void main(String[] args) {
        System.out.println("Hola, Mundo!");
    }
}
```

### Explicación de la estructura:
- **`public class MiPrimerPrograma`**: Define una clase llamada `MiPrimerPrograma`. En Java, todo el código debe estar contenido dentro de una clase.
- **`public static void main(String[] args)`**: Este es el método principal, el punto de entrada de un programa en Java. La JVM busca este método para comenzar la ejecución del programa. El modificador `public` indica que el método es accesible desde cualquier lugar, `static` significa que no es necesario crear una instancia de la clase para llamarlo, y `void` significa que no devuelve ningún valor.
- **`System.out.println("Hola, Mundo!");`**: Esta línea imprime el texto "Hola, Mundo!" en la consola. `System.out` es el flujo estándar de salida, y `println` es un método que permite imprimir texto seguido de un salto de línea.

---

## 1.4 Primer programa en Java: "Hola, Mundo"

Vamos a escribir y ejecutar el primer programa básico en Java: "Hola, Mundo".

### Pasos:
1. **Escribe el código**: Abre tu IDE o un editor de texto, y escribe el siguiente código:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, Mundo!");
    }
}
```

2. **Guardar el archivo**: Guarda el archivo con el nombre `HolaMundo.java`. Es importante que el nombre del archivo coincida con el nombre de la clase pública.

3. **Compilar el programa**: Si estás usando un editor de texto, abre una terminal y navega hasta la carpeta donde guardaste el archivo. Luego, ejecuta el siguiente comando para compilar el programa:
   ```
   javac HolaMundo.java
   ```
   Esto generará un archivo `HolaMundo.class`, que es el archivo de bytecode que la JVM puede ejecutar.

4. **Ejecutar el programa**: Una vez compilado el programa, ejecuta el siguiente comando para ver el resultado:
   ```
   java HolaMundo
   ```

Verás que la consola imprime: `Hola, Mundo!`.

Este es el primer paso en tu viaje para aprender Java. A medida que avanzamos, podrás crear programas más complejos y explorar nuevas características del lenguaje.

---

---

---

