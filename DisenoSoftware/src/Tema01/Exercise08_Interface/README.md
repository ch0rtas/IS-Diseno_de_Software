# Tema 01 | Implementación de ElectricSound - Exercise08_Interface

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Exercise08%3A+Interface" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🎸 Modificación del comportamiento eléctrico en instrumentos musicales mediante interfaces
</div>

---

## 📄 Enunciado del Ejercicio: Implementación de ElectricSound

El objetivo de este ejercicio es modificar la implementación de los instrumentos musicales para que los instrumentos de cuerda (`Stringed`) y de viento metálico (`Brass`) implementen el comportamiento eléctrico definido en la interfaz `ElectricSound`. El método `electricPlay` de estos instrumentos deberá mostrar por pantalla la nota musical recibida por parámetro seguida de " eléctrico".

### Enunciado Original:
> Para el diseño de los instrumentos musicales anterior, queremos reflejar que los instrumentos de Cuerda y de vientos metálicos (Brass) implementan un sonido electrónico definido en la interface ElectricSound. El método electricPlay de estos instrumentos deberá mostrar por pantalla la nota musical recibida por parametro + ' eléctrico '.
>
> ```java
> public interface Instrument {
>     void play(Note n);
>     String what();
> }
> ```
>
> El orden es importante:
> ```java
> class ClassName extends ClassName implements InterfaceName, InterfaceName{ }
> ```
>
> ```java
> public interface ElectricSound {
>     void electricPlay(Note n);
> }
> ```

---

## 📂 Estructura de la Carpeta

> [!TIP]
> **Organización del Proyecto:**  
> En este ejercicio, modificamos principalmente las clases `Stringed` y `Brass` para cambiar el comportamiento del método `electricPlay`, manteniendo la estructura general del ejercicio anterior.

### 📁 Estructura de la carpeta `Exercise08_Interface`:
```
📁 Exercise08_Interface
├── 📄 Brass.java              // MODIFICADO: Implementación actualizada de electricPlay
├── 📄 Stringed.java           // MODIFICADO: Implementación actualizada de electricPlay
└── 📄 MusicTest.java          // Clase principal con método main para probar el sistema

📁 Exercise07_Interface (referenciado)
├── 📄 Note.java               // Enumeración para representar las notas musicales
├── 📄 Instrument.java         // Interfaz base para todos los instrumentos
├── 📄 ElectricSound.java      // Interfaz para comportamiento electrónico
├── 📄 Wind.java               // Implementación de instrumento de viento
├── 📄 Woodwind.java           // Implementación de instrumento de viento-madera
└── 📄 Percussion.java         // Implementación de instrumento de percusión
```

---

## 🔄 Cambios Realizados en el Diseño

### 1. **Modificación del Método `electricPlay`**

El cambio principal es la actualización del método `electricPlay` en las clases `Stringed` y `Brass` para cumplir con el nuevo requisito:

**Antes (Exercise07):**
```java
@Override
public void electricPlay(Note note) {
    System.out.println("ElectricSound.Stringed.play() " + note);
}
```

**Después (Exercise08):**
```java
@Override
public void electricPlay(Note note) {
    // Muestra la nota recibida + " eléctrico"
    System.out.println(note + " eléctrico");
}
```

### 2. **Importaciones de Paquetes**

- Las clases del ejercicio 8 importan las interfaces y clases del ejercicio 7 para reutilizar el código.
- Esto permite centrarnos solo en los cambios necesarios sin duplicar código.

### 3. **Mantenimiento de la Compatibilidad**

- La clase `MusicTest` sigue funcionando con las nuevas implementaciones sin necesidad de cambios adicionales.
- Se mantiene el polimorfismo y la comprobación de tipos mediante `instanceof`.

---

## 📜 Descripción de la Solución

A continuación, se detalla cada componente modificado en la solución:

### 1. **Clase `Brass`**

```java
package Tema01.Exercise08_Interface;

import Tema01.Exercise07_Interface.Instrument;
import Tema01.Exercise07_Interface.ElectricSound;
import Tema01.Exercise07_Interface.Note;

public class Brass implements Instrument, ElectricSound {

    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public void electricPlay(Note note) {
        // Muestra la nota recibida + " eléctrico"
        System.out.println(note + " eléctrico");
    }

    @Override
    public String what() {
        return "Brass";
    }
}
```

