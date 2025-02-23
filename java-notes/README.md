# Programación en Java 🚀

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

# 2. Tipos de Datos 🧑‍💻

## 2.1 Tipos Primitivos 🔢

En Java, los tipos primitivos son los bloques de construcción básicos para almacenar datos simples. Se dividen en cuatro categorías principales:

### 2.1.1 Números enteros
- **`int`**: Tipo entero más utilizado. Rango: -2,147,483,648 a 2,147,483,647.
- **`short`**: Menor en tamaño que `int`. Rango: -32,768 a 32,767.
- **`long`**: Para números muy grandes. Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807. Se indica con una `L` al final (e.g., `123456789L`).
- **`byte`**: Pequeño tipo entero para optimizar memoria. Rango: -128 a 127.

### 2.1.2 Números decimales
- **`float`**: Almacena números decimales con precisión simple. Se indica con una `f` al final (e.g., `3.14f`).
- **`double`**: Almacena números decimales con precisión doble. Es el tipo predeterminado para decimales.

### 2.1.3 Caracteres
- **`char`**: Almacena un único carácter Unicode (e.g., `'A'`, `'ñ'`). Entrecomillado simple.

### 2.1.4 Booleanos
- **`boolean`**: Solo puede almacenar los valores `true` o `false`.

---

## 2.2 Tipos No Primitivos 🧩

Estos tipos son más complejos y se basan en clases. Los tipos no primitivos incluyen objetos, cadenas, arrays, etc.

### 2.2.1 `String` (Cadenas de texto)
- Una **cadena** es un conjunto de caracteres almacenados como un objeto.
- Ejemplo:
  ```java
  String mensaje = "¡Hola, Mundo!";
  System.out.println(mensaje); // Imprime: ¡Hola, Mundo!
  ```

### 2.2.2 `Arrays` (Arreglos)
- Almacenan **múltiples** valores del mismo tipo en una estructura de tamaño fijo.
- Ejemplo:
  ```java
  int[] numeros = {1, 2, 3, 4, 5};
  System.out.println(numeros[0]); // Imprime: 1
  ```
  
### 2.2.3 `Clases envolventes` (Wrapper Classes)
- Permiten utilizar tipos primitivos como objetos.
- Ejemplo:
  ```java
  Integer numero = 10; // Clase envolvente para `int`
  Double decimal = 3.14; // Clase envolvente para `double`
  ```
> **Nota**: Las clases envolventes son útiles en colecciones como listas (ArrayList) que solo aceptan objetos.

---

## Resumen
- Los tipos primitivos son básicos y ligeros.
- Los tipos no primitivos son más avanzados y ofrecen funcionalidades adicionales.

---

---

---

# 3. Operadores ➗

Los operadores en Java son símbolos que realizan operaciones sobre uno o más operandos. A continuación, se describen los principales tipos de operadores:

## 3.1 Operadores Aritméticos ➕➖✖️➗

Los operadores aritméticos se utilizan para realizar operaciones matemáticas básicas:

- **Suma (`+`)**: Suma dos valores.
  ```java
  int a = 5, b = 3;
  System.out.println(a + b); // Imprime: 8
  ```

- **Resta (`-`)**: Resta el segundo valor del primero.
  ```java
  System.out.println(a - b); // Imprime: 2
  ```

- **Multiplicación (`*`)**: Multiplica dos valores.
  ```java
  System.out.println(a * b); // Imprime: 15
  ```

- **División (`/`)**: Divide el primer valor entre el segundo. Si ambos son enteros, el resultado será un entero.
  ```java
  System.out.println(a / b); // Imprime: 1 (división entera)
  ```

- **Módulo (`%`)**: Devuelve el resto de la división entre dos valores.
  ```java
  System.out.println(a % b); // Imprime: 2
  ```

---

## 3.2 Operadores Relacionales 🔍

Estos operadores comparan dos valores y devuelven un valor booleano (`true` o `false`):

- **Mayor que (`>`)**: Comprueba si el primer valor es mayor que el segundo.
  ```java
  //int a = 5, b = 3;
  System.out.println(a > b); // Imprime: true
  ```

