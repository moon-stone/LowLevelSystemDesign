package Observable;

import Observer.INotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class MacbookStockObservable implements IStockObservable{
    private List<INotificationObserver> observersList;
    private int macbookCount;

    public MacbookStockObservable(int macbookCount){
        this.macbookCount = macbookCount;
        observersList = new ArrayList<>();
    }
    @Override
    public void addObserver(INotificationObserver notificationObserver) {
        observersList.add(notificationObserver);
    }

    @Override
    public void removeObserver(INotificationObserver notificationObserver) {
        observersList.remove(notificationObserver);
    }

    @Override
    public void setData(int data) {
        int previousStateData = this.macbookCount;
        this.macbookCount = data;
        if(previousStateData == 0){
            System.out.println("Notify all the observers of Macbook");
            notifyObservers();
        }
    }

    @Override
    public void notifyObservers() {
        for(INotificationObserver observer : observersList){
            observer.UpdateObservers();
        }
    }

    @Override
    public int getData() {
        return this.macbookCount;
    }
}
