# Patrón Strategy (Tema 02) - Solución 2

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Patr%C3%B3n+Strategy+%7C+Soluci%C3%B3n+2;Ejercicio+del+Tema+02+de+Dise%C3%B1o+de+Software" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Implementación alternativa del Patrón Strategy para un servicio médico en un jardín de infancia.
</div>

---

## 📄 Enunciado del Ejercicio

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/Ejercicio_PatronStrategy.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronStrategy/Ejercicio_PatronStrategy.png" alt="Enunciado del ejercicio" width="600"/>
  </a>
</p>

El objetivo del ejercicio es aplicar el **Patrón Strategy** para alternar entre diferentes comportamientos en el contexto de un servicio médico para un jardín de infancia. En esta solución, se separa la ejecución de cada actividad médica para que el **contexto** determine el orden de ejecución, en vez de delegar esa decisión a cada estrategia individual.

---

## 🌟 Diagrama UML de la Solución

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2/UML2.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2/UML2.png" alt="Diagrama UML" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 1: Diagrama UML generado por IntelliJ.</i></p>

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2/UML2.drawio">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2/UML2.drawio.png" alt="Diagrama UML en formato Drawio" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 2: Diagrama UML generado en formato Draw.io.</i></p>

El diagrama UML muestra cómo se desacoplan las estrategias médicas mediante una interfaz común, permitiendo cambiar el comportamiento en tiempo de ejecución.

---

## 🛠️ Descripción de la Solución

Esta solución se diferencia de la **Solución 1** en que el **contexto** determina el orden de ejecución de las actividades, en lugar de dejar esa decisión a las estrategias concretas de los doctores. A continuación se describen los componentes clave:

### 1. **Contexto: `KinderGardenActivityContext`**

- Implementa la interfaz `DoctorServiceStrategy` (definida en la solución 1) pero **no** contiene la lógica de cada actividad.
- **Delegación por composición:** Recibe una instancia de `DoctorServiceStrategy` (por ejemplo, `FongDoctorStrategy` o `WangDoctorStrategy`) y llama a sus métodos.
- **Orden fijo:** El método `applyServiceStrategy()` del contexto define de forma explícita el orden de ejecución:
    1. `inspectChildren()`
    2. `sendResultsInspection()`
    3. `sendInvoice()`

_Archivo: `KinderGardenActivityContext.java`_
```java
public class KinderGardenActivityContext implements DoctorServiceStrategy {
    private DoctorServiceStrategy doctorServiceStrategy;

    public KinderGardenActivityContext(DoctorServiceStrategy doctorServiceStrategy) {
        super();
        this.doctorServiceStrategy = doctorServiceStrategy;
    }

    public DoctorServiceStrategy getDoctorServiceStrategy() {
        return this.doctorServiceStrategy;
    }

    public void setDoctorServiceStrategy(DoctorServiceStrategy doctorServiceStrategy) {
        this.doctorServiceStrategy = doctorServiceStrategy;
    }

    public void applyServiceStrategy() {
        // El contexto marca el orden de ejecución de las actividades
        // Actividad 1
        this.inspectChildren();
        // Actividad 2
        this.sendResultsInspection();
        // Actividad 3
        this.sendInvoice();
    }

    public void inspectChildren() {
        this.doctorServiceStrategy.inspectChildren();
    }

    public void sendResultsInspection() {
        this.doctorServiceStrategy.sendResultsInspection();
    }

    public void sendInvoice() {
        this.doctorServiceStrategy.sendInvoice();
    }
}
```

[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2/KinderGardenActivityContext.java)

### 2. **Clases Concretas de Estrategia**

Se reutilizan las estrategias definidas en la **Solución 1**:

- **`FongDoctorStrategy`** y **`WangDoctorStrategy`**:  
  Estas clases proporcionan la implementación específica para cada doctor. La diferencia con la Solución 1 es que su método `applyServiceStrategy()` no define el orden de ejecución, ya que éste es controlado por el contexto.

[Ver código de FongDoctorStrategy.java](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/FongDoctorStrategy.java)  
[Ver código de WangDoctorStrategy.java](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/WangDoctorStrategy.java)

