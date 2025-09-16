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

# 7. Encapsulamiento y Abstracción en Java 🔒

En este capítulo aprenderás dos conceptos clave de la Programación Orientada a Objetos (POO): **encapsulamiento** y **abstracción**. Ambos son fundamentales para escribir código más modular, seguro y mantenible.

---

## 7.1 Propósito y Uso del Encapsulamiento
El **encapsulamiento** consiste en restringir el acceso directo a los atributos de una clase y permitir la manipulación de los datos únicamente a través de métodos específicos (*getters* y *setters*).

### Ventajas del Encapsulamiento:
- Protege los datos de modificaciones accidentales o no deseadas.
- Mejora la modularidad y el mantenimiento del código.
- Controla el acceso a los atributos.

### Ejemplo: Implementación de Encapsulamiento
```java
public class Persona {
    // Atributos privados para proteger los datos
    private String nombre;
    private int edad;

    // Constructor para inicializar los atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter para obtener el valor de los atributos
    public String getNombre() {
        return nombre; // Devuelve el valor del atributo nombre
    }

    public int getEdad() {
        return edad; // Devuelve el valor del atributo edad
    }

    // Métodos setter para modificar los valores de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre; // Actualiza el atributo nombre con el valor proporcionado
    }

    public void setEdad(int edad) {
        if (edad >= 0) { // Validación: la edad no puede ser negativa
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
}

// Clase principal para probar el encapsulamiento
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);

        // Acceso a los datos a través de getters
        System.out.println("Nombre: " + persona.getNombre()); // Imprime: Nombre: Juan
        System.out.println("Edad: " + persona.getEdad());   // Imprime: Edad: 25

        // Modificación de datos usando setters
        persona.setNombre("Ana");
        persona.setEdad(30);

        // Mostrar los datos actualizados
        System.out.println("Nuevo Nombre: " + persona.getNombre()); // Imprime: Nuevo Nombre: Ana
        System.out.println("Nueva Edad: " + persona.getEdad());     // Imprime: Nueva Edad: 30
    }
}
```

---

## 7.2 Métodos `getter` y `setter`
Los métodos **getter** y **setter** son herramientas clave para el encapsulamiento. Permiten leer y escribir los valores de los atributos privados de manera controlada.

### Ejemplo de Validación con `setter`
```java
public class CuentaBancaria {
    private double saldo;

    // Constructor para inicializar el saldo
    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("El saldo inicial no puede ser negativo.");
            this.saldo = 0;
        }
    }

    // Getter para obtener el saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para actualizar el saldo con validación
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        System.out.println("Saldo inicial: " + cuenta.getSaldo()); // Imprime: Saldo inicial: 1000.0

        cuenta.setSaldo(500); // Actualiza el saldo a 500
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());  // Imprime: Nuevo saldo: 500.0

        cuenta.setSaldo(-200); // Intenta establecer un saldo negativo
        // Imprime: El saldo no puede ser negativo.
    }
}
```

---

## 7.3 Clases Abstractas
Una **clase abstracta** no se puede instanciar directamente. Sirve como base para otras clases y puede incluir métodos abstractos (sin implementación) y métodos concretos (con implementación).

### Ejemplo de Clase Abstracta
```java
// Clase abstracta
abstract class Animal {
    // Método abstracto (sin implementación)
    abstract void hacerSonido();

    // Método concreto (con implementación)
    void dormir() {
        System.out.println("Zzz..."); // Imprime: Zzz...
    }
}

// Clase concreta que extiende la clase abstracta
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau guau"); // Implementación específica para Perro
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Error: no se puede instanciar una clase abstracta
        Perro perro = new Perro();
        perro.hacerSonido(); // Imprime: Guau guau
        perro.dormir();      // Imprime: Zzz...
    }
}
```

---

## 7.4 Interfaces
Una **interfaz** define un contrato que una clase debe cumplir. Todas las variables en una interfaz son constantes, y los métodos son abstractos por defecto (a partir de Java 8, pueden incluir métodos concretos con `default`).

### Ejemplo de Interfaz
```java
// Definición de la interfaz
interface Volador {
    void volar(); // Método abstracto
}

// Clase que implementa la interfaz
class Pajaro implements Volador {
    @Override
    public void volar() {
        System.out.println("El pájaro está volando."); // Implementación específica
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        Pajaro pajaro = new Pajaro();
        pajaro.volar(); // Imprime: El pájaro está volando.
    }
}
```

