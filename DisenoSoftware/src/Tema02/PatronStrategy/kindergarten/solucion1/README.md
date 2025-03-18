# Patrón Strategy (Tema 02) - Solución 1

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Patr%C3%B3n+Strategy+%7C+Soluci%C3%B3n+1;Ejercicio+del+Tema+02+de+Dise%C3%B1o+de+Software" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Implementación del Patrón Strategy para resolver un problema de diseño.
</div>

---

## 📄 Enunciado del Ejercicio

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/Ejercicio_PatronStrategy.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronStrategy/Ejercicio_PatronStrategy.png" alt="Enunciado del ejercicio" width="600"/>
  </a>
</p>

El ejercicio consiste en implementar una solución basada en el **Patrón Strategy** que permita alternar entre diferentes comportamientos en un contexto sin modificar su estructura. En este caso, se modela el servicio médico de un jardín de infancia, en el que distintos doctores realizan actividades (inspección, envío de resultados y factura) según su estrategia.

---

## 📂 Estructura de la carpeta

> [!TIP]
> **Organización del Proyecto:**  
> Mantener una estructura de carpetas clara facilita el mantenimiento y la extensibilidad del código. Revisa la siguiente organización para entender la distribución de los archivos.

### 📁 Estructura de la carpeta `solucion1`:
```
📁 PatronStrategy/solucion1
   ├── 📄 DoctorServiceStrategy.java
   ├── 📄 FongDoctorStrategy.java
   ├── 📄 KinderGardenServiceContext.java
   ├── 📄 NoDoctorServiceStrategy.java
   ├── 📄 README.md
   ├── 📄 ServiceStrategy.java
   ├── 📄 TestKinderGardenService.java
   ├── 📄 UML1.drawio
   ├── 🖼️ UML1.drawio.png
   ├── 🖼️ UML1.png
   └── 📄 WangDoctorStrategy.java
```

---

## 🌟 Diagrama UML de la Solución

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/UML1.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/UML1.png" alt="Diagrama UML" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 1: Diagrama UML generado por IntelliJ.</i></p>

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/UML1.drawio">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/UML1.drawio.png" alt="Diagrama UML en formato Drawio" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 2: Diagrama UML generado en formato Draw.io.</i></p>

> [!IMPORTANT]
> **Clave del Diagrama:**  
> El diagrama UML es fundamental para visualizar cómo se desacoplan las estrategias médicas a través de una interfaz común, permitiendo cambiar el comportamiento en tiempo de ejecución sin afectar la estructura global.

El diagrama UML muestra cómo se desacoplan las estrategias médicas mediante una interfaz común, permitiendo cambiar el comportamiento en tiempo de ejecución.

---

## 🛠️ Descripción de la Solución

La solución se estructura en tres componentes principales:

### 1. **Interfaces: `ServiceStrategy` y `DoctorServiceStrategy`**

- **`ServiceStrategy`**  
  Define el método `applyServiceStrategy()`, que es la operación principal para aplicar una estrategia.  
  _Ejemplo de implementación (archivo: `ServiceStrategy.java`):_
  ```java
  public interface ServiceStrategy {
      public void applyServiceStrategy();
  }
  ```
  [Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/ServiceStrategy.java)

  > [!NOTE]
  > **Extensión de Interfaces:**  
  > La interfaz `DoctorServiceStrategy` extiende `ServiceStrategy` añadiendo métodos específicos para actividades médicas, lo que permite definir un contrato más detallado para las estrategias.

- **`DoctorServiceStrategy`**  
  Extiende `ServiceStrategy` e incluye métodos específicos para las actividades médicas:
  - `inspectChildren()`
  - `sendResultsInspection()`
  - `sendInvoice()`

  _Ejemplo de la interfaz (archivo: `DoctorServiceStrategy.java`):_
  ```java
  public interface DoctorServiceStrategy extends ServiceStrategy {
      public void inspectChildren();
      public void sendResultsInspection();
      public void sendInvoice();
  }
  ```
  [Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/DoctorServiceStrategy.java)

---

### 2. **Clases Concretas de Estrategia**

Cada clase concreta implementa `DoctorServiceStrategy` y define la forma en la que se realizan las actividades, permitiendo modificar el comportamiento sin cambiar el código del contexto.