- **Menor que (`<`)**: Comprueba si el primer valor es menor que el segundo.
  ```java
  System.out.println(a < b); // Imprime: false
  ```

- **Mayor o igual que (`>=`)**: Comprueba si el primer valor es mayor o igual al segundo.
  ```java
  System.out.println(a >= b); // Imprime: true
  ```

- **Menor o igual que (`<=`)**: Comprueba si el primer valor es menor o igual al segundo.
  ```java
  System.out.println(a <= b); // Imprime: false
  ```

- **Igual a (`==`)**: Comprueba si dos valores son iguales.
  ```java
  System.out.println(a == b); // Imprime: false
  ```

- **Distinto de (`!=`)**: Comprueba si dos valores son diferentes.
  ```java
  System.out.println(a != b); // Imprime: true
  ```

---

## 3.3 Operadores Lógicos 🤔

Se utilizan para combinar o invertir expresiones booleanas:

- **AND (`&&`)**: Devuelve `true` si ambas condiciones son `true`.
  ```java
  boolean x = true, y = false;
  System.out.println(x && y); // Imprime: false
  ```

- **OR (`||`)**: Devuelve `true` si al menos una de las condiciones es `true`.
  ```java
  System.out.println(x || y); // Imprime: true
  ```

- **NOT (`!`)**: Invierte el valor de una condición.
  ```java
  System.out.println(!x); // Imprime: false
  ```

---

## 3.4 Operadores de Asignación 🖊️

Se utilizan para asignar valores a variables:

- **Asignación simple (`=`)**: Asigna un valor a una variable.
  ```java
  int c = 10;
  ```

- **Asignación con operación**: Combina una operación con la asignación.
  - **`+=`**: Suma y asigna.
    ```java
    c += 5; // Equivale a c = c + 5;
    ```
  - **`-=`**: Resta y asigna.
    ```java
    c -= 3; // Equivale a c = c - 3;
    ```
  - **`*=`**: Multiplica y asigna.
    ```java
    c *= 2; // Equivale a c = c * 2;
    ```
  - **`/=`**: Divide y asigna.
    ```java
    c /= 4; // Equivale a c = c / 4;
    ```
  - **`%=`**: Calcula el módulo y asigna.
    ```java
    c %= 3; // Equivale a c = c % 3;
    ```

---

## 3.5 Operadores de Incremento y Decremento 🔼🔽

Se utilizan para aumentar o disminuir el valor de una variable en 1:

- **Incremento (`++`)**: Aumenta el valor en 1.
  - **Preincremento (`++x`)**: Incrementa antes de utilizar la variable.
    ```java
    int d = 5;
    System.out.println(++d); // Imprime: 6
    ```
  - **Postincremento (`x++`)**: Incrementa después de utilizar la variable.
    ```java
    System.out.println(d++); // Imprime: 6 (después d será 7)
    ```

- **Decremento (`--`)**: Disminuye el valor en 1.
  - **Predecremento (`--x`)**: Decrementa antes de utilizar la variable.
    ```java
    System.out.println(--d); // Imprime: 6
    ```
  - **Postdecremento (`x--`)**: Decrementa después de utilizar la variable.
    ```java
    System.out.println(d--); // Imprime: 6 (después d será 5)
    ```

---

**Resumen**
- Los **operadores aritméticos** permiten realizar cálculos matemáticos.
- Los **operadores relacionales** comparan valores.
- Los **operadores lógicos** combinan expresiones booleanas.
- Los **operadores de asignación** facilitan operaciones con valores y variables.
- Los **operadores de incremento y decremento** modifican rápidamente el valor de una variable.

---

---

---

# 4. Control de Flujo en Java 🔄

En este capítulo exploraremos cómo tomar decisiones y repetir tareas en Java usando estructuras de control de flujo. Aprenderemos sobre condicionales, bucles y cómo manejar el flujo con `break` y `continue`.

---

## 4.1 Estructuras Condicionales
### `if`, `else`, `else if`
La estructura condicional `if` nos permite ejecutar un bloque de código si una condición es verdadera. Podemos usar `else` para manejar el caso contrario y `else if` para múltiples condiciones.

