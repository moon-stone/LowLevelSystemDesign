package OnlineAuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class CricketAuction implements IAuctionMediator{
    private List<IBidder> bidders;
    CricketAuction(){
        bidders = new ArrayList<IBidder>();
    }
    @Override
    public void addBidder(IBidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void removeBidder(IBidder bidder) {
        bidders.remove(bidder);
    }

    @Override
    public void placeBid(IBidder bidder, int amount) {
        System.out.println("Bid place successfully by "+bidder.getName()+ " of amount : " +amount);
        for(IBidder tempBidder : bidders){
            if(!tempBidder.getName().equals(bidder.getName())){
                tempBidder.receiveNotificationBid(amount);
            }
        }
    }
}