- **`FongDoctorStrategy`**  
  Estrategia específica del Dr. Fong. En el método `applyServiceStrategy()`, se define el orden de ejecución:
  ```java
  public void applyServiceStrategy() {
      this.inspectChildren();
      this.sendInvoice();
      this.sendResultsInspection();
  }
  ```

  _Fragmento de ejemplo (archivo: `FongDoctorStrategy.java`):_
  ```java
  public class FongDoctorStrategy implements DoctorServiceStrategy {
      public void inspectChildren() {
          System.out.println(this + ", estoy inspeccionando al niño.");
      }
      public void sendResultsInspection() {
          System.out.println(this + ", estoy mandando los resultados de la inspección.");
      }
      public void sendInvoice() {
          System.out.println(this + ", estoy mandando la factura.");
      }
      @Override
      public String toString() {
          return "FongDoctorStrategy";
      }
      public void applyServiceStrategy() {
          this.inspectChildren();
          this.sendInvoice();
          this.sendResultsInspection();
      }
  }
  ```
  [Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/FongDoctorStrategy.java)

  > [!TIP]
  > **Personalización de Estrategias:**  
  > Observa cómo el orden de los métodos en `applyServiceStrategy()` determina la secuencia de operaciones. Esto permite ajustar el flujo de ejecución según la necesidad del servicio.

- **`WangDoctorStrategy`**  
  Estrategia específica del Dr. Wang. La diferencia está en el orden de ejecución (por ejemplo, el envío de la factura se realiza antes que el envío de resultados):
  ```java
  public void applyServiceStrategy() {
      this.inspectChildren();
      this.sendInvoice();
      this.sendResultsInspection();
  }
  ```
  _Fragmento de ejemplo (archivo: `WangDoctorStrategy.java`):_
  ```java
  public class WangDoctorStrategy implements DoctorServiceStrategy {
      public void inspectChildren() {
          System.out.println(this + ", estoy inspeccionando al niño.");
      }
      public void sendResultsInspection() {
          System.out.println(this + ", estoy mandando los resultados de la inspección.");
      }
      public void sendInvoice() {
          System.out.println(this + ", estoy mandando la factura.");
      }
      @Override
      public String toString() {
          return "WangDoctorStrategy";
      }
      public void applyServiceStrategy() {
          this.inspectChildren();
          this.sendInvoice();
          this.sendResultsInspection();
      }
  }
  ```
  [Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/WangDoctorStrategy.java)


- **`NoDoctorServiceStrategy`**  
  Utilizada para representar un estado en el que el servicio médico no está disponible, mostrando mensajes por defecto:
  ```java
  public void applyServiceStrategy() {
      System.out.println("Servicio no disponible.");
  }
  ```
  _Fragmento de ejemplo (archivo: `NoDoctorServiceStrategy.java`):_
  ```java
  public class NoDoctorServiceStrategy implements DoctorServiceStrategy {
      public void inspectChildren() {
          System.out.println("Servicio no disponible.");
      }
      public void sendResultsInspection() {
          System.out.println("Servicio no disponible.");
      }
      public void sendInvoice() {
          System.out.println("Servicio no disponible.");
      }
      @Override
      public String toString() {
          return "NoDoctorServiceStrategy []";
      }
      public void applyServiceStrategy() {
          System.out.println("Servicio no disponible.");
      }
  }
  ```
  [Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/NoDoctorServiceStrategy.java)

> [!IMPORTANT]
> **Nota sobre el Orden de Ejecución:**  
> El orden en que se llaman los métodos dentro de `applyServiceStrategy()` puede afectar la lógica del negocio. Asegúrate de que este orden refleje correctamente los requerimientos del servicio.

---

### 3. **Contexto: `KinderGardenServiceContext`**

El contexto es el encargado de delegar la ejecución de la estrategia. Utiliza composición para mantener una referencia a una instancia de `ServiceStrategy` y permite cambiarla en tiempo de ejecución.

