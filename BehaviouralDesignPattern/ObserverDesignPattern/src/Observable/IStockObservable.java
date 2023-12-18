package Observable;
import Observer.INotificationObserver;

public interface IStockObservable {
    public void addObserver(INotificationObserver notificationObserver);
    public void removeObserver(INotificationObserver notificationObserver);
    public void setData(int data);
    public void notifyObservers();
    public int getData();
}
