/**
 * Tema04 - Exercise05_Polimorfismo
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise05_Polimorfismo;

// 5.e y 5.g: Clase PiezaDama que extiende PiezaDeJuego
public class PiezaDama extends PiezaDeJuego {
    @Override
    public void muestraFigura() {
        System.out.println("Mostrando Dama");
    }
}
