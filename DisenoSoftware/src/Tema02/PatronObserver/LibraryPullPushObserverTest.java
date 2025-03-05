package Tema02.PatronObserver;

public class LibraryPullPushObserverTest {
    public static void main(String[] args) {
        Library library = new Library();

        //TODO Instancia los departamentos Stock, Admin y Compras como observadores
        StockDepartmentObserver stockObserver = new StockDepartmentObserver();
        AdminDepartmentObserver adminObserver = new AdminDepartmentObserver();
        ComprasDepartmentObserver comprasObserver = new ComprasDepartmentObserver();

        //TODO provoca que los departamentos se suscriban a la biblioteca
        library.getBookAlarm().attach(stockObserver);
        library.getBookAlarm().attach(adminObserver);
        library.getBookAlarm().attach(comprasObserver);

        Book bookBad = new Book("Programar sin patrones", "desconocido", BookState.BAD);
        Book bookGood = new Book("Gang of four Design patterns", "Erich Gamma, Richard Helm", BookState.GOOD);

        System.out.println("Alarma notifica bajo protocolo PULL-PUSH");
        // Este libro está en buen estado, no notifica nada
        library.returnBook(bookGood);
        // Este libro está en mal estado, dispara las notificaciones
        library.returnBook(bookBad);

        //TODO provoca que el departamento de compras borre su suscripción
        library.getBookAlarm().detach(comprasObserver);

        System.out.println("Alarma vuelve a notificar bajo protocolo PULL-PUSH");
        Book otherBookBad = new Book("Programar sin pensar", "desconocido", BookState.BAD);
        library.returnBook(otherBookBad);
    }
}
