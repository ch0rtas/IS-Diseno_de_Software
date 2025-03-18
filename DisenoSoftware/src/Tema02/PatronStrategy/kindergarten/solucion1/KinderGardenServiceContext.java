package Tema02.PatronStrategy.kindergarten.solucion1;

/**
 * Patrón Strategy (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.02.15
 * @course INSO 2 - Diseño de Software
 */


public class KinderGardenServiceContext implements ServiceStrategy {
    private ServiceStrategy serviceStrategy;

    public KinderGardenServiceContext(ServiceStrategy serviceStrategy) {
        super();
        this.serviceStrategy = serviceStrategy;
    }
    public ServiceStrategy getServiceStrategy() {
        return serviceStrategy;
    }
    public void setServiceStrategy(ServiceStrategy serviceStrategy) {
        this.serviceStrategy = serviceStrategy;
    }
    public void applyServiceStrategy() {
        this.serviceStrategy.applyServiceStrategy();
        // Delegación por composición (agregación)
    }
}