```java
int numero = 10;

// Evaluamos si el número es positivo
if (numero > 0) {
    System.out.println("El número es positivo."); // Este bloque se ejecuta si numero > 0
} else if (numero == 0) {
    System.out.println("El número es cero."); // Este bloque se ejecuta si numero == 0
} else {
    System.out.println("El número es negativo."); // Este bloque se ejecuta si numero < 0
}
```

### `switch`
La sentencia `switch` evalúa una expresión y ejecuta el caso correspondiente. Es útil para manejar múltiples valores de una forma más limpia que `if-else` anidados.

```java
int dia = 3; // Representa el día de la semana (1 = Lunes, 2 = Martes, etc.)

switch (dia) {
    case 1:
        System.out.println("Lunes"); // Se ejecuta si dia == 1
        break; // Termina la ejecución del bloque
    case 2:
        System.out.println("Martes"); // Se ejecuta si dia == 2
        break;
    case 3:
        System.out.println("Miércoles"); // Se ejecuta si dia == 3
        break;
    default:
        System.out.println("Día no válido"); // Se ejecuta si dia no coincide con ningún caso
}
```

---

## 4.2 Estructuras de Bucles
### `for`
El bucle `for` es ideal cuando sabemos de antemano cuántas veces queremos iterar.

```java
// Imprime los números del 1 al 5
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i); // i comienza en 1 y aumenta en cada iteración hasta 5
}
```

### `while`
El bucle `while` ejecuta un bloque de código mientras la condición sea verdadera.

```java
int contador = 1;

// Imprime los números del 1 al 5
while (contador <= 5) {
    System.out.println("Número: " + contador); // Muestra el valor actual de contador
    contador++; // Incrementa el contador en cada iteración
}
```

### `do-while`
El bucle `do-while` asegura que el bloque de código se ejecute al menos una vez, incluso si la condición es falsa desde el principio.

```java
int numero = 6;

do {
    System.out.println("Número: " + numero); // Este bloque se ejecuta al menos una vez
    numero++;
} while (numero <= 5); // La condición se evalúa después de ejecutar el bloque
```

---

## 4.3 Uso de `break` y `continue` en Bucles
### `break`
La sentencia `break` termina el bucle actual de forma inmediata.

```java
// Busca el número 3 y termina el bucle cuando lo encuentra
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        System.out.println("Número encontrado: " + i); // Sale del bucle cuando i == 3
        break;
    }
    System.out.println("Número: " + i); // Se ejecuta mientras i no sea 3
}
```

### `continue`
La sentencia `continue` salta a la siguiente iteración del bucle, omitiendo el código restante del bloque.

```java
// Imprime los números del 1 al 5 excepto el 3
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Salta el resto del código en esta iteración cuando i == 3
    }
    System.out.println("Número: " + i); // Se ejecuta si i no es 3
}
```

---

**Resumen**
- Las estructuras condicionales como `if` y `switch` permiten tomar decisiones basadas en condiciones.
- Los bucles (`for`, `while`, `do-while`) permiten repetir código de manera eficiente.
- `break` y `continue` ofrecen control adicional dentro de los bucles para interrumpir o saltar iteraciones.

---

---

---

# 5. Funciones y Métodos en Java 🧩

En este capítulo aprenderás a crear, usar y comprender el funcionamiento de los métodos en Java, desde lo básico hasta conceptos avanzados como la sobrecarga de métodos y el paso de parámetros.

---

## 5.1 Definición y uso de métodos
Un método es un bloque de código que realiza una tarea específica y puede ser invocado desde otras partes del programa.

### Ejemplo básico de un método
```java
// Definimos un método que imprime un mensaje en la consola
public static void imprimirMensaje() {
    System.out.println("¡Hola desde un método!"); // Muestra un mensaje en la consola
}

public static void main(String[] args) {
    imprimirMensaje(); // Llamamos al método para ejecutarlo
}
```
**Explicación:**
- `public`: El método es accesible desde cualquier parte del programa.
- `static`: El método pertenece a la clase y no a una instancia específica.
- `void`: El método no retorna ningún valor.

---

## 5.2 Métodos con parámetros y valores de retorno
Podemos definir métodos que reciban parámetros y/o devuelvan un valor al ser ejecutados.

