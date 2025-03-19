/**
 * Tema04 - Exercise05_Polimorfismo
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise05_Polimorfismo;

// 5.a
public class FormaDeJuego {
    public void muestraFigura() {
        System.out.println("Mostrando forma");
    }

    public static void main(String[] args) {
        // 5.c: Crear un objeto de tipo FormaDeJuego con instancia PiezaDeJuego
        FormaDeJuego figura = new PiezaDeJuego();

        // 5.e: Crear un objeto de tipo PiezaDama
        PiezaDama piezaDama = new PiezaDama();

        // Llamadas para mostrar comportamiento
        figura.muestraFigura(); // Mostrando forma
        muestraFigura(figura);  // Mostrando forma
        muestraFigura(piezaDama); // Mostrando Dama
    }

    // 5.f: Método estático para mostrar figura de cualquier FormaDeJuego
    public static void muestraFigura(FormaDeJuego formaDeJuego) {
        formaDeJuego.muestraFigura(); // Delegación por inyección
    }
}
