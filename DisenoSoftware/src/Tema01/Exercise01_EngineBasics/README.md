# Tema 01 | Clase, atributos y contructor - Exercise01_EngineBasics

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Exercise01%3A+Engine+Basics" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Implementación de una clase `Engine` con métodos básicos.
</div>

---

## 📄 Enunciado del Ejercicio

El objetivo del ejercicio es implementar una clase llamada `Engine` que represente un motor, siguiendo los requisitos especificados:

1. Crear una clase `Engine` con el atributo `tipo` y un método `encender()` que imprima por consola un mensaje indicando que el motor está encendido.
2. Crear un constructor con parámetro que permita inicializar el tipo de motor y un constructor sin parámetros que use un valor por defecto.
3. Sobrescribir el método `toString()` para que muestre la información de la clase y del tipo de motor.
4. Probar la clase `Engine` en el método `main`.

---

## 📂 Estructura de la Carpeta

> [!TIP]
> **Organización del Proyecto:**  
> Mantener una estructura clara facilita el mantenimiento y la extensibilidad del código. Revisa la siguiente organización para entender la distribución de los archivos.

### 📁 Estructura de la carpeta `Exercise01_EngineBasics`:
```
📁 Tema01_EngineBasics
├── 📄 Engine.java                 // Clase principal que implementa el motor
├── 📄 EngineTest.java             // Clase para probar la funcionalidad de Engine
├── 📄 UML.png                     // Diagrama UML que muestra la relación de composición
└── 📄 README.md                   // Documento explicativo del ejercicio y solución
```

---

## 📜 Descripción de la Solución

La solución se estructura en varias partes que cumplen con los puntos solicitados:

### 1. **Clase `Engine` con Atributos y Constructor (1.a y 1.c)**

El atributo `tipo` representa el tipo de motor y se inicializa mediante un constructor. Además, se añade un constructor sin parámetros que utiliza un valor por defecto definido en la constante `TYPE_DEFAULT_VALUE`:

```java
// Atributo privado que almacena el tipo de motor
private String tipo;

// Constante con el valor por defecto para el tipo
public static final String TYPE_DEFAULT_VALUE = "N/A";

// Constructor con parámetro para inicializar el tipo de motor
public Engine(String tipo) {
    this.tipo = tipo;
}

// Constructor sin parámetros que utiliza el valor por defecto
public Engine() {
    this(Engine.TYPE_DEFAULT_VALUE);
}
```

### 2. **Método `encender()` para Encender el Motor (1.a)**

El método `encender()` imprime un mensaje indicando que el motor está encendido:

```java
// Método para encender el motor, imprime un mensaje en la consola
public void encender() {
    System.out.println(this.tipo + " encendido!");
}
```

### 3. **Sobrescritura del Método `toString()` (1.d)**

El método `toString()` se redefine para mostrar la clase del objeto y el valor del atributo `tipo`:

```java
@Override
public String toString() {
    return "Engine [tipo=" + this.tipo + "]";
}
```

### 4. **Método `main` para Probar la Clase (1.b)**

En el método `main`, se crea una instancia del motor con el tipo `eléctrico`, se invoca el método `encender()` y se prueba el método `toString()`:

```java
public static void main(String[] args) {
    // Crear una instancia de la clase Engine con el tipo 'eléctrico'
    Engine engine = new Engine("eléctrico");

    // Llamar al método encender para mostrar el mensaje
    engine.encender();

    // Probar el método toString
    System.out.println(engine);
}
```

---

## 💡 Notas Adicionales

Esta solución cumple con los requisitos establecidos y demuestra los conceptos básicos de diseño e implementación de clases en Java.

- La separación de constructores facilita la creación de objetos con valores predeterminados o personalizados.
- La sobrescritura del método `toString()` mejora la legibilidad del objeto cuando se imprime.

---

## 📬 Contacto

<p align="center"> Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme! </p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>