### Ejemplo: Método con parámetros
```java
// Método que suma dos números
public static void sumar(int a, int b) {
    int resultado = a + b; // Suma los valores de 'a' y 'b'
    System.out.println("La suma es: " + resultado); // Muestra el resultado
}

public static void main(String[] args) {
    sumar(5, 3); // Llamamos al método con los valores 5 y 3
}
```

### Ejemplo: Método con retorno de valor
```java
// Método que calcula el cuadrado de un número
public static int calcularCuadrado(int numero) {
    return numero * numero; // Devuelve el cuadrado del número
}

public static void main(String[] args) {
    int resultado = calcularCuadrado(4); // Almacenamos el resultado
    System.out.println("El cuadrado es: " + resultado); // Mostramos el resultado
}
```
> **Nota:** Un método puede tener múltiples parámetros y retornos de tipos específicos.

---

## 5.3 Sobrecarga de métodos
La sobrecarga permite definir varios métodos con el mismo nombre pero con diferentes parámetros.

### Ejemplo: Sobrecarga de métodos
```java
// Método para sumar dos números enteros
public static int sumar(int a, int b) {
    return a + b; // Retorna la suma de dos enteros
}

// Método para sumar dos números de tipo double
public static double sumar(double a, double b) {
    return a + b; // Retorna la suma de dos doubles
}

public static void main(String[] args) {
    System.out.println("Suma de enteros: " + sumar(3, 5)); // Llama al primer método
    System.out.println("Suma de doubles: " + sumar(2.5, 4.8)); // Llama al segundo método
}
```
> **Explicación:** El compilador decide cuál método invocar dependiendo del tipo y número de argumentos.

---

## 5.4 Paso de parámetros por valor y referencia
En Java, los parámetros se pasan por valor, lo que significa que se crea una copia del valor original. Sin embargo, los objetos funcionan de manera distinta.

### Paso por valor (tipos primitivos)
```java
public static void modificarValor(int numero) {
    numero = 10; // Cambia el valor local, no afecta el original
}

public static void main(String[] args) {
    int valor = 5;
    modificarValor(valor); // Pasa una copia del valor
    System.out.println("El valor después de modificar es: " + valor); // Sigue siendo 5
}
```

### Paso por referencia (objetos)
```java
class Persona {
    String nombre;
}

public static void cambiarNombre(Persona persona) {
    persona.nombre = "Carlos"; // Cambia el atributo del objeto original
}

public static void main(String[] args) {
    Persona persona = new Persona();
    persona.nombre = "Ana";
    cambiarNombre(persona); // Pasa la referencia del objeto
    System.out.println("El nombre después de cambiar es: " + persona.nombre); // Ahora es "Carlos"
}
```
> **Nota:** Aunque Java no permite el paso por referencia directo, los objetos funcionan como si lo fueran porque se manipulan sus referencias.

---

---

---

# 6. Clases y Objetos en Java 🏠

En este capítulo aprenderás sobre la programación orientada a objetos (OOP) en Java. Exploraremos conceptos clave como clases, objetos, atributos, métodos, constructores y modificadores de acceso.

---

## 6.1 Definición de Clases

Una **clase** es una plantilla que define atributos (datos) y métodos (funciones) para un tipo de objeto.

```java
// Definimos una clase llamada "Persona"
public class Persona {
    // Atributos de la clase
    String nombre;
    int edad;

    // Método de la clase
    void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre);
    }
}
```
> **Comentario:** La clase `Persona` tiene dos atributos (`nombre` y `edad`) y un método (`saludar`) que imprime un saludo en la consola.

---

## 6.2 Creación y Uso de Objetos

Un **objeto** es una instancia de una clase. Puedes crear objetos utilizando la palabra clave `new`.

```java
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Persona
        Persona persona1 = new Persona();

        // Asignamos valores a los atributos
        persona1.nombre = "Ana";
        persona1.edad = 25;

        // Usamos el método del objeto
        persona1.saludar(); // Llamamos al método "saludar" para mostrar el mensaje (¡Hola! Mi nombre es Ana)
    }
}
```
> **Comentario:** Creamos un objeto llamado `persona1`, asignamos valores a sus atributos (`nombre` y `edad`), y usamos su método `saludar`.

