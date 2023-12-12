package OnlineAuctionSystem;

public class Bidder implements IBidder{
    private final String name;
    IAuctionMediator auctionMediator;

    Bidder(String name, IAuctionMediator auctionMediator){
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }
    @Override
    public void receiveNotificationBid(int amount) {
        System.out.println("Team " +this.name + " get the notification of bid amount : " +amount);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this, amount);
    }
}
