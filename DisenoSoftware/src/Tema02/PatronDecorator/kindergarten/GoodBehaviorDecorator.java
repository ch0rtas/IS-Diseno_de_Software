package Tema02.PatronDecorator.kindergarten;

/**
 * Patrón Decorator (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.16
 * @course INSO 2 - Diseño de Software
 */


public class GoodBehaviorDecorator extends BabyDecorator {

    public GoodBehaviorDecorator(Baby baby) {
        super(baby);
    }

    /**
     * Añade a la descripción el texto de que el niño tiene
     * el “certificado de buena conducta” (usó el baño).
     */
    @Override
    public String getDescription() {
        return baby.getDescription() + " con premio de buena conducta pañal";
    }
}
