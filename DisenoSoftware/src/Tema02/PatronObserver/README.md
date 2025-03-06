# Patrón Observer (Tema 02) - Solución Observer

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Patr%C3%B3n+Observer+%7C+Soluci%C3%B3n+Observer;Ejercicio+del+Tema+02+de+Dise%C3%B1o+de+Software" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Implementación del Patrón Observer para notificar la devolución de libros en mal estado.
</div>

---

## 📄 Enunciado del Ejercicio

El ejercicio consiste en implementar una solución basada en el **Patrón Observer** para gestionar el hecho de que un libro devuelto en mal estado en la biblioteca dispare una notificación a las áreas afectadas: Stock, Compras y Administración.

**Objetivos principales:**
- Utilizar el patrón Observer para notificar cuando se devuelve un libro en mal estado.
- Soportar dos protocolos de notificación: **Push** (el observable envía la variable de estado) y **Pull** (los observadores consultan el estado en el observable).
- Permitir que los observadores se suscriban y desuscriban dinámicamente.
- Asegurar que cada observador valide que recibe la información esperada antes de procesarla.

El mecanismo se basa en que, al llamar al método `returnBook()` de la clase `Library`, si el libro se encuentra en mal estado, se actualiza el observable (`BookAlarm`) y se notifica a todos los observadores suscritos.

> [!TIP]  
> **Beneficios del Patrón Observer:**  
> - Desacoplamiento: Los observadores se mantienen informados de los cambios sin estar directamente vinculados.
> - Escalabilidad: Fácil agregar nuevos observadores sin modificar el sujeto.
> - Flexibilidad: Notificaciones en tiempo real cuando el estado cambia.

---

## 📂 Estructura de la carpeta

La solución se encuentra en la carpeta `PatronObserver` con la siguiente estructura:

```
📁 PatronObserver
   ├── 📄 AdminDepartmentObserver.java
   ├── 📄 Book.java
   ├── 📄 BookAlarm.java
   ├── 📄 BookState.java
   ├── 📄 ComprasDepartmentObserver.java
   ├── 📄 Library.java
   ├── 📄 LibraryPullPushObserverTest.java
   ├── 📄 PullPushModelObservable.java
   ├── 📄 PullPushObserver.java
   ├── 📄 StockDepartmentObserver.java
   ├── 📄 README.md
   ├── 📄 UML1.drawio
   ├── 🖼️ UML1.drawio.png
   └── 🖼️ UML1.png
```

---

## 🌟 Diagrama UML de la Solución

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/UML1.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronObserver/UML1.png" alt="Diagrama UML" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 1: Diagrama UML generado a partir de la solución.</i></p>

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/UML1.drawio">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronObserver/UML1.drawio.png" alt="Diagrama UML en formato Drawio" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 2: Diagrama UML en formato Draw.io.</i></p>

---

## 🛠️ Descripción de la Solución

La implementación se estructura en cuatro bloques principales: interfaces básicas, clases del modelo y observable, observadores concretos y la clase de prueba.

### 1. Interfaces Básicas

#### **PullPushObserver**
Define el método `update(PullPushModelObservable observable, Object arg)` que permite a cada observador recibir notificaciones.  
_Ejemplo (PullPushObserver.java):_
```java
public interface PullPushObserver {
    // 'observable': sujeto notificador; 'arg': variable de estado enviada (push).
    void update(PullPushModelObservable observable, Object arg);
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/PullPushObserver.java)

Esta interfaz garantiza que todos los observadores pueden manejar notificaciones mediante ambos protocolos.

> [!IMPORTANT]  
> **Punto Clave:**  
> La interfaz `PullPushObserver` permite gestionar notificaciones tanto por el protocolo Push como Pull, proporcionando flexibilidad a los observadores para adaptarse a sus necesidades.

#### **PullPushModelObservable**
Define los métodos para la gestión de observadores: `attach()`, `detach()` y `notifyObservers()`.  
_Ejemplo (PullPushModelObservable.java):_
```java
public interface PullPushModelObservable {
    void attach(PullPushObserver observer);
    void detach(PullPushObserver observer);
    void notifyObservers();
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/PullPushModelObservable.java)

Permite al observable gestionar dinámicamente su lista de observadores.

---

### 2. Clases del Modelo y del Observable

#### **Book**
Representa la entidad libro, con atributos `title`, `author` y `bookState` (que indica si está en buen o mal estado).  
_Ejemplo (Book.java):_
```java
public class Book {
    private String title;
    private String author;
    private BookState bookState;
    
    // Constructor, getters y método toString()
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/Book.java)

Esta clase encapsula la información que se necesita para evaluar si un libro debe disparar una notificación.

#### **BookState**
Enumera los posibles estados de un libro: `GOOD` y `BAD`.  
_Ejemplo (BookState.java):_
```java
public enum BookState {
    GOOD,
    BAD
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/BookState.java)

Utilizado para determinar si la devolución de un libro debe generar una alerta.