---

## 6.3 Atributos y Métodos de Clase

Los **atributos** y **métodos** pueden pertenecer a una instancia (objeto) o a la clase en general (usando `static`).

```java
public class Calculadora {
    // Método estático (pertenece a la clase)
    static int sumar(int a, int b) {
        return a + b; // Devuelve la suma de dos números
    }
}

public class Main {
    public static void main(String[] args) {
        // Llamamos al método "sumar" sin crear un objeto
        int resultado = Calculadora.sumar(5, 3);
        System.out.println("Resultado: " + resultado); // Muestra 8
    }
}
```
> **Comentario:** El método `sumar` es estático, por lo que podemos llamarlo directamente desde la clase sin crear un objeto.

---

## 6.4 Constructores

Un **constructor** es un método especial que se ejecuta cuando se crea un objeto. Sirve para inicializar los atributos.

```java
public class Persona {
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Asigna el valor recibido al atributo "nombre"
        this.edad = edad; // Asigna el valor recibido al atributo "edad"
    }

    void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto usando el constructor
        Persona persona1 = new Persona("Carlos", 30);
        persona1.saludar(); // Llama al método saludar
    }
}
```
> **Comentario:** El constructor inicializa los atributos `nombre` y `edad` cuando se crea un nuevo objeto de la clase `Persona`.

---

## 6.5 Modificadores de Acceso

Los **modificadores de acceso** controlan la visibilidad de los atributos y métodos. Los más comunes son:

- `public`: Accesible desde cualquier lugar.
- `private`: Accesible solo dentro de la clase.
- `protected`: Accesible dentro del paquete y por las subclases.

```java
public class Persona {
    private String nombre; // Solo accesible dentro de esta clase
    private int edad;

    // Métodos para acceder a los atributos privados (getters y setters)
    public String getNombre() {
        return nombre; // Devuelve el valor de "nombre"
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna un valor al atributo "nombre"
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Usamos los métodos para asignar y obtener valores
        persona.setNombre("Lucía");
        persona.setEdad(28);

        System.out.println("Nombre: " + persona.getNombre()); // Imprime Nombre: Lucía
        System.out.println("Edad: " + persona.getEdad()); // Imprime Edad: 28
    }
}
```
> **Comentario:** Los atributos `nombre` y `edad` son privados, pero podemos acceder a ellos usando los métodos `get` y `set`.

---

## 6.6 `this` y `super`

### `this`
La palabra clave `this` se usa para referirse al objeto actual.

```java
public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre; // Se refiere al atributo "nombre" de la clase
    }

    void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}
```
> **Comentario:** `this.nombre` distingue el atributo de la clase del parámetro del constructor.

### `super`
La palabra clave `super` se usa para referirse a la clase padre (superclase).

```java
// Clase padre Animal
public class Animal {
  // Método que imprime un sonido genérico de animal
  void hacerSonido() {
    System.out.println("Sonido genérico de animal"); // Este mensaje se imprimirá si se llama al método desde una instancia de Animal o usando super en una subclase.
  }
}

// Clase hija Perro que hereda de Animal
public class Perro extends Animal {
  // Sobrescribe el método hacerSonido de la clase Animal
  @Override
  void hacerSonido() {
    super.hacerSonido(); // Llama al método de la clase padre Animal
    System.out.println("Guau guau"); // Este mensaje es específico de la clase Perro y se imprime después del método de la clase padre.
  }
}

// Clase principal
public class Main {
  public static void main(String[] args) {
    // Creamos un objeto de la clase Perro
    Perro perro = new Perro();
    // Llamamos al método hacerSonido del objeto perro
    perro.hacerSonido(); 
    
        /*
        Salida por consola:
        1. "Sonido genérico de animal" (desde super.hacerSonido() en la clase Perro)
        2. "Guau guau" (desde el método hacerSonido sobrescrito en Perro)
        */
  }
}
```
> **Comentario:** `super.hacerSonido()` llama al método `hacerSonido` de la clase padre `Animal` antes de ejecutar el comportamiento adicional en la clase `Perro`.

---

---

---