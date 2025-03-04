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

El ejercicio consiste en implementar una solución basada en el **Patrón Strategy** que permita alternar entre diferentes comportamientos en un contexto sin modificar su estructura. En este caso, se modela el servicio médico de un jardín de infancia, en el que diferentes doctores realizan actividades (inspección, envío de resultados y factura) según su estrategia.

---

## 🌟 Diagrama UML de la Solución

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/UML1.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/UML1.png" alt="Diagrama UML" width="600"/>
  </a>
</p>

El diagrama UML muestra cómo se desacoplan las estrategias médicas mediante una interfaz común, permitiendo cambiar el comportamiento en tiempo de ejecución.

---

## 🛠️ Descripción de la Solución

La solución se estructura en tres componentes principales:

### 1. **Interfaz `ServiceStrategy` y `DoctorServiceStrategy`**

- **`ServiceStrategy`**  
  Define el método `applyServiceStrategy()`, que es la operación principal para aplicar una estrategia.  
  [Ver código](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/ServiceStrategy.java)


- **`DoctorServiceStrategy`**  
  Extiende `ServiceStrategy` e incluye métodos específicos para las actividades médicas:
    - `inspectChildren()`
    - `sendResultsInspection()`
    - `sendInvoice()`  
      [Ver código](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/DoctorServiceStrategy.java)

### 2. **Clases Concretas de Estrategia**

Cada clase concreta implementa `DoctorServiceStrategy` y define la forma en que se realizan las actividades:

- **`FongDoctorStrategy`**  
  Estrategia específica del Dr. Fong. En su método `applyServiceStrategy()`, se ejecutan las actividades en el orden: inspección, envío de factura y envío de resultados.  
  [Ver código](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/FongDoctorStrategy.java)


- **`WangDoctorStrategy`**  
  Estrategia específica del Dr. Wang. La diferencia está en el orden de ejecución de las actividades (por ejemplo, envía la factura antes que los resultados).  
  [Ver código](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/WangDoctorStrategy.java)


- **`NoDoctorServiceStrategy`**  
  Implementa la interfaz para casos en los que el servicio médico no está disponible, mostrando un mensaje por defecto.  
  [Ver código](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/NoDoctorServiceStrategy.java)


### 3. **Contexto: `KinderGardenServiceContext`**

El contexto es responsable de delegar la ejecución de la estrategia. Utiliza composición para mantener una referencia a una instancia de `ServiceStrategy` y permite cambiarla dinámicamente.  
[Ver código](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/KinderGardenServiceContext.java)

El diseño se realiza de esta forma para:

- **Desacoplar** el comportamiento (estrategias) del contexto.
- Permitir **flexibilidad** y **reutilización** al poder intercambiar la estrategia sin modificar el código del contexto.
- Facilitar la **extensión**: si en el futuro se requiere un nuevo comportamiento, se implementa una nueva estrategia sin alterar la estructura existente.

---

## 📂 Organización del Código

La solución se encuentra en la siguiente ruta del repositorio:

📁 [solucion1](https://github.com/ch0rtas/IS-Diseno_de_Software/tree/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1)

Los archivos incluidos son:

- `README.md`
- `DoctorServiceStrategy.java`
- `FongDoctorStrategy.java`
- `KinderGardenServiceContext.java`
- `NoDoctorServiceStrategy.java`
- `ServiceStrategy.java`
- `TestKinderGardenService.java`
- `UML1.png`
- `WangDoctorStrategy.java`

---

## 📜 Ejecución de la Solución

El programa principal se encuentra en la clase `TestKinderGardenService`, la cual demuestra cómo se pueden alternar las estrategias en tiempo de ejecución. En el ejemplo, primero se utiliza la estrategia del Dr. Fong y luego se cambia a la del Dr. Wang.

### Ejemplo de Salida
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
[Ver código](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/TestKinderGardenService.java)

---

## 💡 Ventajas de la Solución

- **Desacoplamiento:** Las estrategias médicas están separadas del contexto, permitiendo añadir nuevas sin modificar la lógica del servicio.
- **Flexibilidad:** El contexto puede cambiar la estrategia en tiempo de ejecución, adaptándose a distintas necesidades.
- **Reusabilidad:** Cada clase concreta implementa una interfaz común, lo que favorece la reutilización y el mantenimiento del código.
- **Extensibilidad:** Es sencillo agregar nuevas estrategias (por ejemplo, un nuevo doctor) implementando la interfaz correspondiente.

---

## 📬 Contacto

<p align="center">
  Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme!
</p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>