**Explicación:**
- Implementa las interfaces `Instrument` y `ElectricSound` del paquete `Exercise07_Interface`.
- El método `play` mantiene su comportamiento original.
- El método `electricPlay` se ha modificado para mostrar la nota seguida de " eléctrico".
- Se mantiene la implementación del método `what()` para identificar el tipo de instrumento.

### 2. **Clase `Stringed`**

```java
package Tema01.Exercise08_Interface;

import Tema01.Exercise07_Interface.Instrument;
import Tema01.Exercise07_Interface.ElectricSound;
import Tema01.Exercise07_Interface.Note;

public class Stringed implements Instrument, ElectricSound {

    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    public void electricPlay(Note note) {
        // Muestra la nota recibida + " eléctrico"
        System.out.println(note + " eléctrico");
    }

    @Override
    public String what() {
        return "Stringed";
    }
}
```

**Explicación:**
- Similar a `Brass`, implementa las interfaces `Instrument` y `ElectricSound`.
- El método `electricPlay` se ha modificado para mostrar la nota seguida de " eléctrico".
- Los demás métodos mantienen su comportamiento original.

### 3. **Clase `MusicTest`**

```java
package Tema01.Exercise08_Interface;

import Tema01.Exercise07_Interface.Wind;
import Tema01.Exercise07_Interface.Percussion;
import Tema01.Exercise07_Interface.Woodwind;
import Tema01.Exercise07_Interface.Note;
import Tema01.Exercise07_Interface.Instrument;
import Tema01.Exercise07_Interface.ElectricSound;

public class MusicTest {

    static void tune(Instrument instrument) {
        instrument.play(Note.DO);
        // Si el instrumento tiene comportamiento eléctrico, se invoca electricPlay
        if (instrument instanceof ElectricSound) {
            ((ElectricSound) instrument).electricPlay(Note.MI);
        }
    }

    static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Woodwind(),
                new Brass()
        };

        tuneAll(orchestra);
    }
}
```

**Explicación:**
- Importa todas las clases necesarias del paquete `Exercise07_Interface`.
- Utiliza las nuevas implementaciones de `Stringed` y `Brass` del paquete actual.
- Mantiene el mismo comportamiento general: afinar todos los instrumentos y utilizar el sonido eléctrico cuando esté disponible.
- Demuestra la interoperabilidad entre componentes de diferentes paquetes que comparten interfaces comunes.

---

## 💻 Ejemplo de Ejecución

Al ejecutar el método `main` de la clase `MusicTest`, se produce la siguiente salida:

```
Wind.play() DO
Percussion.play() DO
Stringed.play() DO
MI eléctrico
Woodwind.play() DO
Brass.play() DO
MI eléctrico
```

**Análisis de la ejecución:**
1. Los instrumentos `Wind`, `Percussion` y `Woodwind` solo ejecutan el método `play()`, mostrando su comportamiento estándar.
2. Para `Stringed` y `Brass`, además de ejecutar `play()`, se invoca `electricPlay()` con la nota MI.
3. La nueva implementación de `electricPlay()` muestra el formato "MI eléctrico", cumpliendo con el requisito del ejercicio.
4. Esta salida difiere de la del ejercicio anterior, donde la salida de `electricPlay()` incluía el nombre de la clase.

---

## 🔍 Análisis de Conceptos de Programación

### 1. **Importación de Paquetes**

Este ejercicio demuestra cómo reutilizar código entre paquetes mediante importaciones:

```java
import Tema01.Exercise07_Interface.Instrument;
import Tema01.Exercise07_Interface.ElectricSound;
import Tema01.Exercise07_Interface.Note;
```

Ventajas de este enfoque:
- **Reutilización de código**: No es necesario duplicar las interfaces y clases base.
- **Mantenimiento más sencillo**: Los cambios en las interfaces se propagan automáticamente.
- **Organización modular**: Cada ejercicio puede enfocarse en aspectos específicos.

### 2. **Polimorfismo y Sustitución**

El ejercicio demuestra el principio de sustitución de Liskov:

```java
Instrument[] orchestra = {
        new Wind(),
        new Percussion(),
        new Stringed(),  // Implementación de Exercise08
        new Woodwind(),
        new Brass()      // Implementación de Exercise08
};
```