_Fragmento de ejemplo (archivo: `KinderGardenServiceContext.java`):_
```java
public class KinderGardenServiceContext implements ServiceStrategy { 
    private ServiceStrategy serviceStrategy;

    public KinderGardenServiceContext(ServiceStrategy serviceStrategy) {
        this.serviceStrategy = serviceStrategy;
    }
    public void setServiceStrategy(ServiceStrategy serviceStrategy) {
        this.serviceStrategy = serviceStrategy;
    }
    public void applyServiceStrategy() {
        this.serviceStrategy.applyServiceStrategy();
    }
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/KinderGardenServiceContext.java)

> [!IMPORTANT]
> **Punto Clave:**  
> El contexto desacopla la estrategia de su ejecución, permitiendo inyectar diferentes comportamientos en tiempo de ejecución. Esta flexibilidad es esencial para la extensibilidad y el mantenimiento del sistema.

Este diseño permite:
- **Desacoplar** el comportamiento (estrategias) del contexto.
- Permitir **flexibilidad** al poder intercambiar la estrategia en tiempo de ejecución.
- Facilitar la **extensibilidad**: para añadir una nueva estrategia (por ejemplo, un nuevo doctor), basta con implementar la interfaz correspondiente.

---

## 📜 Ejecución de la Solución

La clase `TestKinderGardenService` demuestra cómo se alternan las estrategias en tiempo real. En este ejemplo, se comienza utilizando la estrategia del Dr. Fong y posteriormente se cambia a la del Dr. Wang.

_Fragmento representativo del código (archivo: `TestKinderGardenService.java`):_
```java
public class TestKinderGardenService {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Bienvenido al KinderGarden Service");
        System.out.println("========================================");
        // Inicialmente se usa la estrategia del Dr. Fong
        // System.out.println(">> Servicio médico en curso: Dr. Fong <<");
        KinderGardenServiceContext kinderGardenContext = new KinderGardenServiceContext(new FongDoctorStrategy());
        kinderGardenContext.applyServiceStrategy();
        System.out.println("-------------------------------------");

        / Se cambia la estrategia a la del Dr. Wang
        System.out.println(">> Cambiando al servicio médico: Dr. Wang <<");
        kinderGardenContext.setServiceStrategy(new WangDoctorStrategy());
        kinderGardenContext.applyServiceStrategy();
        System.out.println("-------------------------------------");

        System.out.println("========================================");
        System.out.println("     Fin del servicio KinderGarden");
        System.out.println("========================================");
    }
}
```
  > [!NOTE]
  > **Recomendación para Pruebas:**  
  > Ejecuta la clase `TestKinderGardenService` para observar cómo se alternan las estrategias en tiempo real. Esto ilustra claramente el beneficio del patrón Strategy en aplicaciones con comportamientos variables.

### Ejemplo de Salida:

```plaintext
========================================
   Bienvenido al KinderGarden Service
========================================

>> Servicio médico en curso: Dr. Fong <<
[FongDoctorStrategy], estoy inspeccionando al niño.
[FongDoctorStrategy], estoy mandando la factura.
[FongDoctorStrategy], estoy mandando los resultados de la inspección.
-------------------------------------

>> Cambiando al servicio médico: Dr. Wang <<
[WangDoctorStrategy], estoy inspeccionando al niño.
[WangDoctorStrategy], estoy mandando la factura.
[WangDoctorStrategy], estoy mandando los resultados de la inspección.
-------------------------------------

========================================
     Fin del servicio KinderGarden
========================================
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/TestKinderGardenService.java)

---

## 💡 Ventajas de la Solución

> [!TIP]
> **Beneficios Clave (Patrón Strategy):**  
> - Desacoplamiento: Separar el comportamiento de la lógica del contexto.  
> - Flexibilidad: Cambiar la estrategia en tiempo real.  
> - Reusabilidad y Extensibilidad: Facilitar la incorporación de nuevas estrategias sin modificar la estructura base.

- **Desacoplamiento:** Las estrategias médicas están separadas del contexto, lo que permite añadir nuevas sin modificar la lógica del servicio.
- **Flexibilidad:** El contexto puede cambiar la estrategia en tiempo real, adaptándose a distintas necesidades.
- **Reusabilidad:** Cada clase concreta implementa una interfaz común, facilitando la reutilización y el mantenimiento del código.
- **Extensibilidad:** Es sencillo agregar nuevas estrategias (por ejemplo, otro doctor) implementando la interfaz correspondiente.

---

## 📬 Contacto

<p align="center">
  Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme!
</p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>
