# Patrón State (Tema 02) - Biblioteca

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Patr%C3%B3n+State+%7C+Soluci%C3%B3n;Ejercicio+del+Tema+02+de+Dise%C3%B1o+de+Software" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Implementación del Patrón State para gestionar el ciclo de vida de préstamos bibliotecarios.
</div>

---

## 📄 Enunciado del Ejercicio

El ejercicio consiste en implementar una solución basada en el **Patrón State** para gestionar el ciclo de vida completo de los préstamos en una biblioteca universitaria, donde los diferentes estados del préstamo determinan las operaciones disponibles y las notificaciones enviadas a los usuarios.

**Objetivos principales:**
- Utilizar el patrón State para gestionar las transiciones entre los diferentes estados de un préstamo bibliotecario.
- Implementar un sistema de notificaciones utilizando el patrón Observer y el patrón Strategy.
- Manejar diferentes tipos de usuarios (estudiantes y profesores) con diferentes políticas de préstamo.
- Asegurar que cada estado define claramente qué operaciones están permitidas y cuáles no.
- Combinar los patrones Singleton, State, Observer y Strategy en una solución integrada.

El mecanismo se basa en que cada préstamo tiene un ciclo de vida definido (creado → admitido → procesado → finalizado) y cada transición genera notificaciones específicas al usuario.

> [!TIP]  
> **Beneficios del Patrón State:**
> - Reduce la complejidad de gestionar comportamientos dependientes del estado.
> - Elimina las sentencias condicionales complejas.
> - Facilita la adición de nuevos estados sin modificar el código existente.
> - Encapsula el comportamiento específico de cada estado en clases separadas.

---

## 📂 Estructura del Proyecto

La solución se encuentra organizada con la siguiente estructura:

```
📁 Tema02.PatronState.library
   ├── 📄 AdmittedLibraryLoanState.java          # Estado de préstamo admitido
   ├── 📄 CreatedLibraryLoanState.java           # Estado inicial de préstamo creado
   ├── 📄 CreatedPushNotificationStrategy.java   # Estrategia de notificación para préstamos creados
   ├── 📄 DeclinedLibraryLoanState.java          # Estado de préstamo rechazado
   ├── 📄 FinishedLibraryLoanState.java          # Estado final de préstamo completado
   ├── 📄 FinishedPushNotificationStrategy.java  # Estrategia de notificación para préstamos finalizados
   ├── 📄 LibraryLoanNotification.java           # Sistema de notificaciones para préstamos
   ├── 📄 LibraryLoanRequestContext.java         # Contexto principal del patrón State
   ├── 📄 LibraryLoanState.java                  # Interfaz básica para todos los estados
   ├── 📄 LibraryLoanStateTransition.java        # Interfaz con las transiciones permitidas
   ├── 📄 LibraryLoanTest.java                   # Clase de prueba del sistema
   ├── 📄 LibraryPushNotificationStrategy.java   # Estrategia abstracta de notificaciones
   ├── 📄 LibraryUser.java                       # Usuario de la biblioteca
   ├── 📄 LoansLibrary.java                      # Singleton de la biblioteca
   ├── 📄 NotificationStrategy.java              # Interfaz para estrategias de notificación
   ├── 📄 PickupPushNotificationStrategy.java    # Estrategia de notificación para recogida de libros
   ├── 📄 ProcessedLibraryLoanState.java         # Estado de préstamo procesado
   ├── 📄 PushNotificationStrategy.java          # Implementación de notificaciones push
   ├── 📄 README.md
   ├── 📄 UML.drawio
   ├── 🖼️ UML.drawio.png
   ├── 🖼️ UML.png
   └── 📄 UserType.java                          # Enumerado para tipos de usuario
```

---

## 🌟 Diagrama UML de la Solución

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronState/library/UML.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronState/library/UML.png" alt="Diagrama UML" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 1: Diagrama UML generado con IntelliJ.</i></p>

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronState/library/UML.drawio">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronState/library/UML.drawio.png" alt="Diagrama UML en formato Drawio" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 2: Diagrama UML en formato Draw.io.</i></p>

---

## 🛠️ Descripción de la Solución

La solución se estructura en varios bloques principales que trabajan juntos para implementar un sistema completo de gestión de préstamos bibliotecarios.

---

### 1. Tipos de Usuario y Características

#### **UserType**
Define los tipos de usuarios de la biblioteca y sus derechos de préstamo.

```java
public enum UserType {
    STUDENT(15),   // Estudiantes: 15 días de préstamo
    PROFESSOR(10); // Profesores: 10 días de préstamo

    private final int loanDays;
    
    // Métodos getter...
}
```

#### **LibraryUser**
Representa a un usuario de la biblioteca que puede solicitar préstamos y recibir notificaciones.

