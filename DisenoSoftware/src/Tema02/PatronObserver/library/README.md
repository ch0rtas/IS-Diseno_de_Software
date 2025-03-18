# Patrón Observer (Tema 02) - Library

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
   ├── 📄 ModelPullPushObservable.java
   ├── 📄 ModelPullPushObserver.java
   ├── 📄 StockDepartmentObserver.java
   ├── 📄 README.md
   ├── 📄 UML1.drawio
   ├── 🖼️ UML1.drawio.png
   └── 🖼️ UML1.png
```

---

## 🌟 Diagrama UML de la Solución

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/library/UML.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronObserver/library/UML.png" alt="Diagrama UML" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 1: Diagrama UML generado a partir de la solución.</i></p>

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronObserver/library/UML.drawio">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronObserver/library/UML.drawio.png" alt="Diagrama UML en formato Drawio" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 2: Diagrama UML en formato Draw.io.</i></p>

---


## 🛠️ Descripción de la Solución

La solución se estructura en bloques principales: enumeraciones, clases del modelo, interfaces de patrón Observer, clases observables y observadores concretos, y finalmente una clase de prueba para validar el funcionamiento.

---

### 1. Enumeraciones

#### **BookState**
Representa los posibles estados de un libro: `UNKNOWN`, `GOOD` y `BAD`.  
_Ejemplo (BookState.java):_
```java
public enum BookState {
    UNKNOWN, BAD, GOOD
}
```
Esta enumeración sirve para clasificar los libros y activar notificaciones según su estado.

---

### 2. Clases del Modelo

#### **Book**
Define los atributos básicos de un libro: título, autor y estado. También ofrece métodos para manipular y consultar estos atributos.  
_Ejemplo (Book.java):_
```java
public class Book {
    private String title;
    private String author;
    private BookState bookState;

    public Book(String title, String author, BookState bookState) {
        this.title = title;
        this.author = author;
        this.bookState = bookState;
    }

    public BookState getBookState() {
        return this.bookState;
    }

    @Override
    public String toString() {
        return "Book [title=" + this.title + ", author=" + this.author + ", bookState=" + this.bookState + "]";
    }
}
```
> [!NOTE]
> **Punto Clave:**  
> El atributo `bookState` es fundamental para determinar si un libro debe generar notificaciones.

---

### 3. Interfaces del Patrón Observer

#### **ModelPullPushObservable**
Define los métodos para manejar observadores: `attach`, `detach` y `updateObservers`.  
_Ejemplo (ModelPullPushObservable.java):_
```java
public interface ModelPullPushObservable {
    void attach(ModelPullPushObserver observer);
    void detach(ModelPullPushObserver observer);
    void updateObservers();
}
```
Proporciona un contrato que deben seguir las clases observables.

#### **ModelPullPushObserver**
Define el método `update` que permite a los observadores recibir notificaciones del sujeto observable.  
_Ejemplo (ModelPullPushObserver.java):_
```java
public interface ModelPullPushObserver {
    void update(ModelPullPushObservable observable, Object object);
}
```
Permite manejar notificaciones tanto con datos enviados directamente (Push) como mediante consultas (Pull).

---

### 4. Clase Observable

#### **BookAlarm**
Implementa la interfaz `ModelPullPushObservable` y actúa como el sujeto que notifica a los observadores cuando un libro en mal estado es devuelto.  
_Ejemplo (BookAlarm.java):_
```java
public class BookAlarm implements ModelPullPushObservable {
    private List<ModelPullPushObserver> observers;
    private Book book;

    public void setBook(Book book) {
        this.book = book;
        updateObservers();
    }

    @Override
    public void updateObservers() {
        for (ModelPullPushObserver observer : observers) {
            observer.update(this, this.book);
        }
    }
}
```
> [!NOTE]
> **Nota Importante:**  
> La clase `BookAlarm` soporta notificaciones por Push (enviando el libro directamente) y Pull (permitiendo consultar el último libro notificado).

---

### 5. Clase Controladora

#### **Library**
Encapsula la lógica de negocio asociada a la devolución de libros y actúa como un mediador entre los libros y los observadores.  
_Ejemplo (Library.java):_
```java
public class Library {
    private BookAlarm bookAlarm;

