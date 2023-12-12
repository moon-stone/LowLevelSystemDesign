package OnlineAuctionSystem;

public class Main {
    public static void main(String[] args){
        IAuctionMediator auctionMediatorObj = new CricketAuction();
        IBidder bidderTeam1 = new Bidder("RCB", auctionMediatorObj);
        IBidder bidderTeam2 = new Bidder("MI", auctionMediatorObj);

        bidderTeam1.placeBid(50000);
        bidderTeam2.placeBid(100000);
    }
}