### Diferencias entre Clases Abstractas e Interfaces:
| Característica          | Clase Abstracta            | Interfaz                |
|-------------------------|----------------------------|-------------------------|
| Métodos                 | Puede tener métodos concretos y abstractos | Solo métodos abstractos (excepto `default` y `static` desde Java 8) |
| Herencia/Implementación | Una clase puede extender solo una clase abstracta | Una clase puede implementar múltiples interfaces |
| Uso                     | Para relación "es un(a)"  | Para relación "puede hacer" |

---

---

---

# 8. Herencia y Polimorfismo en Java 🔄

En este capítulo exploraremos dos conceptos fundamentales en programación orientada a objetos: **herencia** y **polimorfismo**. Veremos cómo aprovechar estas características para crear programas más reutilizables y flexibles.

---

## 8.1 Herencia en Java
La **herencia** permite a una clase (subclase) adquirir las propiedades y métodos de otra clase (superclase). Esto facilita la reutilización del código y la extensión de las funcionalidades existentes.

### Uso de `extends`
La palabra clave `extends` se utiliza para indicar que una clase hereda de otra.

```java
// Clase base o superclase
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}

// Subclase que hereda de Animal
class Perro extends Animal {
    void moverCola() {
        System.out.println("El perro mueve la cola");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();

        // Métodos heredados de la superclase
        perro.hacerSonido(); // Salida: Sonido genérico de animal

        // Métodos propios de la subclase
        perro.moverCola(); // Salida: El perro mueve la cola
    }
}
```

### Sobrescritura de métodos (`@Override`)
La sobrescritura permite redefinir el comportamiento de un método de la superclase en la subclase.

```java
// Clase base o superclase
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}

// Subclase que sobrescribe el método hacerSonido
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau guau");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();

        // Llama al método sobrescrito en la subclase
        perro.hacerSonido(); // Salida: Guau guau
    }
}
```

---

## 8.2 Polimorfismo
El **polimorfismo** permite a un objeto tomar múltiples formas. En Java, se puede implementar a través de la **sobrecarga de métodos** y el **polimorfismo en tiempo de ejecución**.

### Sobrecarga de métodos
La **sobrecarga** ocurre cuando varios métodos en una clase tienen el mismo nombre pero diferentes parámetros.

```java
class Calculadora {
    // Método para sumar dos enteros
    int sumar(int a, int b) {
        return a + b;
    }

    // Método sobrecargado para sumar tres enteros
    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sobrecargado para sumar dos números en punto flotante
    double sumar(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(5, 10)); // Salida: 15
        System.out.println(calc.sumar(5, 10, 15)); // Salida: 30
        System.out.println(calc.sumar(5.5, 10.5)); // Salida: 16.0
    }
}
```

### Polimorfismo en tiempo de ejecución
En este caso, el tipo de método que se invoca se decide en tiempo de ejecución. Esto se logra mediante la sobrescritura de métodos y el uso de referencias de la superclase.

```java
// Clase base o superclase
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}

// Subclase
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau guau");
    }
}

// Subclase
class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau miau");
    }
}

public class Main {
    public static void main(String[] args) {
        // Uso de referencias de la superclase
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        // Determina el método a ejecutar en tiempo de ejecución
        animal1.hacerSonido(); // Salida: Guau guau
        animal2.hacerSonido(); // Salida: Miau miau
    }
}
```

---

## Resumen
- **Herencia** permite reutilizar y extender el código existente.
- **Sobrescritura** redefine el comportamiento de métodos en las subclases.
- **Polimorfismo** hace que el mismo método pueda comportarse de manera diferente dependiendo del contexto.

Estos conceptos son esenciales para escribir código limpio, modular y mantenible en Java.

---

---

---

# 9. Manejo de Excepciones en Java ⚠️

El manejo de excepciones es una técnica esencial para controlar errores en tiempo de ejecución y mantener la estabilidad de nuestras aplicaciones. A continuación, exploraremos cómo funcionan las excepciones en Java y cómo utilizarlas correctamente.

---

## 9.1 Introducción a las Excepciones

Una excepción en Java es un evento que interrumpe el flujo normal de un programa. Puede ser provocada por errores de programación (como una división por cero) o por situaciones externas (como la falta de un archivo).

### Jerarquía de Excepciones

- **Checked Exceptions:** Se deben manejar explícitamente en tiempo de compilación. Ejemplo: `IOException`.
- **Unchecked Exceptions:** Son errores de programación. Ejemplo: `NullPointerException`.
- **Errores:** Problemas graves que generalmente no se pueden manejar. Ejemplo: `OutOfMemoryError`.

```java
// Ejemplo de una excepción no controlada
int resultado = 10 / 0; // Esto lanza una ArithmeticException
```

---