- Las nuevas implementaciones de `Stringed` y `Brass` pueden sustituir a las anteriores sin afectar al funcionamiento general del programa.
- El cliente (`MusicTest`) puede trabajar con cualquier implementación de las interfaces sin conocer los detalles internos.

### 3. **Comportamiento Específico vs Comportamiento Común**

El ejercicio ilustra cómo equilibrar el comportamiento común (definido por interfaces) con el comportamiento específico (implementaciones concretas):

- **Comportamiento común**: Todos los instrumentos implementan `play()` y `what()`.
- **Comportamiento específico**: Solo algunos instrumentos implementan `electricPlay()` y cada uno lo hace de manera diferente.
- **Extensión del comportamiento**: Se puede añadir nueva funcionalidad (como el sonido eléctrico) sin modificar el código base.

### 4. **Sobrescritura de Métodos**

La modificación del método `electricPlay()` demuestra la sobrescritura de métodos:

```java
@Override
public void electricPlay(Note note) {
    System.out.println(note + " eléctrico");
}
```

- Se mantiene la firma del método (nombre, parámetros y tipo de retorno).
- Se cambia la implementación para adaptarla a los nuevos requisitos.
- La anotación `@Override` ayuda a detectar errores en tiempo de compilación.

---

## 📚 Reflexiones sobre el Diseño

### 1. **Ventajas de las Interfaces**

Este ejercicio refuerza las ventajas de usar interfaces:

- **Flexibilidad**: Podemos cambiar la implementación de `electricPlay()` sin afectar a los clientes.
- **Extensibilidad**: Podríamos añadir nuevos tipos de instrumentos o comportamientos eléctricos fácilmente.
- **Desacoplamiento**: El código cliente (`MusicTest`) no depende de implementaciones específicas.

### 2. **Importancia del Formato de Salida**

El cambio en el formato de salida de `electricPlay()` puede parecer trivial, pero demuestra aspectos importantes:

- **Requisitos de presentación**: A menudo, los requisitos incluyen aspectos de presentación además de la funcionalidad.
- **Consistencia**: El nuevo formato es más consistente (solo muestra la nota y "eléctrico").
- **Comunicación clara**: El formato más simple puede ser más fácil de entender para los usuarios.

### 3. **Reutilización vs. Reimplementación**

El ejercicio muestra un equilibrio entre reutilizar código existente y reimplementar partes específicas:

- Se reutilizan las interfaces y algunas clases del ejercicio anterior.
- Se reimplementan solo las clases que necesitan cambios específicos.
- Este enfoque es eficiente y minimiza la duplicación de código.

---

## 🎵 Aplicaciones Prácticas

Este ejercicio, aunque simple, refleja patrones de diseño que se utilizan en sistemas reales:

### 1. **Simulación de Instrumentos Musicales**

- En software de producción musical, diferentes tipos de instrumentos pueden tener comportamientos acústicos y electrónicos.
- Las interfaces permiten tratar todos los instrumentos de manera uniforme cuando sea necesario.

### 2. **Plugins para Aplicaciones**

- El patrón de plugins utiliza interfaces para definir contratos entre la aplicación principal y los componentes adicionales.
- Diferentes plugins pueden implementar la misma interfaz de diferentes maneras.

### 3. **Sistemas de Controladores**

- En sistemas de hardware, diferentes dispositivos pueden compartir interfaces comunes pero tener implementaciones específicas.
- Un ejemplo sería controladores MIDI para diferentes tipos de instrumentos.

---

## 💡 Conclusiones

Este ejercicio demuestra varios conceptos clave en la programación orientada a objetos:

1. **Interfaces como contratos**: Las interfaces definen qué deben hacer las clases, no cómo deben hacerlo.
2. **Implementación flexible**: Diferentes clases pueden implementar la misma interfaz de diferentes maneras.
3. **Reutilización de código**: La importación de paquetes permite reutilizar código sin duplicarlo.
4. **Polimorfismo**: El sistema puede trabajar con diferentes implementaciones de manera uniforme.
5. **Extensibilidad**: El diseño basado en interfaces facilita la extensión del sistema con nuevos componentes.

La modificación del comportamiento eléctrico en los instrumentos demuestra cómo un cambio específico puede implementarse de manera aislada sin afectar al resto del sistema, lo que es una característica deseable en cualquier diseño de software.

---

## 📬 Contacto

<p align="center"> Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme! </p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>