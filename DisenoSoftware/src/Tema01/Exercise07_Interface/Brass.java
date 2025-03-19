/**
 * Tema01 - Exercise07_Interface
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise07_Interface;

public class Brass implements Instrument, ElectricSound {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public void electricPlay(Note note) {
        System.out.println("ElectricSound.Brass.play() " + note);
    }

    @Override
    public String what() {
        return "Brass";
    }
}