## 9.2 Estructura `try-catch-finally`

La estructura básica para manejar excepciones en Java incluye `try`, `catch` y `finally`.

### Ejemplo 1: Manejo básico con `try-catch`

```java
public class ManejoExcepciones {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Genera una ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero"); // Maneja la excepción
        }
    }
}
```

### Ejemplo 2: Uso de `finally`

El bloque `finally` siempre se ejecuta, haya o no una excepción.

```java
public class ManejoExcepciones {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Genera un ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } finally {
            System.out.println("Bloque finally ejecutado"); // Siempre se ejecuta
        }
    }
}
```

---

## 9.3 Excepciones Personalizadas

Podemos crear nuestras propias excepciones extendiendo la clase `Exception`.

### Ejemplo: Excepción personalizada

```java
// Definimos una excepción personalizada
class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje); // Llama al constructor de Exception
    }
}

public class EjemploExcepcionPersonalizada {
    public static void main(String[] args) {
        try {
            lanzarExcepcion();
        } catch (MiExcepcion e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }

    static void lanzarExcepcion() throws MiExcepcion {
        throw new MiExcepcion("Este es un error personalizado"); // Lanza la excepción personalizada
    }
}
```

---

## 9.4 `throw` y `throws`

### `throw`

La palabra clave `throw` se utiliza para lanzar una excepción explícitamente.

```java
public class EjemploThrow {
    public static void main(String[] args) {
        try {
            validarEdad(15); // Esto lanzará una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    static void validarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18");
        }
        System.out.println("Edad válida");
    }
}
```

### `throws`

Se utiliza en la declaración de un método para indicar que puede lanzar excepciones.

```java
import java.io.*;

public class EjemploThrows {
    public static void main(String[] args) {
        try {
            leerArchivo(); // Este método puede lanzar IOException
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    static void leerArchivo() throws IOException {
        File archivo = new File("archivo.txt");
        FileReader lector = new FileReader(archivo); // Puede lanzar IOException
    }
}
```

---

## Conclusión

El manejo de excepciones en Java es fundamental para construir aplicaciones robustas y confiables. Usar `try-catch-finally`, excepciones personalizadas, y comprender el uso de `throw` y `throws` nos permite manejar errores de manera efectiva.

---

---

---

# 10. Colecciones en Java 🗃️

Las colecciones en Java son estructuras que nos permiten almacenar y gestionar conjuntos de elementos de manera eficiente. En este capítulo exploraremos las principales colecciones como arrays, listas, conjuntos y mapas, así como el uso de iteradores.

---

## 10.1 Arrays

Los arrays son estructuras de datos que almacenan elementos del mismo tipo en posiciones contiguas de memoria. Tienen un tamaño fijo definido al momento de su creación.

```java
// Declaración y uso de un array
int[] numeros = {1, 2, 3, 4, 5}; // Array de enteros

// Acceso a elementos y recorrido con un bucle
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Número: " + numeros[i]); // Muestra cada número del array
}

// Modificación de un elemento
numeros[2] = 10; // Cambia el valor en la posición 2 (índice base 0)
System.out.println("Nuevo valor en posición 2: " + numeros[2]);
```

---

## 10.2 Listas (`ArrayList`)

`ArrayList` es una colección que permite almacenar elementos de tamaño dinámico y proporciona métodos para gestionarlos fácilmente.

```java
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>(); // Crear una lista de strings

        // Añadir elementos
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Naranja");

        // Recorrer la lista
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta); // Muestra cada fruta
        }

        // Eliminar un elemento
        frutas.remove("Plátano"); // Elimina "Plátano" de la lista

        // Mostrar la lista actualizada
        System.out.println("Lista actualizada: " + frutas);
    }
}
```

---

## 10.3 Conjuntos (`HashSet`, `TreeSet`)

Los conjuntos (`Set`) almacenan elementos únicos y no permiten duplicados. Ejemplos comunes incluyen `HashSet` y `TreeSet`.

### `HashSet`

```java
import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> ciudades = new HashSet<>();

        // Añadir elementos
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Sevilla");
        ciudades.add("Madrid"); // No se añadirá porque ya existe

        // Mostrar elementos
        System.out.println("Ciudades: " + ciudades); // Los elementos no tienen un orden específico
    }
}
```

### `TreeSet`

```java
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        // Añadir elementos
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        // Mostrar elementos ordenados
        System.out.println("Números ordenados: " + numeros);
    }
}
```

---

## 10.4 Mapas (`HashMap`, `TreeMap`)

Los mapas (`Map`) almacenan pares clave-valor, donde cada clave debe ser única.

