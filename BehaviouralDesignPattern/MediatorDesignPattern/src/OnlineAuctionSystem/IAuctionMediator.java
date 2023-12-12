package OnlineAuctionSystem;

public interface IAuctionMediator {
    public void addBidder(IBidder bidder);
    public void removeBidder(IBidder bidder);
    public void placeBid(IBidder bidder, int amount);
}