### 3. **Programa Principal: `TestKinderGardenService`**

La clase `TestKinderGardenService` demuestra el funcionamiento del contexto:

- **Inicio:** Se configura inicialmente el contexto con la estrategia del Dr. Fong.
- **Cambio Dinámico:** Posteriormente, se cambia la estrategia a la del Dr. Wang utilizando el método `setDoctorServiceStrategy()`.
- **Ejecución de Actividades:** En ambos casos, el contexto ejecuta las actividades en el orden predefinido.

_Archivo: `TestKinderGardenService.java`_
```java
public class TestKinderGardenService {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Bienvenido al KinderGarden Service");
        System.out.println("========================================");

        // Suponemos que pasa consulta el Dr. Fong
        System.out.println(">> Servicio médico en curso: Dr. Fong <<");
        KinderGardenActivityContext kinderGardenContext = new KinderGardenActivityContext(new FongDoctorStrategy());
        kinderGardenContext.applyServiceStrategy();
        System.out.println("-------------------------------------");

        // Cambiamos el servicio médico, ahora pasa consulta el Dr. Wang
        System.out.println(">> Cambiando al servicio médico: Dr. Wang <<");
        kinderGardenContext.setDoctorServiceStrategy(new WangDoctorStrategy());
        kinderGardenContext.applyServiceStrategy();
        System.out.println("-------------------------------------");

        System.out.println("========================================");
        System.out.println("     Fin del servicio KinderGarden");
        System.out.println("========================================");
    }
}
```

[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2/TestKinderGardenService.java)

---

## 📂 Organización del Código

La solución 2 se encuentra en la siguiente ruta del repositorio:

📁 [solucion2](https://github.com/ch0rtas/IS-Diseno_de_Software/tree/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2)

Contiene los siguientes archivos:

- `KinderGardenActivityContext.java`
- `TestKinderGardenService.java`
- `UML2.drawio`
- `UML2.drawio.png`
- `UML2.png`

---

## 📜 Ejecución de la Solución

Al ejecutar la clase `TestKinderGardenService`, se observa que:

1. **Con el Dr. Fong:**  
   Se ejecutan las actividades en el siguiente orden:
    - Inspección de los niños.
    - Envío de resultados de la inspección.
    - Envío de la factura.

2. **Cambio al Dr. Wang:**  
   Tras cambiar la estrategia, se vuelven a ejecutar las actividades en el mismo orden, pero con la lógica correspondiente al Dr. Wang.

### Ejemplo de Salida
```plaintext
========================================
   Bienvenido al KinderGarden Service
========================================

>> Servicio médico en curso: Dr. Fong <<
[FongDoctorStrategy], estoy inspeccionando al niño.
[FongDoctorStrategy], estoy mandando los resultados de la inspección.
[FongDoctorStrategy], estoy mandando la factura.
-------------------------------------

>> Cambiando al servicio médico: Dr. Wang <<
[WangDoctorStrategy], estoy inspeccionando al niño.
[WangDoctorStrategy], estoy mandando los resultados de la inspección.
[WangDoctorStrategy], estoy mandando la factura.
-------------------------------------

========================================
     Fin del servicio KinderGarden
========================================
```

---

## 💡 Diferencias y Ventajas de la Solución 2

### 1. **Orden de Ejecución Controlado**
En esta solución, el contexto (`KinderGardenActivityContext`) define de manera explícita el orden de las actividades. Esto contrasta con la **Solución 1**, donde cada estrategia concreta determina su propio orden.

### 2. **Mayor Flexibilidad en el Contexto**
Permite que el contexto controle la secuencia de operaciones, lo que puede ser útil si se requiere un orden específico independiente de la estrategia concreta.

### 3. **Reutilización de Estrategias**
Se reutilizan las clases de estrategias (definidas en la **Solución 1**), lo que favorece la consistencia y la reutilización del código.

### 4. **Intercambio Dinámico**
El contexto permite cambiar la estrategia en tiempo de ejecución, manteniendo un comportamiento predecible y ordenado.

[Ver solución 1](https://github.com/ch0rtas/IS-Diseno_de_Software/tree/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1)

---

## 📬 Contacto

<p align="center">
  Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme!
</p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>
