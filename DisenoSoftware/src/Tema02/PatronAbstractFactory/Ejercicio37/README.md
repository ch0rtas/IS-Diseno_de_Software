# Patrón Abstract Factory (Tema 02) - Demon Factory

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Patr%C3%B3n+Abstract+Factory+%7C+Enemy+Factory;Ejercicio+37+del+Tema+02+de+Dise%C3%B1o+de+Software" />
</h1>

<div align="center">
  <strong>🎓 Parte del curso de Ingeniería del Software en U-tad</strong><br>
  🚀 Implementación del Patrón Abstract Factory para crear diferentes tipos de enemigos en un videojuego.
</div>

---

## 📄 Enunciado del Ejercicio

El ejercicio consiste en implementar una solución basada en el **Patrón Abstract Factory** para crear diferentes tipos de enemigos en un videojuego (brujas y demonios) con características similares pero comportamientos diferentes según el mundo en el que aparecen.

**Objetivos principales:**
- Utilizar el patrón Abstract Factory para crear familias de objetos relacionados.
- Implementar diferentes fábricas para cada mundo/nivel del juego.
- Configurar las características de los enemigos según el mundo en que aparecen.
- Asegurar que los enemigos tengan propiedades coherentes dentro de cada mundo.

> [!TIP]  
> **Beneficios del Patrón Abstract Factory:**
> - Aislamiento de clases concretas: El cliente manipula instancias a través de interfaces abstractas.
> - Facilita el intercambio de familias de productos: Cambiar de fábrica afecta a toda la familia de productos.
> - Promueve la consistencia entre productos: Los objetos de una misma familia están diseñados para trabajar juntos.

---

## 📂 Estructura del Proyecto

```
📁 Ejercicio37
   ├── 📄 Daemon.java                    # Interfaz para enemigos de tipo demonio
   ├── 📄 DaemonGameTest.java            # Clase de prueba para ejecutar el juego
   ├── 📄 Enemy.java                     # Interfaz base para todos los enemigos
   ├── 📄 EnemyAbstractFactory.java      # Interfaz para la fábrica abstracta
   ├── 📄 GameController.java            # Controlador singleton para gestionar el juego
   ├── 📄 Witch.java                     # Interfaz para enemigos de tipo bruja
   ├── 📄 World.java                     # Enumeración para los niveles del mundo
   ├── 📄 World1AbstractFactory.java     # Implementación de la fábrica para el Mundo 1
   ├── 📄 World1Daemon.java              # Implementación de demonios del Mundo 1
   ├── 📄 World1Witch.java               # Implementación de brujas del Mundo 1
   ├── 📄 World2AbstractFactory.java     # Implementación de la fábrica para el Mundo 2
   ├── 📄 World2Daemon.java              # Implementación de demonios del Mundo 2
   ├── 📄 World2Witch.java               # Implementación de brujas del Mundo 2
   ├── 📄 UML.drawio                     # Archivo fuente del diagrama UML
   └── 🖼️ UML.png                        # Imagen del diagrama UML de la solución
```

---

## 🌟 Diagrama UML de la Solución

<p align="center">
  <a href="https://github.com/ch0rtas/IS-Diseno_de_Software/blob/main/DisenoSoftware/src/Tema02/PatronAbstractFactory/Ejercicio37/UML.png">
    <img src="https://github.com/ch0rtas/IS-Diseno_de_Software/raw/main/DisenoSoftware/src/Tema02/PatronAbstractFactory/Ejercicio37/UML.png" alt="Diagrama UML" width="600"/>
  </a>
</p>
<p align="center"><i>Figura 1: Diagrama UML del Patrón Abstract Factory implementado.</i></p>

---

## 🛠️ Descripción de la Solución

La solución implementa el patrón Abstract Factory para crear diferentes tipos de enemigos en un videojuego, donde cada mundo tiene sus propias características para los enemigos creados.

### 1. Interfaces Base

#### **Enemy**
Define la interfaz común para todos los tipos de enemigos.
```java
public interface Enemy {
    String getName();
    void setName(String name);
    Integer getPower();
    void setPower(Integer power);
    Integer getLives();
    void setLives(Integer lives);
}
```

#### **Daemon** y **Witch**
Extienden la interfaz Enemy y añaden propiedades específicas para cada tipo de enemigo.
```java
public interface Daemon extends Enemy {
    String getColor();
    void setColor(String color);
}

public interface Witch extends Enemy {
    String getMagicPower();
    void setMagicPower(String magicPower);
}
```

### 2. Fábrica Abstracta