#### **BookAlarm**
Implementa la interfaz `PullPushModelObservable` y actúa como el sujeto observable.  
Responsable de:
- Mantener la lista de observadores.
- Almacenar la variable de estado (`lastBadBook`).
- Notificar a todos los observadores cuando se detecta un libro en mal estado.  
  _Ejemplo (BookAlarm.java):_
```java
public class BookAlarm implements PullPushModelObservable {
    private Book lastBadBook;
    private List<PullPushObserver> observers = new ArrayList<>();

    @Override
    public void attach(PullPushObserver observer) { observers.add(observer); }
    @Override
    public void detach(PullPushObserver observer) { observers.remove(observer); }
    @Override
    public void notifyObservers() {
        for (PullPushObserver observer : observers) {
            observer.update(this, lastBadBook); // Se notifica mediante push.
        }
    }
    
    public void setLastBadBook(Book book) { this.lastBadBook = book; }
    public Book getLastBadBook() { return lastBadBook; }
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/BookAlarm.java)

Soporta notificaciones push (envío directo del objeto) y pull (los observadores consultan mediante `getLastBadBook()`).

#### **Library**
Actúa como el disparador de la notificación.  
Contiene una instancia de `BookAlarm` y el método `returnBook(Book book)` que:
- Comprueba el estado del libro.
- Si el libro está en mal estado (`BookState.BAD`), actualiza la alarma y notifica a los observadores.  
  _Ejemplo (Library.java):_
```java
public class Library {
    private BookAlarm bookAlarm;

    public Library() {
        this.bookAlarm = new BookAlarm();
    }

    public BookAlarm getBookAlarm() { return bookAlarm; }
    
    // Devuelve un libro y notifica si está en mal estado.
    public void returnBook(Book book) {
        if (book.getBookState() == BookState.BAD) {
            bookAlarm.setLastBadBook(book);
            bookAlarm.notifyObservers();
        }
    }
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/Library.java)

Esta clase encapsula la lógica de negocio asociada a la devolución de libros.

> [!NOTE]  
> **Recomendación para Pruebas:**  
> Ejecuta la clase `LibraryPullPushObserverTest` para observar cómo se alternan las estrategias en tiempo real. Esto ilustra claramente el beneficio del patrón Observer en aplicaciones con comportamientos variables.

---

### 3. Clases Concretas de Observadores

Cada observador implementa la interfaz `PullPushObserver` y define cómo reaccionar ante la notificación, comprobando si recibe la variable de estado mediante push o, en su defecto, consultándola mediante pull.

#### **StockDepartmentObserver**
Representa el departamento de Stock.  
_Ejemplo (StockDepartmentObserver.java):_
```java
public class StockDepartmentObserver implements PullPushObserver {
    @Override
    public void update(PullPushModelObservable observable, Object arg) {
        if (observable instanceof BookAlarm) {
            BookAlarm alarm = (BookAlarm) observable;
            if (arg instanceof Book) {
                System.out.println("[StockDepartmentObserver Push] se ha devuelto el libro en mal estado");
                System.out.println(arg);
            } else {
                System.out.println("[StockDepartmentObserver Pull] se ha devuelto el libro en mal estado");
                System.out.println(alarm.getLastBadBook());
            }
        }
    }
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/StockDepartmentObserver.java)

> [!IMPORTANT]  
> **Punto Clave:** 
> Los observadores utilizan tanto el protocolo Push (cuando el observable envía el objeto directamente) como el protocolo Pull (cuando el observador consulta al observable para obtener el estado).

> [!TIP]  
> **Recomendación:**  
> Utiliza preferentemente el protocolo Push para evitar consultas adicionales, pero en caso de no recibir el objeto, recurre al protocolo Pull para consultar el estado directamente desde el observable.

#### **ComprasDepartmentObserver**
Representa el departamento de Compras.  
_Ejemplo (ComprasDepartmentObserver.java):_
```java
public class ComprasDepartmentObserver implements PullPushObserver {
    @Override
    public void update(PullPushModelObservable observable, Object arg) {
        if (observable instanceof BookAlarm) {
            if (arg instanceof Book) {
                System.out.println("[ComprasDepartmentObserver Push] se ha devuelto el libro en mal estado");
                System.out.println(arg);
            } else {
                System.out.println("[ComprasDepartmentObserver Pull] se ha devuelto el libro en mal estado");
                System.out.println(((BookAlarm)observable).getLastBadBook());
            }
        }
    }
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/ComprasDepartmentObserver.java)

> [!NOTE]  
> **Importante:**  
> Los mensajes que se muestran en cada observador son específicos para su contexto, permitiendo a cada departamento recibir notificaciones detalladas sobre la devolución de libros en mal estado.

