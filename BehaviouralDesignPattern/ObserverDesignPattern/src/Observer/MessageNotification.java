package Observer;
import Observable.IStockObservable;

public class MessageNotification implements INotificationObserver{
    private String phoneNo;
    private final IStockObservable stockObservable;

    public MessageNotification(String phoneNo, IStockObservable stockObservable){
        this.phoneNo = phoneNo;
        this.stockObservable = stockObservable;
        stockObservable.addObserver(this);
    }

    @Override
    public void UpdateObservers() {
        if(stockObservable.getData() > 0){
            sendNotificationOnPhone(stockObservable.getData()+" Macbook is available in stock to purchase");
        }
    }

    private void sendNotificationOnPhone(String msg) {
        System.out.println(msg +"sent on PhoneNo : "+phoneNo);
    }
}