```java
public class LibraryUser implements ModelPullPushObserver {
    private String name;
    private String address;
    private UserType userType;
    private Boolean activeAccount;
    
    // Constructor y métodos...
    
    public void update(ModelPullPushObservable observable, Object object) {
        System.out.println(object);
    }
}
```
> [!NOTE]
> **Punto Clave:**  
> Los usuarios implementan la interfaz `ModelPullPushObserver` para poder recibir notificaciones.

---

### 2. Estados del Préstamo

El sistema define un conjunto de estados posibles para los préstamos, cada uno con comportamiento específico:

#### **LibraryLoanState y LibraryLoanStateTransition**
Interfaces que definen el comportamiento común y las transiciones posibles entre estados.

```java
public interface LibraryLoanState {
    void process();
}

public interface LibraryLoanStateTransition extends LibraryLoanState {
    void admitLibraryLoan();
    void pickupLibraryLoan();
    void returnLibraryLoan();
    void declineLibraryLoan();
}
```

#### **CreatedLibraryLoanState**
Estado inicial cuando se crea una solicitud de préstamo.

```java
public class CreatedLibraryLoanState implements LibraryLoanStateTransition {
    // ...
    
    public void process() {
        if (this.libraryLoanRequestContext.getLibraryUser().getActiveAccount()) {
            this.admitLibraryLoan();
        } else {
            this.declineLibraryLoan();
        }
    }
    
    public void admitLibraryLoan() {
        this.libraryLoanRequestContext.setCreatedDate(LocalDate.now());
        this.libraryLoanRequestContext.setCurrentState(
                this.libraryLoanRequestContext.getAdmittedLibraryLoanState());
        // Notificación al usuario
        this.libraryLoanRequestContext.getLibraryLoanNotification().notifyRequestObserver(
                libraryLoanRequestContext.getLibraryUser(),
                new CreatedPushNotificationStrategy());
    }
}
```

#### **AdmittedLibraryLoanState**
Estado cuando la solicitud ha sido admitida y está pendiente de recogida.

```java
public class AdmittedLibraryLoanState implements LibraryLoanStateTransition {
    // ...
    
    public void process() {
        LocalDate createdDate = this.libraryLoanRequestContext.getCreatedDate();
        LocalDate reservedUntilDate = createdDate.plusDays(2);
        LocalDate nowDate = LocalDate.now();
        if (nowDate.compareTo(reservedUntilDate) <= 0) {
            this.pickupLibraryLoan();
        } else {
            this.declineLibraryLoan();
        }
    }
}
```

#### **ProcessedLibraryLoanState**
Estado cuando el libro ha sido recogido y está en posesión del usuario.

#### **FinishedLibraryLoanState**
Estado final cuando el libro ha sido devuelto correctamente.

#### **DeclinedLibraryLoanState**
Estado cuando la solicitud ha sido rechazada o cancelada.

> [!IMPORTANT]
> Cada estado implementa las transiciones permitidas y lanza excepciones para operaciones no válidas en ese estado.

---

### 3. Contexto del State Pattern

#### **LibraryLoanRequestContext**
El contexto que mantiene una referencia al estado actual y gestiona las transiciones entre estados.

```java
public class LibraryLoanRequestContext {
    private LibraryLoanState currentState;
    private CreatedLibraryLoanState createdLibraryLoanState;
    private AdmittedLibraryLoanState admittedLibraryLoanState;
    private ProcessedLibraryLoanState processedLibraryLoanState;
    private FinishedLibraryLoanState finishedLibraryLoanState;
    private DeclinedLibraryLoanState declinedLibraryLoanState;
    
    private LibraryLoanNotification libraryLoanNotification;
    private LoansLibrary loansLibrary;
    private Book book;
    private LibraryUser libraryUser;
    
    private LocalDate createdDate;
    private LocalDate pickupDate;
    
    // Constructor y métodos...
    
    public void process() {
        this.currentState.process(); // Delegación por composición
    }
}
```

---

### 4. Sistema de Notificaciones

#### **NotificationStrategy y Derivadas**
Interfaces y clases que implementan el patrón Strategy para manejar diferentes tipos de notificaciones.

```java
public interface NotificationStrategy {
    void update(ModelPullPushObserver modelObserver, ModelPullPushObservable modelObservable, Object object);
}

public abstract class LibraryPushNotificationStrategy extends PushNotificationStrategy {
    public abstract void update(LibraryUser libraryUser, LibraryLoanNotification libraryLoanNotification);
}
```

#### **Estrategias de Notificación Específicas**

- **CreatedPushNotificationStrategy**: Notifica al usuario cuando su solicitud ha sido aceptada.
- **PickupPushNotificationStrategy**: Notifica al usuario cuando recoge el libro, indicando la fecha límite de devolución.
- **FinishedPushNotificationStrategy**: Notifica al usuario cuando ha completado la devolución del libro.