#### **EnemyAbstractFactory**
Define la interfaz para crear familias de enemigos relacionados.
```java
public interface EnemyAbstractFactory {
    Daemon createDaemon();
    Witch createWitch();
    Enemy createEnemy();
}
```

### 3. Fábricas Concretas

#### **World1AbstractFactory** y **World2AbstractFactory**
Implementan la fábrica abstracta para crear enemigos específicos de cada mundo.
```java
public class World1AbstractFactory implements EnemyAbstractFactory {
    @Override
    public Daemon createDaemon() {
        return new World1Daemon("Daemon");
    }

    @Override
    public Witch createWitch() {
        return new World1Witch("Witch");
    }

    @Override
    public Enemy createEnemy() {
        return null; // No utilizado en este ejercicio
    }
}
```

### 4. Productos Concretos

#### **World1Daemon** y **World2Daemon**
Implementaciones concretas de demonios para cada mundo, con diferencias en color y poder.
```java
public class World1Daemon implements Daemon {
    public static final String COLOR_POR_DEFECTO = "rojo";
    // ...
    
    public World1Daemon(String name, String color) {
        super();
        this.name = name;
        this.color = color;
        this.power = 10 * World.LEVEL1.getComplexFactor();
        this.lives = 1 * World.LEVEL1.getComplexFactor();
    }
}
```

#### **World1Witch** y **World2Witch**
Implementaciones concretas de brujas para cada mundo, con diferencias en poderes mágicos.
```java
public class World1Witch implements Witch {
    public static final String MAGIC_POWER_POR_DEFECTO = "Magic wand";
    // ...
    
    public World1Witch(String name, String magicPower) {
        super();
        this.name = name;
        this.magicPower = magicPower;
        this.power = 15 * World.LEVEL1.getComplexFactor();
        this.lives = 2 * World.LEVEL1.getComplexFactor();
    }
}
```

### 5. Controlador del Juego

#### **GameController**
Utiliza el patrón Singleton para gestionar el estado del juego y las fábricas de enemigos.
```java
public class GameController {
    private static GameController instance;
    private EnemyAbstractFactory factory;
    private World currentWorld;

    private GameController() {
        this.currentWorld = World.LEVEL1;
        this.factory = new World1AbstractFactory();
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void play() {
        // Lógica del juego
    }
}
```

### 6. Configuración de Niveles

#### **World**
Enumeración que define los niveles del juego y sus factores de complejidad.
```java
public enum World {
    LEVEL1(1),
    LEVEL2(2);

    private int complexFactor;

    private World(int complexFactor) {
        this.complexFactor = complexFactor;
    }

    public int getComplexFactor() {
        return complexFactor;
    }
}
```

---

## 📊 Características de los Enemigos por Mundo

### Mundo 1
- **Demonios**:
    - Color: Rojo
    - Poder: 10 × factor del mundo (10)
    - Vidas: 1 × factor del mundo (1)

- **Brujas**:
    - Poder mágico: Varita mágica
    - Poder: 15 × factor del mundo (15)
    - Vidas: 2 × factor del mundo (2)

### Mundo 2
- **Demonios**:
    - Color: Verde
    - Poder: 10 × factor del mundo (20)
    - Vidas: 1 × factor del mundo (2)

- **Brujas**:
    - Poder mágico: Varita mágica y escoba mágica
    - Poder: 15 × factor del mundo (30)
    - Vidas: 2 × factor del mundo (4)

---

## 📋 Ejecución del Programa

Al ejecutar la clase de prueba `DaemonGameTest`, obtendremos el siguiente resultado:

```
Empieza el Juego en el Mundo 1

Creamos un demonio en el mundo 1  World1Daemon [name=Daemon, power=10, lives=1, color=rojo]
Creamos una bruja en el mundo 1  World1Witch [name=Witch, power=15, lives=2, magicPower=Magic wand]

Cambiamos de mundo
Creamos un demonio en el mundo 2  World2Daemon [name=Big Daemon, power=20, lives=2, color=verde]
Creamos una bruja en el mundo 2  World2Witch [name=Big Witch, power=30, lives=4, magicPower=Magic wand and magic broom]

Juego finalizado!!
```

---

## 💡 Ventajas del Patrón Implementado

1. **Escalabilidad**: Facilita la adición de nuevos mundos o tipos de enemigos sin modificar el código existente.
2. **Mantenimiento**: La separación de responsabilidades hace que el código sea más fácil de mantener.
3. **Consistencia**: Garantiza que los enemigos de un mismo mundo tengan características coherentes.
4. **Encapsulamiento**: Oculta los detalles de implementación de los enemigos al cliente.
5. **Cambio dinámico**: Permite cambiar la fábrica en tiempo de ejecución para adaptarse a diferentes niveles.

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