#### **AdminDepartmentObserver**
Representa el departamento de Administración.  
_Ejemplo (AdminDepartmentObserver.java):_
```java
public class AdminDepartmentObserver implements PullPushObserver {
    @Override
    public void update(PullPushModelObservable observable, Object arg) {
        if (observable instanceof BookAlarm) {
            if (arg instanceof Book) {
                System.out.println("[AdminDepartmentObserver Push] se ha devuelto el libro en mal estado");
                System.out.println(arg);
            } else {
                System.out.println("[AdminDepartmentObserver Pull] se ha devuelto el libro en mal estado");
                System.out.println(((BookAlarm)observable).getLastBadBook());
            }
        }
    }
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/AdminDepartmentObserver.java)

> [!IMPORTANT]  
> **Punto Clave:**  
> Cada observador debe ser capaz de procesar tanto las notificaciones recibidas por push como las obtenidas mediante pull, garantizando así que todos los departamentos estén siempre actualizados, independientemente del protocolo utilizado.

---

### 4. Clase de Prueba: LibraryPullPushObserverTest

Esta clase contiene el método `main()` para demostrar la funcionalidad de la solución:

- Se instancia la biblioteca y los tres observadores.
- Los observadores se suscriben a la alarma de libros (`BookAlarm`).
- Se simula la devolución de un libro en buen estado (sin notificación) y de otro en mal estado (activando las notificaciones).
- Se desuscribe el observador de Compras y se realiza una nueva notificación.

#### Ejemplo (LibraryPullPushObserverTest.java):

```java
public class LibraryPullPushObserverTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Instanciación de observadores
        StockDepartmentObserver stockObserver = new StockDepartmentObserver();
        AdminDepartmentObserver adminObserver = new AdminDepartmentObserver();
        ComprasDepartmentObserver comprasObserver = new ComprasDepartmentObserver();

        // Suscripción de observadores a la alarma
        library.getBookAlarm().attach(stockObserver);
        library.getBookAlarm().attach(adminObserver);
        library.getBookAlarm().attach(comprasObserver);

        Book bookGood = new Book("Gang of four Design patterns", "Erich Gamma, Richard Helm", BookState.GOOD);
        Book bookBad = new Book("Programar sin patrones", "desconocido", BookState.BAD);

        System.out.println("Alarma notifica bajo protocolo PULL-PUSH");
        // Libro en buen estado, no se notifica
        library.returnBook(bookGood);
        // Libro en mal estado, se notifica a todos los observadores
        library.returnBook(bookBad);

        // Desuscribimos el departamento de Compras
        library.getBookAlarm().detach(comprasObserver);

        System.out.println("Alarma vuelve a notificar bajo protocolo PULL-PUSH");
        Book otherBookBad = new Book("Programar sin pensar", "desconocido", BookState.BAD);
        library.returnBook(otherBookBad);
    }
}
```
[Ver código completo](https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/LibraryPullPushObserverTest.java)

Esta clase demuestra la correcta interacción entre el observable y los observadores, así como la capacidad de gestionar suscripciones dinámicamente.

---

## 📜 Ejecución de la Solución

Al ejecutar la clase `LibraryPullPushObserverTest`, se podrán observar en la consola los mensajes que indican:

1. La notificación inicial a todos los departamentos cuando se devuelve un libro en mal estado.
2. La notificación subsecuente, tras desuscribir el departamento de Compras, donde solo los observadores restantes reciben la alerta.

> [!NOTE]  
> **Observación:**  
> Este ejercicio demuestra cómo la solución permite gestionar las suscripciones y las notificaciones dinámicamente, asegurando que la lógica de negocio es flexible y escalable.

### Ejemplo de Salida:

```plaintext
Alarma notifica bajo protocolo PULL-PUSH
[StockDepartmentObserver Push] se ha devuelto el libro en mal estado
Book [title=Programar sin patrones, author=desconocido, bookState=BAD]
[AdminDepartmentObserver Push] se ha devuelto el libro en mal estado
Book [title=Programar sin patrones, author=desconocido, bookState=BAD]
[ComprasDepartmentObserver Push] se ha devuelto el libro en mal estado
Book [title=Programar sin patrones, author=desconocido, bookState=BAD]

Alarma vuelve a notificar bajo protocolo PULL-PUSH
[StockDepartmentObserver Push] se ha devuelto el libro en mal estado
Book [title=Programar sin pensar, author=desconocido, bookState=BAD]
[AdminDepartmentObserver Push] se ha devuelto el libro en mal estado
Book [title=Programar sin pensar, author=desconocido, bookState=BAD]
```

---

## 💡 Ventajas de la Solución

1. **Desacoplamiento:** Los observadores y el observable están separados, lo que permite modificar o agregar nuevos observadores sin alterar la lógica central.
2. **Flexibilidad:** Soporta notificaciones tanto por protocolo Push como Pull, adaptándose a la necesidad de cada observador.
3. **Extensibilidad:** Es sencillo incorporar nuevos departamentos o modificar la forma en que se notifica un evento.
4. **Control Dinámico:** Los observadores pueden suscribirse o desuscribirse en tiempo de ejecución, facilitando la gestión dinámica de notificaciones.

---

## 📬 Contacto

<p align="center">
  Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme!
</p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>
