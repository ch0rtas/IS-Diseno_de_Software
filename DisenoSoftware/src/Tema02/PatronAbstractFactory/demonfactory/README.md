# Patrón Abstract Factory y Singleton (Tema 02) - Demon Factory

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Patr%C3%B3n+Abstract+Factory+%26+Singleton+%7C+Random+Enemy;Extensi%C3%B3n+del+Ejercicio+37+del+Tema+02+de+Dise%C3%B1o+de+Software" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Implementación combinada de los Patrones Abstract Factory y Singleton para crear enemigos aleatorios en un videojuego.
</div>

---

## 📄 Enunciado del Ejercicio

Partiendo de la solución del Ejercicio 37 (Abstract Factory Pattern - Enemy versión 1), se pide modificarlo para permitir la generación aleatoria de enemigos en ambos mundos con diferentes probabilidades:

- **Mundo 1**: Generación equiprobable (50/50) entre demonios y brujas.
- **Mundo 2**: Mayor probabilidad de generar brujas, con una proporción del 70/30.

**Objetivos principales:**
- Aplicar el patrón Singleton para asegurar que GameController sea único y accesible desde la clase Test.
- Implementar la generación aleatoria de enemigos con las proporciones indicadas.
- Comprobar estadísticamente que se cumplen las proporciones adecuadas en cada mundo/nivel.
- Identificar los componentes que pertenecen al patrón Singleton y al patrón Abstract Factory.

> [!TIP]  
> **Combinación de Patrones de Diseño:**  
> Este ejercicio demuestra cómo combinar múltiples patrones de diseño (Abstract Factory y Singleton) para resolver un problema complejo manteniendo un código modular y fácil de mantener.

---

## 📂 Estructura del Proyecto

La solución combina archivos propios con archivos importados del ejercicio anterior:

### Archivos Propios (demonfactory):
```
📁 demonfactory
   ├── 📄 DaemonGameTest.java            # Clase de prueba para ejecutar el juego
   ├── 📄 EnemyAbstractFactory.java      # Interfaz para la fábrica abstracta (modificada)
   ├── 📄 GameController.java            # Controlador singleton para gestionar el juego (modificado)
   ├── 📄 World1AbstractFactory.java     # Implementación de la fábrica para el Mundo 1 (modificada)
   ├── 📄 World2AbstractFactory.java     # Implementación de la fábrica para el Mundo 2 (modificada)
   ├── 📄 UML.drawio                     # Archivo fuente del diagrama UML
   └── 🖼️ UML.png                        # Imagen del diagrama UML de la solución
```

### Archivos Importados (del Ejercicio37):
```
📁 Ejercicio37 (importados)
   ├── 📄 Daemon.java                    # Interfaz para enemigos de tipo demonio
   ├── 📄 Enemy.java                     # Interfaz base para todos los enemigos
   ├── 📄 Witch.java                     # Interfaz para enemigos de tipo bruja
   ├── 📄 World.java                     # Enumeración para los niveles del mundo
   ├── 📄 World1Daemon.java              # Implementación de demonios del Mundo 1
   ├── 📄 World1Witch.java               # Implementación de brujas del Mundo 1
   ├── 📄 World2Daemon.java              # Implementación de demonios del Mundo 2
   └── 📄 World2Witch.java               # Implementación de brujas del Mundo 2
```

---

## 🌟 Diagrama UML de la Solución

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronAbstractFactory/demonfactory/UML.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronAbstractFactory/demonfactory/UML.png" alt="Diagrama UML" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 1: Diagrama UML del Patrón Abstract Factory con Singleton.</i></p>

### Identificación de Componentes por Patrón

#### Componentes del Patrón Singleton:
- La clase `GameController` con:
    - Atributo estático privado `gameController`
    - Constructor privado
    - Método estático público `getInstance()`

#### Componentes del Patrón Abstract Factory:
- Interfaz `EnemyAbstractFactory` (Fábrica Abstracta)
- Clases `World1AbstractFactory` y `World2AbstractFactory` (Fábricas Concretas)
- Interfaces `Enemy`, `Daemon`, `Witch` (Productos Abstractos)
- Clases `World1Daemon`, `World1Witch`, `World2Daemon`, `World2Witch` (Productos Concretos)

---

## 🛠️ Descripción de la Solución

La solución extiende el patrón Abstract Factory del ejercicio anterior y añade el patrón Singleton para asegurar una instancia única del controlador del juego.

### 1. Patrón Singleton en GameController

El `GameController` se implementa como un Singleton para garantizar que solo exista una instancia:

```java
public class GameController {
    private static GameController gameController = new GameController(new World1AbstractFactory());

    public static GameController getInstance() {
        return gameController;
    }

    private EnemyAbstractFactory enemyAbstractFactory;

    private GameController(EnemyAbstractFactory enemyAbstractFactory) {
        this.enemyAbstractFactory = enemyAbstractFactory;
    }
    
    // Resto de métodos...
}
```

### 2. Generación Aleatoria de Enemigos

Se ha modificado la interfaz `EnemyAbstractFactory` y sus implementaciones para incluir un método `createEnemy()` que genera enemigos aleatoriamente según las probabilidades específicas de cada mundo:

```java
public interface EnemyAbstractFactory {
    Daemon createDaemon();
    Witch createWitch();
    Enemy createEnemy();
}
```

#### Implementación en World1AbstractFactory:
```java
@Override
public Enemy createEnemy() {
    // En el mundo 1, la probabilidad es 50/50
    if (Math.random() < 0.5) {
        return createDaemon();
    } else {
        return createWitch();
    }
}
```

