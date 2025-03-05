package Tema02.PatronObserver;

public class ComprasDepartmentObserver implements PullPushObserver {

    @Override
    public void update(PullPushModelObservable observable, Object arg) {
        if (observable instanceof BookAlarm) {
            BookAlarm alarm = (BookAlarm) observable;

            if (arg instanceof Book) {
                System.out.println("[ComprasDepartmentObserver Push] se ha devuelto el libro en mal estado");
                System.out.println(arg);
            } else {
                System.out.println("[ComprasDepartmentObserver Pull] se ha devuelto el libro en mal estado");
                System.out.println(alarm.getLastBadBook());
            }
        }
    }
}
