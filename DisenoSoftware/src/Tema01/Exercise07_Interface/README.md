# Tema 01 | Interfaces en Java - Exercise07_Interface

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Exercise07%3A+Interface" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🎹 Transformación de una jerarquía basada en clases abstractas a interfaces en Java.
</div>

---

## 📄 Enunciado del Ejercicio: Interfaces en Java

El objetivo de este ejercicio es transformar el diseño anterior de instrumentos musicales para aumentar el nivel de abstracción, pasando de una clase abstracta `Instrument` a una interfaz. Se deben aplicar los cambios necesarios en todos los elementos afectados y verificar que la clase `MusicTest` sigue funcionando correctamente.

### Enunciado Original:
> Para el diseño de los instrumentos musicales anterior, queremos aumentar la abstracción de la clase Instrument pasando de ser clase abstracta a interface. Aplica el cambio en los elementos afectados y comprueba que sigue funcionando la clase MusicTest.

---

## 📂 Estructura de la Carpeta

> [!TIP]
> **Organización del Proyecto:**  
> La estructura se mantiene similar a la del ejercicio anterior, pero ahora con `Instrument` como interfaz en lugar de clase abstracta.

### 📁 Estructura de la carpeta `Exercise07_Interface`:
```
📁 Exercise07_Interface
├── 📄 Note.java                // Enumeración para representar las notas musicales
├── 📄 Instrument.java          // MODIFICADO: Ahora es una interfaz en lugar de clase abstracta
├── 📄 ElectricSound.java       // Interfaz para comportamiento electrónico
├── 📄 Wind.java                // MODIFICADO: Ahora implementa la interfaz Instrument
├── 📄 Woodwind.java            // Subclase de Wind (que implementa Instrument)
├── 📄 Brass.java               // MODIFICADO: Ahora implementa dos interfaces: Instrument y ElectricSound
├── 📄 Percussion.java          // MODIFICADO: Ahora implementa la interfaz Instrument
├── 📄 Stringed.java            // MODIFICADO: Ahora implementa dos interfaces: Instrument y ElectricSound
└── 📄 MusicTest.java           // Clase principal con método main para probar el sistema
```

---

## 🌟 Cambios Realizados en el Diseño

### 1. **De Clase Abstracta a Interfaz**

El cambio principal es la transformación de `Instrument` de una clase abstracta a una interfaz:

**Antes (Versión Clase Abstracta):**
```java
public abstract class Instrument {
    // Método abstracto que será implementado por las subclases
    public abstract void play(Note note);

    // Método común para describir el instrumento
    public String what() {
        return "Instrument";
    }
}
```

**Después (Versión Interfaz):**
```java
public interface Instrument {
    void play(Note note);

    default String what() {
        return "Instrument";
    }
}
```

### 2. **Actualización de las Relaciones de Herencia**

- Las clases que extendían `Instrument` ahora implementan la interfaz `Instrument`.
- Las clases que implementaban interfaces y extendían clases, ahora implementan múltiples interfaces.

### 3. **Implementación de Métodos Default**

- El método `what()` que antes era un método concreto en la clase abstracta, ahora es un método default en la interfaz, manteniendo así la implementación por defecto.

---

## 📜 Descripción de la Solución

A continuación, se detalla cada componente de la solución después de los cambios:

### 1. **Enumeración `Note`**

```java
public enum Note {
    DO, RE, MI;
}
```

**Explicación:**
- Sin cambios respecto a la versión anterior.
- Representa las notas musicales básicas que pueden ser tocadas por los instrumentos.

### 2. **Interfaz `Instrument`**

```java
public interface Instrument {
    void play(Note note);

    default String what() {
        return "Instrument";
    }
}
```

**Explicación:**
- Transformada de clase abstracta a interfaz.
- Define el contrato básico para todos los instrumentos.
- Utiliza un método default para proporcionar una implementación por defecto de `what()`.
- Los métodos en las interfaces son implícitamente públicos y abstractos (si no son default).

