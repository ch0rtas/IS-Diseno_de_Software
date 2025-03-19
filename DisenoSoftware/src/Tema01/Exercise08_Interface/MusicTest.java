/**
 * Tema01 - Exercise08_Interface
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise08_Interface;

import Tema01.Exercise07_Interface.Wind;
import Tema01.Exercise07_Interface.Percussion;
import Tema01.Exercise07_Interface.Woodwind;
import Tema01.Exercise07_Interface.Note;
import Tema01.Exercise07_Interface.Instrument;
import Tema01.Exercise07_Interface.ElectricSound;

public class MusicTest {

    static void tune(Instrument instrument) {
        instrument.play(Note.DO);
        // Si el instrumento tiene comportamiento eléctrico, se invoca electricPlay
        if (instrument instanceof ElectricSound) {
            ((ElectricSound) instrument).electricPlay(Note.MI);
        }
    }

    static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Woodwind(),
                new Brass()
        };

        tuneAll(orchestra);
    }
}