```java
public class PickupPushNotificationStrategy extends LibraryPushNotificationStrategy {
    public void update(LibraryUser libraryUser, LibraryLoanNotification libraryLoanNotification) {
        LocalDate pickupDate = libraryLoanNotification.getLibraryLoanRequestContext().getPickupDate();
        int days = libraryLoanNotification.getLibraryLoanRequestContext().getLibraryUser().getUserType().getLoanDays();
        LocalDate dueDate = pickupDate.plusDays(days);
        
        String user = libraryLoanNotification.getLibraryLoanRequestContext().getLibraryUser().getName();
        String userNotification = "Notification to user : " + user +
                ", library loan pickup on " + pickupDate.toString() +
                ", due date to return " + dueDate +
                " days(" + days + ")";
                
        this.update(libraryUser, libraryLoanNotification, userNotification);
    }
}
```

---

### 5. Biblioteca (Singleton)

#### **LoansLibrary**
Implementa el patrón Singleton para asegurar una única instancia de la biblioteca en el sistema.

```java
public class LoansLibrary extends Library {
    private static LoansLibrary loansLibrary;

    private LoansLibrary() {
        super();
    }

    static {
        loansLibrary = new LoansLibrary();
    }

    public static LoansLibrary getInstance() {
        return loansLibrary;
    }
    
    public void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext) {
        super.returnBook(book);
        this.processLibraryLoan(libraryLoanRequestContext);
    }
    
    public void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext) {
        libraryLoanRequestContext.process(); // Delegación por inyección
    }
}
```

---

### 6. Clase de Prueba

#### **LibraryLoanTest**
Demuestra el funcionamiento del sistema completo de préstamos, incluyendo la creación, aceptación, recogida y devolución de libros.

```java
public class LibraryLoanTest {
    public static void main(String[] args) {
        LoansLibrary library = LoansLibrary.getInstance(); // Singleton

        Book bookGood = new Book("Design Patterns: Elements of Reusable Object-Oriented Software",
                "Gang of Four", BookState.GOOD);

        LibraryUser professor = new LibraryUser("MA",
                "mesas@u-tad.com", UserType.PROFESSOR, true);
        LibraryUser student = new LibraryUser("Ines",
                "ines@live.u-tad.com", UserType.STUDENT, true);

        LibraryLoanRequestContext professorLoanRequest =
                new LibraryLoanRequestContext(library, bookGood, professor);
        LibraryLoanRequestContext studentLoanRequest =
                new LibraryLoanRequestContext(library, bookGood, student);

        // Procesamiento de préstamos...
        // ...
    }
}
```

---

## 📚 Flujo de Trabajo del Sistema

El sistema sigue el siguiente flujo:

1. **Creación de la solicitud**: Un usuario solicita un libro.
2. **Validación de la cuenta**: Se verifica si el usuario tiene una cuenta activa.
3. **Admisión del préstamo**: Si la validación es exitosa, la solicitud pasa al estado "admitido".
4. **Notificación al usuario**: Se informa al usuario que tiene 2 días para recoger el libro.
5. **Recogida del libro**: Si el usuario recoge el libro dentro del plazo, la solicitud pasa al estado "procesado".
6. **Notificación de fechas**: Se informa al usuario sobre la fecha límite de devolución (15 días para estudiantes, 10 para profesores).
7. **Devolución del libro**: Cuando el usuario devuelve el libro, la solicitud pasa al estado "finalizado".
8. **Notificación de devolución**: Se confirma al usuario la recepción del libro y su estado.

> [!NOTE]
> Si en cualquier punto no se cumple alguna condición (cuenta inactiva, plazo de recogida vencido), la solicitud pasa al estado "rechazado".

---

## 💡 Ventajas de la Solución

1. **Separación de Responsabilidades**: Cada estado encapsula su propio comportamiento, facilitando la comprensión y mantenimiento del código.
2. **Extensibilidad**: Es fácil añadir nuevos estados o modificar el comportamiento de los existentes sin afectar a otros componentes.
3. **Eliminación de Condicionales Complejos**: Al utilizar el patrón State, se evitan largas cadenas de condiciones para determinar el comportamiento según el estado.
4. **Notificaciones Personalizadas**: El uso del patrón Strategy para las notificaciones permite adaptar los mensajes según el tipo de evento.
5. **Integración de Patrones**: La solución demuestra cómo varios patrones de diseño pueden trabajar juntos para crear un sistema robusto y flexible.

---

## 📝 Conclusiones

El patrón State proporciona una forma elegante de gestionar el comportamiento dependiente del estado en el sistema de préstamos bibliotecarios. Al encapsular cada estado en una clase separada, la solución consigue:

- Mayor claridad en el código
- Fácil extensión del sistema
- Menor propensión a errores
- Mejor mantenibilidad a largo plazo

Además, la combinación con otros patrones como Observer, Strategy y Singleton aumenta la flexibilidad y escalabilidad del sistema.

---

## 📬 Contacto

<p align="center">
  Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme!
</p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>