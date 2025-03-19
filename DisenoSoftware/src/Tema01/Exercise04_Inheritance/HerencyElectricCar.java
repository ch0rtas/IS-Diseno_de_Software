/**
 * Tema04 - Exercise04_Inheritance
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema04.Exercise04_Inheritance;

// Importación de la clase Car y Engine
import Tema03.Exercise03_Aggregation.Car;
import Tema01.Exercise01_EngineBasics.Engine;

public class HerencyElectricCar extends Car {
    // 4.a Constructor de la clase HerencyElectricCar
    // Este constructor recibe marca, modelo y color como parámetros
    public HerencyElectricCar(String marca, String modelo, String color) {
        super(marca, modelo, color, new Engine("eléctrico")); // Llama al constructor de la clase padre Car
    }

    // Método main para crear el objeto HerencyElectricCar y probar sus métodos
    public static void main(String[] args) {
        // 4.b Crear un objeto Car, que es una instancia de HerencyElectricCar
        Car electricCar = new HerencyElectricCar("Tesla", "Model3", "rojo");

        // Llamar a los métodos del coche
        electricCar.encender(); // Encender el motor eléctrico
        electricCar.avanzar();  // Mostrar mensaje de avance
    }
}
