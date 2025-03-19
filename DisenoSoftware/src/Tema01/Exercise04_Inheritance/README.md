# Tema 01 | Herencia - Exercise04_Inheritance

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Exercise04%3A+Inheritance" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Implementación de la clase `HerencyElectricCar` mediante herencia.
</div>

---

## 📄 Enunciado del Ejercicio

El objetivo del ejercicio es implementar una clase llamada `HerencyElectricCar` utilizando el concepto de herencia a partir de la clase `Car` desarrollada en el ejercicio anterior:

1. Mediante la especialización/herencia de la clase `Car` del ejercicio 3, crear la clase `HerencyElectricCar`.
2. El constructor de la clase `HerencyElectricCar` solo contendrá los parámetros marca, modelo y color.
3. En el método `main` de la clase `HerencyElectricCar`, crear un objeto de tipo `Car` que será instanciado a través de un objeto `HerencyElectricCar` correspondiente a un vehículo de la marca Tesla, modelo Model3 y color rojo.

---

## 📂 Estructura de la Carpeta

> [!TIP]
> **Organización del Proyecto:**  
> Mantener una estructura clara facilita el mantenimiento y la extensibilidad del código. Revisa la siguiente organización para entender la distribución de los archivos.

### 📁 Estructura de la carpeta `Exercise04_Inheritance`:
```
📁 Tema04_Inheritance
├── 📄 HerencyElectricCar.java    // Clase que hereda de Car
└── 📄 README.md                  // Documento explicativo del ejercicio y solución
```

---

## 📜 Descripción de la Solución

La solución se estructura siguiendo los principios de herencia en programación orientada a objetos:

### 1. **Clase `HerencyElectricCar` que hereda de `Car` (4.a)**

La clase `HerencyElectricCar` extiende la funcionalidad de la clase `Car` creada en el ejercicio anterior. Esta relación de herencia se establece mediante la palabra clave `extends`:

```java
public class HerencyElectricCar extends Car {
    // Cuerpo de la clase
}
```

### 2. **Constructor Simplificado (4.a)**

El constructor de `HerencyElectricCar` solo recibe los parámetros marca, modelo y color, simplificando la interfaz de creación. Internamente, llama al constructor de la clase padre `Car` pasando estos parámetros junto con una instancia nueva de `Engine` de tipo "eléctrico":

```java
// Constructor de la clase HerencyElectricCar
public HerencyElectricCar(String marca, String modelo, String color) {
    super(marca, modelo, color, new Engine("eléctrico")); // Llama al constructor de la clase padre Car
}
```

### 3. **Método `main` para Probar la Clase (4.b)**

En el método `main`, se crea un objeto de tipo `Car` que es instanciado como un `HerencyElectricCar`, demostrando el principio de sustitución de Liskov:

```java
public static void main(String[] args) {
    // Crear un objeto Car, que es una instancia de HerencyElectricCar
    Car electricCar = new HerencyElectricCar("Tesla", "Model3", "rojo");

    // Llamar a los métodos del coche
    electricCar.encender(); // Encender el motor eléctrico
    electricCar.avanzar();  // Mostrar mensaje de avance
}
```

---

## 🔄 Comparación de Enfoques: Composición, Agregación y Herencia

### Relación entre las clases:

1. **Composición (Exercise02_Composition)**:
    - `ElectricCar` ◆───────> `Engine`
    - El motor es parte integral del coche eléctrico.

2. **Agregación (Exercise03_Aggregation)**:
    - `Car` ◇───────> `Engine`
    - El coche utiliza un motor, pero este puede existir independientemente.

3. **Herencia (Exercise04_Inheritance)**:
    - `HerencyElectricCar` ───────▷ `Car`
    - HerencyElectricCar es un tipo de Car, hereda sus atributos y comportamientos.

### Diferencias clave:

- **Composición vs Agregación**:
    - En la composición, el ciclo de vida del motor está ligado al del coche.
    - En la agregación, el motor puede existir independientemente del coche.

- **Herencia vs Composición/Agregación**:
    - La herencia establece una relación "es un" (HerencyElectricCar es un Car).
    - La composición y agregación establecen una relación "tiene un" (Car tiene un Engine).

---

## 💻 Ejemplo de Ejecución

```
eléctrico encendido!
Tesla,Model3,rojo avanzando...
```

---

## 💡 Ventajas de la Herencia en este Contexto

1. **Simplicidad en la creación**:
    - El constructor de `HerencyElectricCar` simplifica la creación de coches eléctricos al no requerir un objeto `Engine`.

2. **Ocultación de la complejidad**:
    - La clase derivada oculta los detalles de implementación relacionados con el motor, presentando una interfaz más simple.

3. **Especialización**:
    - `HerencyElectricCar` representa una especialización de `Car`, específicamente para coches eléctricos.

4. **Reutilización de código**:
    - Los métodos `encender()` y `avanzar()` se heredan de la clase padre, evitando la duplicación de código.

---

## 🧩 Patrones de Diseño Relacionados

Este ejercicio ilustra conceptos relacionados con varios patrones de diseño:

- **Plantilla (Template)**: La clase base `Car` define el esqueleto de los métodos que sus subclases pueden utilizar.
- **Fábrica (Factory)**: La clase `HerencyElectricCar` encapsula la creación del objeto `Engine`.
- **Adaptador (Adapter)**: El constructor de `HerencyElectricCar` adapta la interfaz compleja de `Car` a una más simple.

---

## 📬 Contacto

<p align="center"> Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme! </p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/">
    <img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" />
  </a>
  <a href="mailto:manu08martinez@gmail.com">
    <img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" />
  </a>
</p>