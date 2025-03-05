# Patrón Strategy (Tema 02) - Ejercicio Guardería

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=650&height=70&lines=Patr%C3%B3n+Strategy;Ejercicio+de+Dise%C3%B1o+de+Software" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Modelado del patrón Strategy para resolver problemas de diseño en una guardería.
</div>

---

## 📄 Enunciado del Ejercicio

Se nos pide modelar el servicio de consulta médica de una guardería que recibe la visita de dos doctores:

- El Dr. Wang (oculista) examina a los niños el día 15 de cada mes.
- El Dr. Fong (logopeda) examina a los niños el día 28 de cada mes.

Cada doctor realiza tres actividades durante su visita:

1. Examinar a los niños.
2. Enviar la factura a los padres.
3. Enviar el resultado del examen a los padres.

Se debe utilizar el **Patrón Strategy** para modelar esta situación, de forma que la guardería actúe como cliente y los doctores representen las estrategias.

---

## 📂 Organización del Código

### 📁 Estructura completa del proyecto `PatronStrategy`:
```
📁 PatronStrategy  
   ├── 📁 solucion1  
   │   ├── 📄 DoctorServiceStrategy.java  
   │   ├── 📄 FongDoctorStrategy.java  
   │   ├── 📄 KinderGardenServiceContext.java  
   │   ├── 📄 NoDoctorServiceStrategy.java  
   │   ├── 📄 README.md  
   │   ├── 📄 ServiceStrategy.java  
   │   ├── 📄 TestKinderGardenService.java  
   │   ├── 📄 UML1.drawio  
   │   ├── 🖼️ UML1.drawio.png  
   │   ├── 🖼️ UML1.png  
   │   └── 📄 WangDoctorStrategy.java  
   └── 📁 solucion2  
       ├── 📄 KinderGardenActivityContext.java  
       ├── 📄 README.md  
       ├── 📄 TestKinderGardenService.java  
       ├── 📄 UML2.drawio  
       ├── 🖼️ UML2.drawio.png  
       ├── 🖼️ UML2.png  
       └── 📁 *El resto de archivos necesarios se importan de `solucion1`  
```

---

## 🌟 Soluciones Implementadas

El problema tiene dos enfoques posibles, que ofrecen diferentes grados de control sobre el **orden de ejecución** de las tareas:

### **Solución 1**: Orden Libre de Ejecución (Estrategia Define el Orden)
En esta solución, cada estrategia concreta implementa un único método (`applyServiceStrategy()`) que define cómo y en qué orden se ejecutan las actividades de cada doctor. La interfaz común tiene un método abstracto, lo que otorga a cada doctor la libertad de decidir el orden en el que realiza sus tareas.

- **Ventajas**:
    - Mayor flexibilidad para que cada estrategia gestione sus propias actividades.
    - Requiere menos control por parte del contexto.

- **Componentes**:
    - [`DoctorServiceStrategy`](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/DoctorServiceStrategy.java): Interfaz común para los doctores.
    - [`FongDoctorStrategy`](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/FongDoctorStrategy.java): Estrategia concreta para el Dr. Fong.
    - [`WangDoctorStrategy`](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/WangDoctorStrategy.java): Estrategia concreta para el Dr. Wang.
    - [`KinderGardenServiceContext`](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/KinderGardenServiceContext.java): Contexto que aplica el servicio mediante la delegación por composición.
    - [`TestKinderGardenService`](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1/TestKinderGardenService.java): Clase principal para ejecutar y probar la solución.

- **Código Fuente y UML**:
  [Solución 1](https://github.com/ch0rtas/IS-Diseno_de_Software/tree/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion1)

---

### **Solución 2**: Orden Controlado por el Contexto
En esta solución, la interfaz común tiene tres métodos específicos (`inspectChildren()`, `sendResultsInspection()`, `sendInvoice()`), y es el **contexto** el que controla el orden de ejecución de estas actividades. Las estrategias concretas solo definen cómo se realiza cada tarea, pero no el orden.

- **Ventajas**:
    - El contexto tiene un mayor control sobre la secuencia de operaciones.
    - Permite mantener un comportamiento consistente independientemente de la estrategia utilizada.

- **Componentes**:
    - [`KinderGardenActivityContext`](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2/KinderGardenActivityContext.java): Contexto que controla el orden de las actividades delegando en las estrategias concretas.
    - Estrategias reutilizadas de la **Solución 1** (`FongDoctorStrategy`, `WangDoctorStrategy`).
    - [`TestKinderGardenService`](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2/TestKinderGardenService.java): Clase principal para ejecutar y probar la solución.

- **Código Fuente y UML**:
  [Solución 2](https://github.com/ch0rtas/IS-Diseno_de_Software/tree/main/DisenoSoftware/src/Tema02/PatronStrategy/solucion2)

---

## 💡 Diferencias entre Soluciones

| Aspecto                          | **Solución 1**                              | **Solución 2**                                                    |
|-----------------------------------|---------------------------------------------|-------------------------------------------------------------------|
| **Orden de Ejecución**            | Definido por cada estrategia.               | Controlado por el contexto.                                       |
| **Interfaz Común**                | Método único (`applyServiceStrategy()`).    | Tres métodos (`inspectChildren()`, `sendResultsInspection()` y `sendInvoice`). |
| **Flexibilidad**                  | Estrategias tienen libertad de implementación. | Contexto dicta un orden consistente.                              |
| **Control del Contexto**          | Menor control.                              | Mayor control.                                                    |

Ambas soluciones son válidas, y la elección depende de los requisitos específicos del problema, como la necesidad de flexibilidad frente al control del flujo.

---

## 📬 Contacto

<p align="center">
  Si tienes dudas o quieres colaborar, ¡no dudes en contactarme!
</p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>