### `HashMap`

```java
import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();

        // Añadir pares clave-valor
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Luis", 28);

        // Acceder a un valor por su clave
        System.out.println("Edad de Ana: " + edades.get("Ana")); // Muestra 30

        // Recorrer el mapa
        for (String clave : edades.keySet()) {
            System.out.println(clave + " tiene " + edades.get(clave) + " años.");
        }
    }
}
```

### `TreeMap`

```java
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> capitales = new TreeMap<>();

        // Añadir pares clave-valor
        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Alemania", "Berlín");

        // Mostrar las capitales ordenadas por país
        for (String pais : capitales.keySet()) {
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        }
    }
}
```

---

## 10.5 Iteradores

Los iteradores permiten recorrer colecciones de manera eficiente. Se pueden usar con cualquier colección que implemente la interfaz `Iterable`.

```java
import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterador {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        // Añadir elementos
        nombres.add("Laura");
        nombres.add("Pedro");
        nombres.add("Marta");

        // Crear un iterador
        Iterator<String> iterador = nombres.iterator();

        // Recorrer la lista con el iterador
        while (iterador.hasNext()) {
            String nombre = iterador.next(); // Obtiene el siguiente elemento
            System.out.println("Nombre: " + nombre);

            // Eliminar un elemento específico
            if (nombre.equals("Pedro")) {
                iterador.remove(); // Elimina "Pedro" de la lista
            }
        }

        // Mostrar lista actualizada
        System.out.println("Lista actualizada: " + nombres);
    }
}
```

---

---

---

# 11. Entrada y Salida de Datos en Java ⬅️➡️

En este capítulo, exploraremos cómo manejar la entrada y salida de datos en Java. Aprenderemos a leer datos desde la consola, escribir datos en la consola y trabajar con archivos para leer y escribir información.

---

## 11.1 Lectura de datos desde la consola (`Scanner`)

La clase `Scanner` es muy útil para leer datos ingresados por el usuario desde la consola.

```java
import java.util.Scanner;

public class LecturaConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner

        // Leer un dato de tipo String
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // nextLine() lee toda la línea

        // Leer un dato de tipo int
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt(); // nextInt() lee un entero

        // Mostrar los datos ingresados
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años.");

        scanner.close(); // Cerrar el objeto Scanner
    }
}
```
**Explicación:**
- El método `nextLine()` lee una línea completa de texto.
- El método `nextInt()` lee un número entero.
- Es importante cerrar el objeto `Scanner` con `scanner.close()` para liberar recursos.

---

## 11.2 Escritura de datos en la consola

Para mostrar datos en la consola, usamos métodos como `System.out.print()` y `System.out.println()`.

```java
public class EscrituraConsola {
    public static void main(String[] args) {
        // Escribir texto sin salto de línea
        System.out.print("Hola, ");
        System.out.print("mundo. ");

        // Escribir texto con salto de línea
        System.out.println("Esto es una nueva línea.");

        // Formatear la salida
        System.out.printf("El número %.2f tiene dos decimales.\n", 3.14159);
    }
}
```
**Explicación:**
- `System.out.print()` no agrega un salto de línea al final.
- `System.out.println()` agrega un salto de línea después de imprimir.
- `System.out.printf()` permite formatear cadenas con especificadores como `%.2f` para números decimales.

---

## 11.3 Archivos (lectura/escritura con `File`, `FileReader`, `BufferedReader`, `FileWriter`)

### Lectura de archivos
Usamos `File` y `BufferedReader` para leer archivos.

```java
import java.io.*;

public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("ejemplo.txt"); // Crear objeto File
            BufferedReader br = new BufferedReader(new FileReader(archivo)); // Crear BufferedReader

            String linea;
            while ((linea = br.readLine()) != null) { // Leer línea por línea
                System.out.println(linea); // Imprimir cada línea
            }

            br.close(); // Cerrar el BufferedReader
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
```
**Explicación:**
- `File` representa el archivo físico.
- `BufferedReader` mejora el rendimiento al leer grandes cantidades de texto.
- `readLine()` devuelve cada línea como un `String`.

### Escritura de archivos
Usamos `FileWriter` para escribir datos en un archivo.

```java
import java.io.*;

public class EscrituraArchivo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("ejemplo.txt"); // Crear FileWriter

            fw.write("Hola, este es un archivo de ejemplo.\n"); // Escribir texto
            fw.write("Segunda línea del archivo.\n");

            fw.close(); // Cerrar el FileWriter
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
```
**Explicación:**
- `FileWriter` permite escribir datos en un archivo de texto.
- El método `write()` agrega contenido al archivo.
- Es importante cerrar el `FileWriter` para asegurar que los datos se guarden correctamente.

