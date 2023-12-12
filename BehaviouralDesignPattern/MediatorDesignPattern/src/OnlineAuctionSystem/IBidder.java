package OnlineAuctionSystem;

public interface IBidder {
    public void receiveNotificationBid(int amount);
    public String getName();
    public void placeBid(int amount);
}