### 3. **Interfaz `ElectricSound`**

```java
public interface ElectricSound {
    void electricPlay(Note note);
}
```

**Explicación:**
- Sin cambios respecto a la versión anterior.
- Define un contrato para instrumentos que pueden producir sonidos electrónicos.

### 4. **Clase `Wind`**

```java
public class Wind implements Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    public String what() {
        return "Wind";
    }
}
```

**Explicación:**
- Modificada para implementar la interfaz `Instrument` en lugar de extender una clase abstracta.
- Proporciona implementaciones para todos los métodos de la interfaz.
- Sobrescribe el método default `what()` para proporcionar una implementación específica.

### 5. **Clase `Woodwind`**

```java
public class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}
```

**Explicación:**
- Mantiene la herencia de `Wind`.
- No necesita implementar directamente `Instrument` ya que lo hereda de `Wind`.
- Sobrescribe los métodos para proporcionar implementaciones específicas.

### 6. **Clase `Brass`**

```java
public class Brass implements Instrument, ElectricSound {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public void electricPlay(Note note) {
        System.out.println("ElectricSound.Brass.play() " + note);
    }

    @Override
    public String what() {
        return "Brass";
    }
}
```

**Explicación:**
- Modificada para implementar directamente las interfaces `Instrument` y `ElectricSound`.
- Ya no extiende `Wind`, lo que representa un cambio significativo en la jerarquía.
- Proporciona implementaciones para todos los métodos de ambas interfaces.

### 7. **Clase `Percussion`**

```java
public class Percussion implements Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }
}
```

**Explicación:**
- Modificada para implementar la interfaz `Instrument` en lugar de extender una clase abstracta.
- Proporciona implementaciones para todos los métodos de la interfaz.

### 8. **Clase `Stringed`**

```java
public class Stringed implements Instrument, ElectricSound {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    public void electricPlay(Note note) {
        System.out.println("ElectricSound.Stringed.play() " + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }
}
```

**Explicación:**
- Modificada para implementar las interfaces `Instrument` y `ElectricSound` en lugar de extender una clase abstracta.
- Proporciona implementaciones para todos los métodos de ambas interfaces.

### 9. **Clase `MusicTest`**