---

---

---

# 12. Programación Orientada a Objetos (POO) Avanzada 🧠

En este capítulo exploraremos conceptos avanzados de la Programación Orientada a Objetos (POO) en Java. Estos conceptos permiten estructurar y gestionar mejor el código, haciéndolo más eficiente y mantenible.

---

## 12.1 Composición vs. Herencia

### Composición
La composición implica que una clase tenga una instancia de otra clase como atributo. Esto se utiliza para establecer una relación "tiene un/a".

```java
class Motor {
    void arrancar() {
        System.out.println("El motor está arrancando...");
    }
}

class Coche {
    private Motor motor; // Composición: Coche "tiene un" Motor

    Coche() {
        this.motor = new Motor(); // Inicializamos el motor
    }

    void conducir() {
        motor.arrancar(); // Llamamos a métodos del motor
        System.out.println("El coche está en movimiento.");
    }
}

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.conducir();
    }
}
```
**Salida:**
```
El motor está arrancando...
El coche está en movimiento.
```

### Herencia
La herencia establece una relación "es un/a" entre clases. Utilizamos la palabra clave `extends` para crear clases hijas que heredan de una clase padre.

```java
class Animal {
    void comer() {
        System.out.println("El animal está comiendo.");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("Guau guau");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.comer(); // Método heredado de Animal
        perro.ladrar(); // Método propio de Perro
    }
}
```
**Salida:**
```
El animal está comiendo.
Guau guau
```

---

## 12.2 Clases Internas y Anónimas

### Clases Internas
Las clases internas son definidas dentro de otra clase y tienen acceso a los miembros de la clase externa.

```java
class Externa {
    private String mensaje = "Hola desde la clase externa";

    class Interna {
        void mostrarMensaje() {
            System.out.println(mensaje); // Accede a miembros de la clase externa
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.mostrarMensaje();
    }
}
```
**Salida:**
```
Hola desde la clase externa
```

### Clases Anónimas
Las clases anónimas son clases sin nombre que se utilizan principalmente para implementar interfaces o sobrescribir métodos de clases existentes.

```java
interface Saludo {
    void saludar();
}

public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo() { // Clase anónima implementando la interfaz
            @Override
            public void saludar() {
                System.out.println("Hola desde una clase anónima");
            }
        };
        saludo.saludar();
    }
}
```
**Salida:**
```
Hola desde una clase anónima
```

---

## 12.3 Uso de `final` en Clases, Métodos y Variables

### `final` en Variables
Las variables declaradas como `final` no pueden cambiar su valor después de ser inicializadas.

```java
public class Main {
    public static void main(String[] args) {
        final int constante = 10;
        System.out.println("Constante: " + constante);
        // constante = 20; // Error: no se puede reasignar una variable final
    }
}
```

### `final` en Métodos
Un método marcado como `final` no puede ser sobrescrito por clases hijas.

```java
class Animal {
    final void dormir() {
        System.out.println("El animal está durmiendo.");
    }
}

class Perro extends Animal {
    // void dormir() {} // Error: no se puede sobrescribir un método final
}
```

### `final` en Clases
Una clase marcada como `final` no puede tener subclases.

```java
final class Animal {
    void comer() {
        System.out.println("El animal está comiendo.");
    }
}

// class Perro extends Animal {} // Error: no se puede heredar de una clase final
```

---

## 12.4 Clases y Métodos Estáticos

### Métodos Estáticos
Los métodos estáticos pertenecen a la clase en lugar de a una instancia específica. Se acceden directamente a través del nombre de la clase.

```java
class Utilidades {
    static int sumar(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int resultado = Utilidades.sumar(5, 3); // Llamada al método estático
        System.out.println("Resultado: " + resultado);
    }
}
```
**Salida:**
```
Resultado: 8
```

### Clases Estáticas
Las clases estáticas anidadas pueden ser accedidas sin crear una instancia de la clase externa.

```java
class Externa {
    static class Anidada {
        void mostrarMensaje() {
            System.out.println("Hola desde una clase estática anidada");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Externa.Anidada anidada = new Externa.Anidada(); // Creación de la clase estática anidada
        anidada.mostrarMensaje();
    }
}
```
**Salida:**
```
Hola desde una clase estática anidada
```

---

---

---

# 13. Hilos y Concurrencia ⚡

La programación concurrente en Java permite realizar múltiples tareas al mismo tiempo utilizando hilos. Aquí exploraremos conceptos clave como crear hilos, sincronización y el uso de `ExecutorService` para gestionar tareas.

