/**
 * Tema01 - Exercise01_EngineBasics
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise01_EngineBasics;

// Clase Engine: Solución que incluye los puntos 1.a, 1.c y 1.d
public class Engine {
    // a. Atributo privado que almacena el tipo de motor
    private String tipo;

    // c. Constante con el valor por defecto para el tipo
    public static final String TYPE_DEFAULT_VALUE = "N/A";

    // a. Constructor con parámetro para inicializar el tipo de motor
    public Engine(String tipo) {
        super(); // Llama al constructor de la clase padre
        this.tipo = tipo; // Inicializa el atributo tipo
    }

    // c. Constructor sin parámetros que utiliza el valor por defecto
    public Engine() {
        this(Engine.TYPE_DEFAULT_VALUE); // Llama al constructor con parámetro usando el valor por defecto
    }

    // a. Método para encender el motor, imprime un mensaje en la consola
    public void encender() {
        System.out.println(this.tipo + " encendido!");
    }

    // d. Sobrescritura del método toString para mostrar información del objeto
    @Override
    public String toString() {
        return "Engine [tipo=" + this.tipo + "]";
    }

    // c. Método main para pruebas
    public static void main(String[] args) {
        // b. Crear una instancia de la clase Engine con el tipo 'eléctrico'
        Engine engine = new Engine("eléctrico");

        // b. Llamar al método encender para mostrar el mensaje
        engine.encender();
    }
}
