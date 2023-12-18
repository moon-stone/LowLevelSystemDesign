package Observer;
import Observable.IStockObservable;
public class EmailNotification implements INotificationObserver{
    private String emailId;
    private final IStockObservable stockObservable;

    public EmailNotification(String emailId, IStockObservable stockObservable){
        this.emailId = emailId;
        this.stockObservable = stockObservable;
        stockObservable.addObserver(this);
    }

    @Override
    public void UpdateObservers() {
        if(stockObservable.getData() > 0){
            sendNotificationOnEmail(stockObservable.getData()+" Macbook is available to purchase ");
        }
    }

    private void sendNotificationOnEmail(String msg) {
        System.out.println(msg+ "sent on emailId : " + emailId);
    }
}
