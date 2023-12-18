import Observable.IStockObservable;
import Observable.MacbookStockObservable;
import Observer.EmailNotification;
import Observer.INotificationObserver;
import Observer.MessageNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EcommerceSite {
    public static void main(String[] args) {
        //observable
        IStockObservable macbookStockObservable = new MacbookStockObservable(0);

        //observer
        INotificationObserver emailObserver1 = new EmailNotification("abc@gamil.com", macbookStockObservable);
        INotificationObserver emailObserver2 = new EmailNotification("xyz@gmail.com", macbookStockObservable);
        INotificationObserver msgObserver1 = new MessageNotification("1234567890", macbookStockObservable);

        macbookStockObservable.setData(10);

    }
}