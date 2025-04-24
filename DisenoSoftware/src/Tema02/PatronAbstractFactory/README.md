# 🏭 Patrones de Diseño: Abstract Factory

<h1 align="center">
  <img src="https://readme-typing-svg.demolab.com/?font=Poppins&size=40&duration=4000&pause=1200&color=007CF0&center=true&vCenter=true&width=900&height=70&lines=Patr%C3%B3n+Abstract+Factory;Tema+02+%7C+Dise%C3%B1o+de+Software" />
</h1>

<div align="center">
  <strong>🎓 Colección de implementaciones del patrón Abstract Factory</strong><br>
  🚀 Ejercicios del curso de Ingeniería del Software en U-tad
</div>

---

## 📚 Acerca del Patrón Abstract Factory

El patrón Abstract Factory es un patrón de diseño creacional que proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas. Este patrón es particularmente útil cuando:

- Un sistema debe ser independiente de cómo se crean sus productos
- Un sistema debe trabajar con múltiples familias de productos
- Se requiere una garantía de que los productos de una familia trabajen juntos
- Se desea proporcionar una biblioteca de clases revelando solo sus interfaces, no sus implementaciones

### Estructura básica:

- **Abstract Factory**: Declara una interfaz para operaciones que crean productos abstractos
- **Concrete Factory**: Implementa las operaciones para crear productos concretos
- **Abstract Product**: Declara una interfaz para un tipo de producto
- **Concrete Product**: Define un producto creado por una fábrica concreta
- **Client**: Utiliza solo las interfaces declaradas por Abstract Factory y Abstract Product

---

## 🎮 Ejercicios Disponibles

Esta carpeta contiene implementaciones del patrón Abstract Factory aplicadas a la creación de enemigos en un videojuego.

### [Ejercicio 37: Enemy Factory](./Ejercicio37)

**Descripción**: Implementación básica del patrón Abstract Factory para crear diferentes tipos de enemigos en un videojuego (brujas y demonios) con características específicas según el mundo en el que aparecen.

**Objetivos**:
- Crear familias de objetos relacionados mediante Abstract Factory
- Implementar diferentes fábricas para cada mundo/nivel
- Configurar características de enemigos según su mundo
- Asegurar la coherencia de propiedades dentro de cada mundo

**Características**:
- Dos tipos de enemigos: Demonios y Brujas
- Dos mundos con diferentes características para cada enemigo
- Factores de complejidad por nivel

### [Demon Factory: Abstract Factory + Singleton](./demonfactory)

**Descripción**: Extensión del Ejercicio 37 que combina el patrón Abstract Factory con el patrón Singleton para permitir la generación aleatoria de enemigos con diferentes probabilidades según el mundo.

**Objetivos**:
- Aplicar el patrón Singleton para asegurar una instancia única de GameController
- Implementar generación aleatoria de enemigos con proporciones específicas:
    - Mundo 1: 50/50 entre demonios y brujas
    - Mundo 2: 30/70 entre demonios y brujas
- Verificar estadísticamente que se cumplen las proporciones
- Identificar los componentes de cada patrón

**Mejoras sobre el Ejercicio 37**:
- Adición del patrón Singleton
- Implementación de generación probabilística
- Verificación estadística de resultados

---

## 💡 Ventajas del Patrón Abstract Factory

1. **Aislamiento de clases concretas**: El cliente manipula instancias a través de interfaces abstractas
2. **Intercambio de familias de productos**: Cambiar de fábrica afecta a toda la familia de productos
3. **Consistencia entre productos**: Los objetos de una misma familia están diseñados para trabajar juntos
4. **Escalabilidad**: Facilita la adición de nuevos tipos de productos o familias
5. **Principio Open/Closed**: Permite extender el sistema sin modificar el código existente

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