    public void returnBook(Book book) {
        if (book.getBookState().equals(BookState.BAD)) {
            this.bookAlarm.setBook(book);
        }
    }
}
```
> [!NOTE]
> **Punto Clave:**  
> La biblioteca verifica si el libro devuelto está en mal estado antes de activar la alarma.

---

### 6. Clases Concretas de Observadores

Cada observador implementa la interfaz `ModelPullPushObserver` y define su comportamiento frente a las notificaciones:

#### **AdminDepartmentObserver**
Representa al departamento de administración.  
_Ejemplo:_
```java
public class AdminDepartmentObserver implements ModelPullPushObserver {
    @Override
    public void update(ModelPullPushObservable observable, Object object) {
        if (object != null) {
            System.out.println("[AdminDepartmentObserver Push] Libro en mal estado: " + object);
        } else {
            System.out.println("[AdminDepartmentObserver Pull] Libro en mal estado: " + ((BookAlarm) observable).getBook());
        }
    }
}
```

#### **ComprasDepartmentObserver**
Representa al departamento de compras.  
_Ejemplo:_
```java
public class ComprasDepartmentObserver implements ModelPullPushObserver {
    @Override
    public void update(ModelPullPushObservable observable, Object object) {
        System.out.println("[ComprasDepartmentObserver Push] Libro en mal estado: " + object);
    }
}
```

#### **StockDepartmentObserver**
Representa al departamento de stock.  
_Ejemplo:_
```java
public class StockDepartmentObserver implements ModelPullPushObserver {
    @Override
    public void update(ModelPullPushObservable observable, Object object) {
        System.out.println("[StockDepartmentObserver Pull] Libro en mal estado: " + ((BookAlarm) observable).getBook());
    }
}
```

---

### 7. Clase de Prueba

#### **LibraryPullPushObserverTest**
Valida la funcionalidad del patrón Observer. Simula la devolución de libros en buen y mal estado, así como la suscripción y desuscripción de observadores.  
_Ejemplo:_
```java
public class LibraryPullPushObserverTest {
    public static void main(String[] args) {
        Library library = new Library();
        ModelPullPushObserver stockObserver = new StockDepartmentObserver();
        ModelPullPushObserver adminObserver = new AdminDepartmentObserver();
        ModelPullPushObserver comprasObserver = new ComprasDepartmentObserver();

        library.attachObserver(stockObserver);
        library.attachObserver(adminObserver);
        library.attachObserver(comprasObserver);

        Book bookGood = new Book("Gang of Four Design Patterns", "Erich Gamma", BookState.GOOD);
        Book bookBad = new Book("Clean Code", "Robert C. Martin", BookState.BAD);

        library.returnBook(bookGood);  // No notifica
        library.returnBook(bookBad);  // Notifica a los observadores

        library.detachObserver(comprasObserver);
        Book anotherBookBad = new Book("Code Complete", "Steve McConnell", BookState.BAD);
        library.returnBook(anotherBookBad);  // Notifica solo a los observadores restantes
    }
}
```

---

### 📜 Ejecución de la Solución

La salida esperada al ejecutar la clase de prueba es la siguiente:

```plaintext
Alarma notifica bajo protocolo PULL-PUSH
[AdminDepartmentObserver Push] Libro en mal estado: Book [title=Clean Code, author=Robert C. Martin, bookState=BAD]
[ComprasDepartmentObserver Push] Libro en mal estado: Book [title=Clean Code, author=Robert C. Martin, bookState=BAD]
[StockDepartmentObserver Pull] Libro en mal estado: Book [title=Clean Code, author=Robert C. Martin, bookState=BAD]

Alarma vuelve a notificar bajo protocolo PULL-PUSH
[AdminDepartmentObserver Push] Libro en mal estado: Book [title=Code Complete, author=Steve McConnell, bookState=BAD]
[StockDepartmentObserver Pull] Libro en mal estado: Book [title=Code Complete, author=Steve McConnell, bookState=BAD]
```

> [!TIP]
> **Observación:**  
> Este ejercicio demuestra cómo el patrón Observer maneja las notificaciones dinámicamente, adaptándose a cambios en tiempo de ejecución.

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
