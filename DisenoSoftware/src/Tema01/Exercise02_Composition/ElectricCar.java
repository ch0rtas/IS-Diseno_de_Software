/**
 * Tema01 - Exercise02_Composition
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise02_Composition;

// Importación de la clase Engine
import Tema01.Exercise01_EngineBasics.Engine;

public class ElectricCar {
    // a. Atributos de la clase ElectricCar
    private String marca;   // Atributo marca
    private String modelo;  // Atributo modelo
    private String color;   // Atributo color

    // b. Relación de composición: ElectricCar tiene un motor (Engine)
    private Engine engine; // Atributo que representa el motor (composición)

    // c. Constructor con parámetros para inicializar los atributos
    public ElectricCar(String marca, String modelo, String color) {
        super(); // Llama al constructor de la clase padre (Object)
        this.marca = marca;   // Inicializa el atributo marca
        this.modelo = modelo; // Inicializa el atributo modelo
        this.color = color;   // Inicializa el atributo color
        this.engine = new Engine("eléctrico"); // Crea un motor eléctrico para el coche (relación de composición)
    }

    // d. Método para encender el motor, delegando el comportamiento al motor
    public void encender() {
        this.engine.encender(); // Delegación por composición: llama al método encender del motor
    }

    // e. Método para avanzar, muestra un mensaje con los datos del coche
    public void avanzar() {
        System.out.println(this.marca + "," + this.modelo + "," + this.color + " avanzando..."); // Muestra un mensaje de avance
    }

    // f. Sobrescritura del método toString() para mostrar la información del coche
    @Override
    public String toString() {
        return "ElectricCar [marca=" + this.marca + ", modelo=" + this.modelo +
                ", color=" + this.color + ", engine=" + this.engine + "]";
    }

    // g. Método avanzar usando la representación toString() del objeto
    public void avanzarConToString() {
        System.out.println(this.toString() + " avanzando..."); // Usa la representación toString() para imprimir el mensaje
    }

    // h. Método main para crear un coche eléctrico y probar los métodos
    public static void main(String[] args) {
        // i. Crear un objeto ElectricCar con marca Tesla, modelo Model3, y color rojo
        ElectricCar electricCar = new ElectricCar("Tesla", "Model3", "rojo");

        // j. Llamar a los métodos para encender y avanzar
        electricCar.encender();      // Llama al método encender del motor eléctrico
        electricCar.avanzar();       // Muestra el mensaje de avance con los detalles del coche
        electricCar.avanzarConToString(); // Muestra el mensaje de avance usando toString()
    }
}
