/**
 * Tema01 - Exercise06_Instrument
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.19
 * @course INSO 2 - Diseño de Software
 */
package Tema01.Exercise06_Instrument;

public class MusicTest {
    // (b) Método para afinar un instrumento
    static void tune(Instrument instrument) {
        instrument.play(Note.DO);

        // (d) Si el instrumento es eléctrico, reproducir sonido electrónico
        if (instrument instanceof ElectricSound) {
            ElectricSound electric = (ElectricSound) instrument;
            electric.electricPlay(Note.MI);
        }
    }

    // (b) Método para afinar todos los instrumentos
    static void tuneall(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // (b) Creación de la banda de instrumentos
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Woodwind(),
                new Brass()
        };

        // Afinar todos los instrumentos
        tuneall(orchestra);
    }
}
