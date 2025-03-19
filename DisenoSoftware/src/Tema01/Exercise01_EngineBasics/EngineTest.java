/**
 * Tema01 - Exercise01_EngineBasics
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise01_EngineBasics;

// Clase de pruebas para la clase Engine
public class EngineTest {
    public static void main(String[] args) {
        // b. Crear una instancia de la clase Engine con el tipo 'eléctrico'
        Engine engine = new Engine("eléctrico");

        // b. Llamar al método encender para mostrar el mensaje
        engine.encender();

        // Prueba del constructor sin parámetros
        Engine defaultEngine = new Engine();

        // Mostrar el resultado del método toString
        System.out.println(defaultEngine.toString());
    }
}