---

## 13.1 Introducción a los Hilos

Un hilo es la unidad más pequeña de ejecución dentro de un programa. Java proporciona soporte para trabajar con hilos a través de la clase `Thread` y la interfaz `Runnable`.

---

## 13.2 Crear Hilos con `Thread` y `Runnable`

### Usando la clase `Thread`

```java
class MiHilo extends Thread {
    @Override
    public void run() {
        // Código que se ejecuta cuando el hilo se inicia
        System.out.println("Hilo iniciado: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        MiHilo hilo2 = new MiHilo();

        hilo1.start(); // Inicia el hilo1
        hilo2.start(); // Inicia el hilo2
    }
}
```

**Explicación:**
- `MiHilo` extiende la clase `Thread` y sobrescribe el método `run`.
- `start()` inicia el hilo, ejecutando el método `run` en un hilo separado.

### Usando la interfaz `Runnable`

```java
class MiRunnable implements Runnable {
    @Override
    public void run() {
        // Código que se ejecuta en el hilo
        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new MiRunnable());
        Thread hilo2 = new Thread(new MiRunnable());

        hilo1.start(); // Inicia el hilo1
        hilo2.start(); // Inicia el hilo2
    }
}
```

**Explicación:**
- Implementar `Runnable` es preferido cuando ya estamos extendiendo otra clase.
- Los hilos se crean pasando una instancia de `Runnable` al constructor de `Thread`.

---

## 13.3 Sincronización de Hilos

Cuando varios hilos acceden a un recurso compartido, puede haber problemas de consistencia. Java proporciona la palabra clave `synchronized` para evitar estos problemas.

### Ejemplo: Sincronizar un Método

```java
class Contador {
    private int cuenta = 0;

    public synchronized void incrementar() {
        cuenta++;
        System.out.println(Thread.currentThread().getName() + " incrementa a: " + cuenta);
    }
}

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Runnable tarea = () -> {
            for (int i = 0; i < 5; i++) {
                contador.incrementar();
            }
        };

        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);

        hilo1.start();
        hilo2.start();
    }
}
```

**Explicación:**
- El método `incrementar` está sincronizado, lo que garantiza que solo un hilo pueda ejecutarlo a la vez.
- Esto previene condiciones de carrera al modificar la variable `cuenta`.

### Ejemplo: Bloque Synchronized

```java
class Banco {
    private int saldo = 100;

    public void retirar(int cantidad) {
        synchronized (this) {
            if (saldo >= cantidad) {
                System.out.println(Thread.currentThread().getName() + " retira: " + cantidad);
                saldo -= cantidad;
                System.out.println("Saldo restante: " + saldo);
            } else {
                System.out.println(Thread.currentThread().getName() + " no puede retirar: Saldo insuficiente");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Runnable tarea = () -> banco.retirar(50);

        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);

        hilo1.start();
        hilo2.start();
    }
}
```

**Explicación:**
- `synchronized (this)` sincroniza solo el bloque crítico, mejorando el rendimiento.

---

## 13.4 Uso de `ExecutorService`

`ExecutorService` es una API de alto nivel para gestionar hilos. Permite ejecutar tareas de manera concurrente sin necesidad de manejar manualmente los hilos.

