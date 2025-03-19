/**
 * Tema01 - Exercise07_Interface
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise07_Interface;

public class MusicTest {
    static void tune(Instrument instrument) {
        instrument.play(Note.DO);
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
