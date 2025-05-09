/**
 * Tema03 - Exercise03_Aggregation
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise03_Aggregation;

// Importación de la clase ElectricCar y Engine
import Tema01.Exercise02_Composition.ElectricCar;
import Tema01.Exercise01_EngineBasics.Engine;

public class Car {
    // a. Atributos de la clase Car
    private String marca;  // Atributo para la marca del coche
    private String modelo; // Atributo para el modelo del coche
    private String color;  // Atributo para el color del coche
    private Engine engine; // Relación de agregación con la clase Engine (un coche tiene un motor)

    // b. Constructor de la clase Car que acepta marca, modelo, color y un objeto Engine
    public Car(String marca, String modelo, String color, Engine engine) {
        super(); // Llama al constructor de la clase padre (Object)
        this.marca = marca;  // Inicializa el atributo marca
        this.modelo = modelo; // Inicializa el atributo modelo
        this.color = color;  // Inicializa el atributo color
        this.engine = engine; // Asocia el motor al coche (agregación)
    }

    // a. Método para encender el motor del coche (delegación del comportamiento al objeto Engine)
    public void encender() {
        this.engine.encender(); // Llama al método encender del motor
    }

    // b. Método para hacer avanzar el coche, mostrando los detalles del coche
    public void avanzar() {
        System.out.println(this.marca + "," + this.modelo + "," + this.color + " avanzando...");
    }

    // Método main para probar la creación y uso de la clase Car
    public static void main(String[] args) {
        // b. Crear un objeto Engine con el tipo 'eléctrico'
        Engine electricEngine = new Engine("eléctrico");

        // b. Crear un coche (Car) de marca Tesla, modelo Model3 y color rojo, utilizando el motor eléctrico
        Car electricCar = new Car("Tesla", "Model3", "rojo", electricEngine);

        // Reutilización de los métodos de ElectricCar sin necesidad de repetir el código

        // b. Llamar al método encender del coche (delegación al motor eléctrico)
        electricCar.encender(); // Enciende el motor eléctrico

        // b. Llamar al método avanzar del coche
        electricCar.avanzar();  // Muestra el mensaje de que el coche está avanzando
    }
}