### Ejemplo Básico

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Crea un pool de 3 hilos

        Runnable tarea = () -> {
            System.out.println("Ejecutando tarea en: " + Thread.currentThread().getName());
        };

        for (int i = 0; i < 5; i++) {
            executor.execute(tarea); // Encola la tarea para que se ejecute
        }

        executor.shutdown(); // Finaliza el ExecutorService
    }
}
```

**Explicación:**
- `newFixedThreadPool(3)` crea un grupo de 3 hilos reutilizables.
- `execute` asigna tareas al grupo de hilos.
- `shutdown` asegura que no se acepten más tareas y los hilos se liberen tras finalizar las actuales.

### Ejemplo con `Callable` y `Future`

```java
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor(); // Un solo hilo

        Callable<String> tarea = () -> {
            Thread.sleep(1000); // Simula una tarea costosa
            return "Resultado de la tarea";
        };

        Future<String> futuro = executor.submit(tarea); // Encola la tarea

        try {
            System.out.println("Esperando resultado...");
            String resultado = futuro.get(); // Bloquea hasta que se complete la tarea
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
```

**Explicación:**
- `Callable` permite tareas que devuelven un resultado.
- `Future` se usa para obtener el resultado de la tarea o manejar excepciones.

---

Con estos ejemplos, puedes empezar a trabajar con hilos y concurrencia en Java de manera eficiente. 🚀

---

---

---

# 14. API de Java y Bibliotecas Comunes 📚

En este capítulo, exploraremos algunas de las bibliotecas más comunes y útiles que proporciona Java para manipular cadenas, fechas, colecciones y más. También veremos ejemplos prácticos para entender cómo utilizar estas herramientas.

---

## 14.1 Biblioteca estándar de Java

La biblioteca estándar de Java incluye un conjunto de paquetes y clases predefinidos que simplifican el desarrollo de software. Estos incluyen herramientas para colecciones, fechas, manipulación de cadenas, entrada/salida, concurrencia y más.

- **Paquetes clave:**
  - `java.util` → Utilidades generales.
  - `java.time` → Manejo de fechas y tiempos.
  - `java.io` → Entrada y salida de datos.

---

## 14.2 Uso de `java.util` y `java.time`

### Ejemplo: Generar números aleatorios con `java.util.Random`

```java
import java.util.Random;

public class GenerarAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        // Generar un número aleatorio entre 0 y 9
        int numero = random.nextInt(10);
        System.out.println("Número aleatorio: " + numero); // Imprime un número aleatorio
    }
}
```

### Ejemplo: Manejar fechas con `java.time.LocalDate` y `java.time.LocalDateTime`

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ManejoDeFechas {
    public static void main(String[] args) {
        // Fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual); // Imprime la fecha actual

        // Fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + fechaHoraActual); // Imprime fecha y hora

        // Formatear la fecha y hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = fechaHoraActual.format(formatter);
        System.out.println("Fecha formateada: " + fechaFormateada); // Imprime la fecha formateada
    }
}
```

---

## 14.3 Operaciones con cadenas y fechas

### Ejemplo: Métodos comunes de la clase `String`

```java
public class OperacionesConCadenas {
    public static void main(String[] args) {
        String texto = "Aprendiendo Java";

        // Longitud de la cadena
        System.out.println("Longitud: " + texto.length()); // Muestra la longitud del texto

        // Convertir a mayúsculas
        System.out.println("Mayúsculas: " + texto.toUpperCase()); // Convierte el texto a mayúsculas

        // Reemplazar caracteres
        System.out.println("Reemplazo: " + texto.replace("Java", "programación")); // Reemplaza "Java" con "programación"
    }
}
```

### Ejemplo: Calcular la diferencia entre dos fechas

```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiferenciaEntreFechas {
    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2023, 1, 1);
        LocalDate fin = LocalDate.of(2025, 1, 1);

        // Calcular la diferencia en días
        long dias = ChronoUnit.DAYS.between(inicio, fin);
        System.out.println("Días entre las fechas: " + dias); // Imprime la diferencia en días
    }
}
```

---

## 14.4 Clases utilitarias (`Collections`, `Arrays`)

### Ejemplo: Ordenar una lista con `Collections`

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLista {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Beatriz");

        // Ordenar la lista
        Collections.sort(nombres);
        System.out.println("Lista ordenada: " + nombres); // Imprime la lista en orden alfabético
    }
}
```

### Ejemplo: Copiar y rellenar un array con `Arrays`

```java
import java.util.Arrays;

public class OperacionesConArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        // Copiar el array
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Copia del array: " + Arrays.toString(copia)); // Muestra la copia

        // Rellenar el array con un valor
        Arrays.fill(numeros, 0);
        System.out.println("Array rellenado: " + Arrays.toString(numeros)); // Muestra el array relleno con ceros
    }
}
```

---

---

---

# 15. Conceptos Avanzados 🔮

En este capítulo exploraremos conceptos avanzados de Java que son esenciales para el desarrollo moderno, incluyendo reflexión, generics, y las características introducidas en Java 8.

---

## 15.1 Reflexión en Java
La reflexión permite inspeccionar y manipular las propiedades y métodos de las clases en tiempo de ejecución.

### Ejemplo: Inspeccionar una clase usando reflexión
```java
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ReflexionEjemplo {
    private String mensaje = "Hola, Reflexión!";

    public void mostrarMensaje() {
        System.out.println(mensaje);
    }

    public static void main(String[] args) throws Exception {
        ReflexionEjemplo obj = new ReflexionEjemplo();
        Class<?> clazz = obj.getClass(); // Obtiene la clase del objeto

        // Listar métodos de la clase
        System.out.println("Métodos de la clase:");
        for (Method metodo : clazz.getDeclaredMethods()) {
            System.out.println(metodo.getName()); // Muestra el nombre de cada método
        }

        // Acceder al campo privado "mensaje"
        Field campoMensaje = clazz.getDeclaredField("mensaje");
        campoMensaje.setAccessible(true); // Permite acceder a campos privados
        campoMensaje.set(obj, "Reflexión en acción!"); // Modifica el valor del campo

        // Invocar el método mostrarMensaje
        Method metodoMostrar = clazz.getDeclaredMethod("mostrarMensaje");
        metodoMostrar.invoke(obj); // Llama al método dinámicamente
    }
}
```
**Salida esperada:**
```
Métodos de la clase:
mostrarMensaje
Reflexión en acción!
```
---

## 15.2 Generics
Los generics permiten escribir clases, interfaces y métodos que pueden operar con cualquier tipo de datos, proporcionando seguridad de tipos en tiempo de compilación.

### Ejemplo: Uso de generics en una clase
```java
public class Caja<T> { // T representa el tipo genérico
    private T contenido;

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T obtener() {
        return contenido;
    }

