/**
 * Tema01 - Exercise08_Interface
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise08_Interface;

import Tema01.Exercise07_Interface.Instrument;
import Tema01.Exercise07_Interface.ElectricSound;
import Tema01.Exercise07_Interface.Note;

public class Brass implements Instrument, ElectricSound {

    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public void electricPlay(Note note) {
        // Muestra la nota recibida + " eléctrico"
        System.out.println(note + " eléctrico");
    }

    @Override
    public String what() {
        return "Brass";
    }
}