#### Implementación en World2AbstractFactory:
```java
@Override
public Enemy createEnemy() {
    // En el mundo 2, la probabilidad es 30/70
    if (Math.random() < 0.3) {
        return createDaemon();
    } else {
        return createWitch();
    }
}
```

### 3. Verificación Estadística

El método `play()` en `GameController` incluye código para verificar estadísticamente que las proporciones de enemigos generados cumplen con los requisitos:

```java
public void play() {
    // Código de demostración inicial...
    
    // Generación y estadísticas para el Mundo 1
    for (int i = 0; i < maxEnemies; i++) {
        enemies[i] = this.createEnemy();
        if (enemies[i] instanceof Daemon) {
            daemons++;
        } else {
            witches++;
        }
    }
    System.out.println("Daemons (" + daemons + "), Witches (" + witches + ") proportion of Daemons "
            + 100 * daemons / maxEnemies + " %(rounded)");
    
    // Similarmente para el Mundo 2...
}
```

### 4. Uso del Singleton en la Clase Test

La clase `DaemonGameTest` accede a la instancia única de `GameController` mediante el método `getInstance()`:

```java
public class DaemonGameTest {
    public static void main(String[] args) {
        // Accede al objeto único aplicando el patrón Singleton
        GameController game = GameController.getInstance();
        game.play();
    }
}
```

---

## 📊 Resultados de Ejecución

Al ejecutar la clase `DaemonGameTest`, se obtienen resultados similares a los siguientes:

```
Empieza el juego en el Mundo 1
Creamos un demonio en el mundo 1 World1Daemon [name=Daemon, power=10, lives=1, color=rojo]
Creamos una bruja en el mundo 1 World1Witch [name=Witch, power=15, lives=2, magicPower=Magic wand]

Cambiamos de mundo, pasamos al Mundo2
Creamos un demonio en el mundo 2 World2Daemon [name=Big Daemon, power=20, lives=2, color=verde]
Creamos una bruja en el mundo 2 World2Witch [name=Big Witch, power=30, lives=4, magicPower=Magic wand and magic broom]

Reiniciamos, pasamos al Mundo1
Daemons (50), Witches (50) proportion of Daemons 50 %(rounded)
Ejemplo de enemigo aleatorio en el Mundo1 World1Daemon [name=Daemon, power=10, lives=1, color=rojo]

Cambiamos de mundo, pasamos al Mundo2
Daemons (28), Witches (72) proportion of Daemons 28 %(rounded)
Ejemplo de enemigo aleatorio en el Mundo2 World2Witch [name=Big Witch, power=30, lives=4, magicPower=Magic wand and magic broom]

Juego finalizado
```

Estos resultados confirman estadísticamente que:
- En el Mundo 1, la proporción de demonios y brujas es aproximadamente 50/50.
- En el Mundo 2, la proporción se acerca al 30/70 esperado (demonios/brujas).

> [!NOTE]
> Debido a la naturaleza aleatoria de la generación, los porcentajes exactos pueden variar ligeramente en cada ejecución, pero deberían acercarse a las proporciones especificadas con un número suficiente de enemigos generados.

---

## 💡 Ventajas de la Solución Implementada

### Ventajas del Patrón Abstract Factory:
1. **Flexibilidad**: Facilita la adición de nuevos tipos de enemigos o mundos sin modificar el código existente.
2. **Coherencia**: Garantiza la consistencia entre los productos creados por cada fábrica.
3. **Desacoplamiento**: Separa la creación de objetos de su uso, mejorando la modularidad.

### Ventajas del Patrón Singleton:
1. **Acceso global controlado**: Proporciona un punto de acceso único al controlador del juego.
2. **Optimización de recursos**: Evita múltiples instancias innecesarias.
3. **Estado compartido**: Garantiza que todos los componentes trabajen con la misma instancia.

### Ventajas de la Combinación:
1. **Arquitectura robusta**: La combinación de patrones crea un sistema flexible pero controlado.
2. **Separación de responsabilidades**: Cada patrón se encarga de aspectos diferentes del diseño.
3. **Extensibilidad**: Facilita futuras ampliaciones, como añadir nuevos tipos de enemigos o mundos.

---

## 📋 Lecciones Aprendidas

1. **Combinación de Patrones**: Los patrones de diseño a menudo funcionan mejor cuando se combinan estratégicamente para resolver problemas complejos.
2. **Probabilidad en el Diseño**: Incorporar elementos aleatorios controlados puede hacer que un juego sea más interesante y menos predecible.
3. **Validación Estadística**: Verificar estadísticamente el comportamiento aleatorio es esencial para garantizar que funcione según lo previsto.
4. **Reutilización de Código**: El ejercicio muestra cómo extender una solución existente sin tener que reescribir componentes que ya funcionan.

---

## 📬 Contacto

<p align="center">
  Si tienes preguntas o deseas colaborar en proyectos similares, ¡no dudes en contactarme!
</p>

<p align="center">
  <a href="https://www.linkedin.com/in/manuel-mart%C3%ADnez-ram%C3%B3n-415711265/"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white" /></a>
  <a href="mailto:manu08martinez@gmail.com"><img src="https://img.shields.io/badge/Email-%23D14836.svg?logo=gmail&logoColor=white" /></a>
</p>

---

<div align="center">
  <strong>⭐ No olvides darle una estrella al repositorio si te ha resultado útil! ⭐</strong>
</div>