    public static void main(String[] args) {
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Hola, Generics!"); // Guarda un String
        System.out.println(cajaDeTexto.obtener()); // Muestra "Hola, Generics!"

        Caja<Integer> cajaDeNumeros = new Caja<>();
        cajaDeNumeros.guardar(42); // Guarda un Integer
        System.out.println(cajaDeNumeros.obtener()); // Muestra 42
    }
}
```
**Salida esperada:**
```
Hola, Generics!
42
```

---

## 15.3 Java 8 y Nuevas Características
### Streams
Los streams permiten procesar colecciones de datos de forma funcional y eficiente.

#### Ejemplo: Filtrar y mapear una lista
```java
import java.util.Arrays;
import java.util.List;

public class StreamsEjemplo {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Pedro", "Juan", "Lucía", "Ana");

        // Filtrar nombres únicos que comiencen con "A" y convertir a mayúsculas
        nombres.stream()
              .filter(nombre -> nombre.startsWith("A")) // Filtra nombres que comienzan con "A"
              .distinct() // Elimina duplicados
              .map(String::toUpperCase) // Convierte a mayúsculas
              .forEach(System.out::println); // Imprime cada elemento
    }
}
```
**Salida esperada:**
```
ANA
```

### Lambdas
Las expresiones lambda proporcionan una forma concisa de implementar interfaces funcionales.

#### Ejemplo: Uso de una expresión lambda
```java
import java.util.Arrays;
import java.util.List;

public class LambdaEjemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Imprimir cada número usando una expresión lambda
        numeros.forEach(numero -> System.out.println("Número: " + numero));
    }
}
```
**Salida esperada:**
```
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```

### Default Methods en Interfaces
Los métodos por defecto en interfaces permiten proporcionar una implementación predeterminada.

#### Ejemplo: Interfaz con un método por defecto
```java
interface Saludo {
    void saludar(String nombre);

    default void despedirse(String nombre) {
        System.out.println("Adiós, " + nombre + "!");
    }
}

public class DefaultMethodEjemplo implements Saludo {
    @Override
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        DefaultMethodEjemplo ejemplo = new DefaultMethodEjemplo();
        ejemplo.saludar("Carlos"); // Implementación personalizada
        ejemplo.despedirse("Carlos"); // Uso del método por defecto
    }
}
```
**Salida esperada:**
```
Hola, Carlos!
Adiós, Carlos!
```

---

---

---

# ¡Gracias por Llegar Hasta Aquí! 🙌

Has completado este recorrido por el mundo de **Java**. 🚀 Espero que este contenido te haya sido útil para comprender los fundamentos y conceptos avanzados de este poderoso lenguaje de programación.

## ¿Qué sigue? 🌟
El aprendizaje nunca termina, y ahora tienes una base sólida para:
- Crear proyectos propios.
- Explorar frameworks como **Spring** o **Hibernate**.
- Profundizar en áreas específicas como **desarrollo web**, **aplicaciones móviles** o **microservicios**.
- Mejorar tus habilidades con herramientas como **Maven**, **Docker** o **Kubernetes**.

## Consejos Finales 📚
- **Practica constantemente**: Implementa lo que has aprendido con pequeños proyectos.
- **Colabora**: Únete a comunidades de programación para compartir conocimientos.
- **Mantente actualizado**: Java sigue evolucionando, así que estate atento a nuevas versiones y características.
- **Resuelve problemas**: Usa plataformas como **LeetCode**, **HackerRank** o **Codewars** para poner a prueba tus habilidades.

---

💡 *Recuerda que el aprendizaje es un viaje, no un destino. Cada línea de código escrita te acerca más a tus metas.*

¡Mucho éxito en tu camino como desarrollador/a Java! 🌱✨
