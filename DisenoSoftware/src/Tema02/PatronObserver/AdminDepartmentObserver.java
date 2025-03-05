package Tema02.PatronObserver;

public class AdminDepartmentObserver implements PullPushObserver {

    @Override
    public void update(PullPushModelObservable observable, Object arg) {
        if (observable instanceof BookAlarm) {
            BookAlarm alarm = (BookAlarm) observable;

            if (arg instanceof Book) {
                System.out.println("[AdminDepartmentObserver Push] se ha devuelto el libro en mal estado");
                System.out.println(arg);
            } else {
                System.out.println("[AdminDepartmentObserver Pull] se ha devuelto el libro en mal estado");
                System.out.println(alarm.getLastBadBook());
            }
        }
    }
}
