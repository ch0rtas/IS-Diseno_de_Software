/**
 * Tema01 - Exercise06_Instrument
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise06_Instrument;

// (a) Clase abstracta base para instrumentos
public abstract class Instrument {
    // Método abstracto que será implementado por las subclases
    public abstract void play(Note note);

    // Método común para describir el instrumento
    public String what() {
        return "Instrument";
    }
}