```java
public class MusicTest {
    static void tune(Instrument instrument) {
        instrument.play(Note.DO);
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
- Sin cambios en la funcionalidad respecto a la versión anterior.
- Demuestra la potencia del polimorfismo: el código sigue funcionando sin cambios aunque la implementación subyacente haya cambiado de clase abstracta a interfaz.
- Sigue creando un array de tipos `Instrument` y tratando todos los objetos de manera uniforme.

---

## 🔍 Análisis del Cambio a Interfaces

### 1. **Ventajas de Usar Interfaces**

Al convertir `Instrument` de clase abstracta a interfaz, hemos obtenido varias ventajas:

- **Mayor flexibilidad**: Las clases pueden implementar múltiples interfaces, pero solo pueden extender una clase. Esto permite que una clase como `Brass` pueda tener características de varios contratos sin estar limitada por la jerarquía de herencia.

- **Desacoplamiento**: Las interfaces representan contratos puros, lo que reduce el acoplamiento entre componentes del sistema.

- **Evolución más sencilla**: Las interfaces con métodos default (introducidos en Java 8) permiten añadir nuevos métodos sin romper el código existente.

- **Mejor diseño**: Favorece el principio "prefiere composición sobre herencia", lo que resulta en diseños más flexibles y mantenibles.

### 2. **Cambios en la Jerarquía**

- **Brass**: Anteriormente extendía `Wind` e implementaba `ElectricSound`. Ahora implementa directamente `Instrument` y `ElectricSound`. Esto refleja un cambio conceptual: ahora `Brass` es un tipo de instrumento que puede producir sonido eléctrico, pero no necesariamente un tipo de instrumento de viento.

- **Relaciones más precisas**: Las implementaciones ahora reflejan más claramente las capacidades de cada instrumento, en lugar de forzar una estructura de herencia que podría no ser siempre apropiada.

### 3. **Compatibilidad con Código Existente**

- La clase `MusicTest` sigue funcionando sin cambios, lo que demuestra la robustez del diseño orientado a interfaces.
- El polimorfismo se mantiene a través de la interfaz `Instrument`.
- La comprobación `instanceof` y el casting a `ElectricSound` siguen funcionando correctamente.

### 4. **Uso de Métodos Default**

- El método `what()` ahora es un método default en la interfaz `Instrument`.
- Esto permite mantener la implementación por defecto que antes proporcionaba la clase abstracta.
- Los métodos default son una característica de Java 8 que permite añadir métodos con implementación a las interfaces, facilitando la evolución de las APIs sin romper la compatibilidad.

---

## 💻 Ejemplo de Ejecución

Al ejecutar el método `main` de la clase `MusicTest`, se sigue produciendo la misma salida que en la versión anterior:

```
Wind.play() DO
Percussion.play() DO
Stringed.play() DO
ElectricSound.Stringed.play() MI
Woodwind.play() DO
Brass.play() DO
ElectricSound.Brass.play() MI
```

**Análisis de la ejecución:**
1. A pesar de los cambios en la estructura de clases e interfaces, el comportamiento observable es el mismo.
2. Esto demuestra el principio de sustitución de Liskov: las clases que implementan una interfaz deben poder sustituir a otras implementaciones de esa interfaz sin afectar al comportamiento del programa.
3. La verificación `instanceof ElectricSound` sigue funcionando correctamente para identificar los instrumentos que pueden producir sonido eléctrico.

---

## 🔄 Comparativa: Clase Abstracta vs Interfaz

| Aspecto | Clase Abstracta (Exercise06) | Interfaz (Exercise07) |
|---------|------------------------------|----------------------|
| **Herencia** | Simple (una sola clase) | Múltiple (varias interfaces) |
| **Métodos** | Concretos y abstractos | Abstractos y default (Java 8+) |
| **Atributos** | Puede contener atributos con estado | Solo constantes (public static final) |
| **Constructores** | Puede tener constructores | No tiene constructores |
| **Acoplamiento** | Mayor acoplamiento | Menor acoplamiento |
| **Tipo** | Relación "es-un" | Relación "puede-hacer" |
| **Modificadores** | Puede tener métodos private/protected | Métodos implícitamente public |
| **Implementación** | Puede proporcionar comportamiento común | Separa contrato de implementación |

---

## 📚 Conclusiones

La transformación de la clase abstracta `Instrument` a una interfaz demuestra varios conceptos clave en el diseño de software:

1. **Abstracción**: Las interfaces representan el nivel más alto de abstracción en Java, centrándose en el "qué" en lugar del "cómo".

2. **Diseño por contrato**: Las interfaces definen contratos claros que las clases implementadoras deben cumplir.

3. **Desacoplamiento**: El uso de interfaces reduce el acoplamiento entre componentes, facilitando el mantenimiento y la evolución del código.

4. **Polimorfismo**: El polimorfismo basado en interfaces es más flexible que el basado en herencia de clases.

5. **Evolución del lenguaje**: El uso de métodos default en interfaces (característica de Java 8) permite evolucionar APIs sin romper la compatibilidad.

**Aplicaciones prácticas:**
- En sistemas de plugins, las interfaces permiten definir contratos claros sin imponer restricciones en la implementación.
- En frameworks de inyección de dependencias, las interfaces facilitan la sustitución de implementaciones.
- En pruebas unitarias, las interfaces permiten crear mocks o stubs más fácilmente.

Las interfaces son una herramienta fundamental en el diseño orientado a objetos moderno, y este ejercicio demuestra cómo pueden aumentar la flexibilidad y reducir el acoplamiento en un sistema sin afectar su comportamiento observable.

---

## 📬 Contacto

<p align="center"> Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme! </p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>