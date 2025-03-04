package Tema02.PatronStrategy.solucion1;

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
